package ProgramasJava;

import java.util.Scanner;

public class MetodoVacio {

    static void main(String[] args) {

        // String name "manuel"
        SaludarPorElNombre(" Manuel 😎 ");
        SumarDosNumeros(100,400);


    }


        public static void SaludarPorElNombre(String nombre){
            System.out.println ("Hola" + nombre);

        }

        public static void SumarDosNumeros(int num1, int num2){

        int resultado = num1 + num2;
            System.out.println( "resultado" + resultado);
        }




    }

