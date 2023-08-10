/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;


public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacione miCalculadora = new Operacione (10,2);
        
        int suma = miCalculadora.sumar();
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+ miCalculadora.restar());
    }
    
}
