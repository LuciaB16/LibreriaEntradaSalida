package com.lucia.io;

import javax.swing.*;
import java.util.Scanner;

public class EntradaSalida {
    /**
     * Opcion CONSOLA
     */
    public static final int SALIDA_CONSOLA = 1;
    public static final int SALIDA_WINDOW = 2;

    public  static final int SALIDA_IMPRESORA = 3;

    /**
     * Salida por ventana o consola de un mensaje
     * @param msj cadena que queremos imprimir
     * @param device dispositivo de salida, consola (SALIDA_CONSOLA) o ventana (SALIDA_VENTANA) que queremos utilizar para imprimir
     * @return si es True: correcto sino es false
     */
    public static boolean salida(String msj, int device){
        switch (device){
            case SALIDA_CONSOLA:
                //TODO: try catch
                try {
                    System.out.println("Consola: " + msj);
                    return true;
                }catch (Exception e){
                    return false;
                }
            case SALIDA_WINDOW:
                try {
                    JOptionPane.showMessageDialog(null, "Sale por una ventana" + msj.toCharArray()[20]);
                    return true;
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    return false;
                }
                /*case SALIDA_IMPRESORA:
                    {
                        return true; }// imprimir}*/
            default:
                return false;

            //Commit metodo de salida
        }
    }
    public  static String entrada(String mensaje){
        Scanner sc= new Scanner(System.in);
        return "";
    }

    /**
     * Introduccion por consola de una cadena de trxto
     * @param mensaje para que el usuario sepa lo que tiene que escribir
     * @return cadena de texto introducida por el usuario
     */
    public static String entradaString(String mensaje){
        Scanner obx =new Scanner(System.in); //Creo un objeto scanner
        System.out.println(mensaje);
        String data=obx.nextLine(); //Leo input del usuario
        //respuesta.respuestaString=data;
        return data;
    }

    public static int entradaString2 (String mensaje){
        int edad;
        Scanner obx1 = new Scanner(System.in);

        try{
            System.out.println(mensaje);
            edad=obx1.nextInt();
            return edad;

        }catch (Exception e){
            edad=0;
            System.out.println("Introduce tu edad (numero)");
            return edad;
        }
    }

    public static Integer entradaInt(String mensaje){
        Scanner obx2 = new Scanner(System.in);
        System.out.println(mensaje);
        try{
            Integer numero =obx2.nextInt();
            return numero;
        }catch (Exception e){
            return null;
        }
    }


    public static Float entradaFloat(String mensaje) {
        Scanner obx = new Scanner(System.in);
        System.out.println(mensaje);
        try {
            Float numero = obx.nextFloat();
            return numero;
        } catch (Exception e) {
            return null;
        }
    }
}
