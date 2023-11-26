package codigojavaproblema001;

import java.util.*;

public class CodigoJavaProblema001 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
Programa que muestre la serie de numeros que el usuario desee. 
ejemplo: la serie de numeros que se encuentran entre el 1 al 10
ejmplo de la serie: "(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)"
Pero solo pueden ser numeros mayores a cero caso contrario se 
presentara el mensaje "Números¡Invalidos!".
         */
        int limite;
        int numInicial;
        int contador = 0;
        System.out.print("Ingrese el primer numero de la serie: ");
        numInicial = entrada.nextInt();
        System.out.print("Ingrese el numero limite de la serie que desea ver: ");
        limite = entrada.nextInt();
        contador = numInicial;
        if (numInicial > 0 && limite > 0) {
            System.out.println("Serie de numeros del " + numInicial + " hasta el " + limite + ":");
            while (contador <= limite) {
                System.out.println("<o>"+"|" + contador + "|");
                contador++;

            }
        } else {
            System.out.print("Números¡Invalidos!");
        }

    }

}
