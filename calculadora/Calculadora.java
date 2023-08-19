/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Calculadora {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int seleccion_de_operaciones=0;
        double numero1=0;
        double numero2=0;
        double resultado=0;
        
        do{
            System.out.println("\n");
            System.out.println("Seleeccione un numero de operacion a realizar");
            System.out.println("1.-Suma");
            System.out.println("2.-Resta");
            System.out.println("3.-Multiplicacion");
            System.out.println("4.-Division");
            System.out.println("5.-Salir");
            seleccion_de_operaciones = leer.nextInt();
            
            if(seleccion_de_operaciones !=5){
                System.out.print("Ingrese el primer numero: ");
                numero1=leer.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                numero2=leer.nextInt();
            }
            
            switch(seleccion_de_operaciones){
                case 1:
                    seleccion_de_operaciones = 1;
                    resultado = numero1+numero2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    seleccion_de_operaciones = 2;
                    resultado = numero1-numero2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    seleccion_de_operaciones = 3;
                    resultado = numero1*numero2;
                    System.out.println("El resultado de la mutiplicacion es: " + resultado);
                    break;
                case 4:
                    seleccion_de_operaciones = 4;
                    resultado = numero1/numero2;
                    System.out.println("El resultado de la division es: " + resultado);
                    break;
            }
      }while(seleccion_de_operaciones !=5);
        System.out.println("Ah elegido salir de la calucladora, hasta la proxima!!!");
    
}
}
