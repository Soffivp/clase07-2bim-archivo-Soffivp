package escritura01;

import java.util.Scanner;


public class PruebaCrearArchivoTexto {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";
        
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
                boolean bandera = true;
        String opcion;
        while (bandera) {
            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su apellido");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese su edad");
            int edad = entrada.nextInt();
            System.out.println("Para ingresar más registros presione s, para terminar presione n");
            entrada.nextLine();
            opcion = entrada.nextLine();
            opcion = opcion.toLowerCase();
            if (opcion.equals("n")) {
                bandera = false;
            }

            cadenaFinal = String.format("%s%s %s %d\n", cadenaFinal, nombre,
                    apellido, edad);
        }
        
        CrearArchivoTexto.agregarRegistros(cadenaFinal);
        

    } // fin de main
} // fin de la clase PruebaCrearArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *************************************************************************/
