package ProfessorPediu.Modificadores_static_e_final;

public class Contador {
     public static  int COUNT = 0;
     public static  final double PI = 3.14;
     public void incrementar(){
         COUNT++;
     }
     public static void imprimirContador(){
         System.out.println("O valor do contador é: " + Contador.COUNT);
     }
}
