package ProgramasJava;

public class MetodoConRetorno {

    public static void main(String[] args) {
        int resultado = SumarDosNumeros (100,400);
        System.out.println("El Resultado es: " + resultado);

        int notas = PromedioNota(3,5,5);
        System.out.println("El Resultado es: " + notas);



    }

      public static int SumarDosNumeros(int num1, int num2){
      int resultado = num1 + num2;
      return resultado;


    }

    public static int PromedioNota(int nota1, int nota2, int nota3){
        int notas = (nota1 + nota2 + nota3)/3;
        return notas;
    }

    }


