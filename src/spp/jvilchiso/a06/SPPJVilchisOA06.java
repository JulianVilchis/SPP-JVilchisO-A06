/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jvilchiso.a06;
import java.util.Scanner;

/**
 *
 * @author Julián
 */
public class SPPJVilchisOA06 {
    public static void main(String[] args) {
       
        int num;
        num = solicitarNumero();
        calcularFactorial(num);
    }
    
    public static int solicitarNumero(){
        int numero;
        System.out.println("Introduce un numero del cual desees calcular su factorial:");
        Scanner entradaNumero = new Scanner(System.in);
        numero = entradaNumero.nextInt();
        if (numero < 1 || numero > 10){
            System.out.println("ERROR - NUMERO FUERA DE RANGO");
            solicitarNumero();
        } else {
            
        }
        return numero;
    }
    
    public static void calcularFactorial(int numero){
        int factorial, contador;
        contador = 1;
        factorial = 1;
        do {
            contador++;
            factorial = factorial*(contador);
        } while (contador < (numero));
        System.out.println("El factorial es : " + factorial);
    }
    
}
