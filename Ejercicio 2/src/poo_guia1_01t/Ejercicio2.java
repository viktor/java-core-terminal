package poo_guia1_01t;


import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio2 {

    //PARA PODER USAR ESTE PROGRAMA VAMOS A USAR EL ARCHIVO BANCO.TXT QUE ESTA EN LA CARPETA DEL PROYECTO.
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //DECLARACION DE VARIABLES
        String inputCuenta, inputRetiro, inputConsigna, inputDestino, inputTransferencia, menu;
        int saldo = 0, cuenta = 0, retiro = 0, consigna = 0, transferencia = 0, saldoDestino = 0, destino = 0, numLinea;
        boolean cuentaencontrada = false, destinoencontrado = false;

        File archivo = new File("banco.txt");

        JOptionPane.showMessageDialog(null, "¡Bienvenido, Ingrese su Tarjeta.!",
                "Bienvenido", JOptionPane.INFORMATION_MESSAGE);

        //INGRESO Y VALIDACION DE NUMERO DE CUENTA
        do {
            inputCuenta = JOptionPane.showInputDialog(null, "Ingrese su Número de Cuenta.",
                    "Entrada", JOptionPane.QUESTION_MESSAGE);

            if (inputCuenta == null) {
                System.exit(0);
            }
//VALIDACIONES DE SOLO INGRESAR NUMEROS EN LA CUENTA
            try {
                cuenta = Integer.parseInt(inputCuenta);
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros.",
                        "Alerta", JOptionPane.WARNING_MESSAGE);
                continue;
            }
//VALIDACION DE SOLO INGRESAR NUMEROS POSITIVOS EN LA CUENTA
            if (cuenta < 0) {
                JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros positivos.",
                        "Alerta", JOptionPane.WARNING_MESSAGE);
                continue;
            }
//SCANNER PARA LEER LINEA POR LINEA Y SI LA CUENTA ES ENVONTRADA NOTIFICARLO 
            try (Scanner scanner = new Scanner(archivo)) {
                while (scanner.hasNextLine()) {
                    numLinea = 0;
                    String linea = scanner.nextLine();
                    numLinea++;
                    if (linea.contains(inputCuenta)) {
                        String[] registro = linea.split(",");
                        saldo = Integer.parseInt(registro[1]);
                        cuentaencontrada = true;
                    }
                }
            }
          //VALIDACIÓN DE LA CUENTA SI EXISTE O NO.
            if (cuentaencontrada == false) {
                JOptionPane.showMessageDialog(null, "El número de cuenta es invalido o no existe.",
                        "Alerta", JOptionPane.WARNING_MESSAGE);
            }

        } while (cuentaencontrada == false);

        //INGRESO DE MENU Y VALIDACIONES USANDO TRY CATCH PARA CADA OPCION.
        do {
            menu = JOptionPane.showInputDialog(null, "Opciones: \n"
                    + "1. Consulta de Saldo\n"
                    + "2. Retiros\n"
                    + "3. Consignaciones\n"
                    + "4. Transferencias\n"
                    + "5. Salir\n",
                    "Menu", JOptionPane.QUESTION_MESSAGE);
            if (menu == null) {
                System.exit(0);
            }
//VERIFICACION DE SALDO DE LA CUENTA EN USO
            switch (menu) {
                case "1": //CASE DE CONSULTA DE SALDO
                    saldo = verificarsaldo(archivo, inputCuenta);
                    JOptionPane.showMessageDialog(null, "El saldo actual de la cuenta "
                            + cuenta + " es de $" + saldo,
                            "Consulta de Saldo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "2": //CASE DE RETIROS
                    //ACTUALIZACION DEL TXT CUANDO EL USUARIO REALIZE UNA VERIFICACION DE SALDO.
                    while (true) {
                        saldo = verificarsaldo(archivo, inputCuenta);
                        inputRetiro = JOptionPane.showInputDialog(null, "Saldo disponible: $"
                                + saldo + "\n Ingrese cantidad a retirar: ",
                                "Retiro", JOptionPane.QUESTION_MESSAGE);

                        
                        //CANCEL, EN UN CASO EL USUARIO CANCELE EL PROGRAMA NO SE QUIEBRA.
                        if (inputRetiro == null) {
                            break;
                        } //RECIBIMIENTOS DE DATOS PARA REALIZAR EL RETIRO Y SUS RESPECTIVAS VALIDACIONES CON EL METODO TRY CATCH
                        try {
                            retiro = Integer.parseInt(inputRetiro);
                        } catch (NumberFormatException error) {
                            JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros.",
                                    "Alerta", JOptionPane.WARNING_MESSAGE);
                            continue;
                        } //SI LA CANTIDAD A RETIRAR ES NEGATIVA SALTAR MENSAJE
                        if (retiro < 0) {
                            JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros positivos.",
                                    "Alerta", JOptionPane.WARNING_MESSAGE);
                            continue;
                        } //EN CASO DE NO TENER LOS FONDOS SUFICIENTE MOSTRAR EL MENSAJE RESPECTIVO
                        if (retiro > saldo) {
                            JOptionPane.showMessageDialog(null, "Fondos Insuficientes",
                                    "Alerta", JOptionPane.WARNING_MESSAGE);
                            continue;
                        }
                        break;
                    }
                    actualizarcuenta(archivo, inputCuenta + "," + saldo, inputCuenta + "," + String.valueOf(saldo - retiro));
                    //CANCELACION DEL USUARIO EN CASO DE NO REALIZAR NADA, DEVOLVERA AL MENU PRINCIPAL
                    if (inputRetiro == null) {
                            break;
                        }// EN CASO DE HACER TODAS LAS VALIDACIONES RESPECTIVAS MOSTRAR EL RETIRO EXITOSO.
                    JOptionPane.showMessageDialog(null, "Retiro Exitoso.",
                            "Retiro", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "3"://CASE DE CONSIGNAS
                    while (true) {
                        saldo = verificarsaldo(archivo, inputCuenta);
                        inputConsigna = JOptionPane.showInputDialog(null, "Saldo disponible: $"
                                + saldo + "\n Ingrese cantidad a consignar: ",
                                "Consigna", JOptionPane.QUESTION_MESSAGE);

                        //CANCELACION DEL USUARIO EN CASO DE NO REALIZAR NADA, DEVOLVERA AL MENU PRINCIPAL.
                        if (inputConsigna == null) {
                            break;
                        }
                        try {
                            consigna = Integer.parseInt(inputConsigna);
                        } catch (NumberFormatException error) {
                            JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros.",
                                    "Alerta", JOptionPane.WARNING_MESSAGE);
                            continue;
                        } //VALIDAR QUE LA CONSIGA SEA MAYOR QUE 0 
                        if (consigna < 0) {
                            JOptionPane.showMessageDialog(null, "La consigna debe ser mayor a 0.",
                                    "Alerta", JOptionPane.WARNING_MESSAGE);
                            continue;
                        }
                        break;
                    }
                    actualizarcuenta(archivo, String.valueOf(cuenta) + "," + saldo, inputCuenta + "," + String.valueOf(saldo + consigna));
                      //CANCELACION DEL USUARIO EN CASO DE NO REALIZAR NADA, DEVOLVERA AL MENU PRINCIPAL.
                    if (inputConsigna == null) {
                            break;
                        }//AL REALIZAR LA CONSIGANA MOSTRAR EL MENSAJE DE EXITO.
                    JOptionPane.showMessageDialog(null, "Consigna Exitosa.",
                            "Consigna", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "4"://CASE DE TRANSFERENCIA.
                    do {
                        saldo = verificarsaldo(archivo, inputCuenta);
                        inputDestino = JOptionPane.showInputDialog(null, "Saldo disponible: $"
                                + saldo + "\n Ingrese cuenta de destino: ",
                                "Transferencia", JOptionPane.QUESTION_MESSAGE);

                        //CANCELACION DEL USUARIO EN CASO DE NO REALIZAR NADA, DEVOLVERA AL MENU PRINCIPAL.
                        if (inputDestino == null) {
                            break;
                        }//VALIDACION DE LOS DATOS A LA CUENTA DE DESTINO
                        if (inputDestino.equals(inputCuenta)) {
                            JOptionPane.showMessageDialog(null, "La cuenta de destino no puede ser la misma de origen.",
                                    "Alerta", JOptionPane.WARNING_MESSAGE);
                            continue;
                        }
                        try {
                            destino = Integer.parseInt(inputDestino);
                        } catch (NumberFormatException error) {
                            JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros.",
                                    "Alerta", JOptionPane.WARNING_MESSAGE);
                            continue;
                        }
                        if (destino < 0) {
                            JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros positivos.",
                                    "Alerta", JOptionPane.WARNING_MESSAGE);
                            continue;
                        }

                try (Scanner scanner = new Scanner(archivo)) {//SCANNER PARA LEER LINEA POR LINEA Y ENCONTRAR LA CUENTA DE DESTINO
                    while (scanner.hasNextLine()) {
                        numLinea = 0;
                        String linea = scanner.nextLine();
                        numLinea++;
                        if (linea.contains(inputDestino)) {
                            String[] registroDestino = linea.split(",");
                            saldoDestino = Integer.parseInt(registroDestino[1]);
                            destinoencontrado = true;
                        }
                    }
                }

                        if (destinoencontrado == false) {
                            JOptionPane.showMessageDialog(null, "El número de cuenta es invalido o no existe.",
                                    "Alerta", JOptionPane.WARNING_MESSAGE);
  
                        }
                    } while (!destinoencontrado);
                    
                    if (inputDestino == null) {
                            break;
                        }

                    if (destinoencontrado == true) {//WHILE PARA REALIZAR LA VALIDACION DE LA CANTIDAD A TRANSFERIR
                        while (true) {
                            saldo = verificarsaldo(archivo, inputCuenta);
                            inputTransferencia = JOptionPane.showInputDialog(null, "Saldo disponible: $"
                                    + saldo + "\n Ingrese cantidad a transferir: ",
                                    "inputTransferencia", JOptionPane.QUESTION_MESSAGE);

                            if (inputTransferencia == null) {
                                break;
                            }
                            try {//VALIDACION DE NUMEROS 
                                transferencia = Integer.parseInt(inputTransferencia);
                            } catch (NumberFormatException error) {
                                JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros.",
                                        "Alerta", JOptionPane.WARNING_MESSAGE);
                                continue;
                            }
                            if (transferencia < 0) {//REALIZAR TRANSFERENECIA MAYOR QUE 0
                                JOptionPane.showMessageDialog(null, "La transferencia debe ser mayor a 0.",
                                        "Alerta", JOptionPane.WARNING_MESSAGE);
                                continue;
                            }
                            if (transferencia > saldo) {//SI LA CUENTA NO TIENE LA CANTIDAD SUFICIENTE MOSTRAR.
                                JOptionPane.showMessageDialog(null, "Fondos Insuficientes",
                                        "Alerta", JOptionPane.WARNING_MESSAGE);
                                continue;
                            }
                            break;
                        }
                       if (inputTransferencia == null) {
                          break;
                    }//ACTUALIZAR LA TRANSFERENCIA Y A LA MISMA VEZ EL ARCHIVO CON SU SALDO DE LA CUENTA.
                        actualizarcuenta(archivo, String.valueOf(cuenta) + "," + saldo, String.valueOf(cuenta) + "," + String.valueOf(saldo - transferencia));
                        actualizarcuenta(archivo, String.valueOf(destino) + "," + saldoDestino, String.valueOf(destino) + "," + String.valueOf(saldoDestino + transferencia));
                        JOptionPane.showMessageDialog(null, "Transferencia Exitosa.",
                                "Transferencia", JOptionPane.INFORMATION_MESSAGE);
                    }

                    break;

                case "5"://CASE DE SALIDA.
                    int reply = JOptionPane.showConfirmDialog(null, "Seguro que desea salir del grandioso programa?",
                            "Salir", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Ingeniero es un gusto explicarle el ejercicio, hasta pronto.",
                                "Salir", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    } else {
                        JOptionPane.showMessageDialog(null, "Regresando a menu.",
                                "Salir", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Por favor ingrese una opción valida del 1 al 5.",
                            "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

        } while (menu != "6");//CASE DE MENU 

    }

    //METODO PARA ACTUALIZAR CUENTA DADO DATO VIEJO Y DATO NUEVO - NO REGRESA NADA, SINO QUE EJECUTA EL WRITE AL DOCUMENTO DE TEXTP
    public static void actualizarcuenta(File file, String viejo, String nuevo) throws IOException {
        String contenido;
        try (Scanner scanner = new Scanner(file)) {
            StringBuilder buffer = new StringBuilder();
            while (scanner.hasNextLine()) {
                StringBuilder append = buffer.append(scanner.nextLine()).append(System.lineSeparator());
            }   contenido = buffer.toString();
        }
        contenido = contenido.replaceAll(viejo, nuevo);
        FileWriter escritor = new FileWriter(file);
        escritor.append(contenido);
        escritor.flush();
    }

    //METODO PARA VERIFICAR EL SALDO DE LA CUENTS
    public static int verificarsaldo(File file, String cuenta) throws FileNotFoundException {

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                int numLinea = 0;
                String linea = scanner.nextLine();
                numLinea++;
                if (linea.contains(cuenta)) {
                    String[] registro = linea.split(",");
                    return Integer.parseInt(registro[1]);
                }
                
            }
        }
        return 0;
    }
}
