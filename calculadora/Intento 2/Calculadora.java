/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorain;

/**
 *
 * @author Asus
 */
public class Calculadora {
    private String digito;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    private boolean sen;
    private boolean cos;
    private boolean tan;
    
    public Calculadora(){
        
        digito = "";
        resultado = 0;
        suma = false;
        resta = false;
        multiplicacion =false;
        division = false;
        sen = false;
        cos = false;
        tan = false;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }
    
    public void agragarNum(int num){
        setDigito(digito+num);
    }
    public void suma(String num){
        this.resultado = Double.parseDouble(num);
        suma = true;
        setDigito("");
    }
    
     public void resta(String num){
        this.resultado = Double.parseDouble(num);
        resta = true;
        setDigito("");
    }
     
     public void multiplicacion(String num){
        this.resultado = Double.parseDouble(num);
        multiplicacion = true;
        setDigito("");
    }
     
      public void division(String num){
        this.resultado = Double.parseDouble(num);
        division = true;
        setDigito("");
    }
      
      public void sen(String num){
        this.resultado = Double.parseDouble(num);
        sen = true;
        setDigito("");
    }
      
       public void cos(String num){
        this.resultado = Double.parseDouble(num);
        cos = true;
        setDigito("");
    }
       public void tan(String num){
        this.resultado = Double.parseDouble(num);
        tan = true;
        setDigito("");
    }
     
    public double calculo(String numero){
        if(suma==true){
            resultado = resultado + Double.parseDouble(numero);
        }
        if (resta==true){
            resultado = resultado - Double.parseDouble(numero);
        }
        if (multiplicacion==true){
             resultado = resultado * Double.parseDouble(numero);
        }
        if(division==true){
            resultado = resultado / Double.parseDouble(numero);
        }
        if(sen==true){
            double sen=Math.toRadians(resultado);
            resultado= Math.sin(sen);
        }
        if(cos==true){
            double cos=Math.toRadians(resultado);
            resultado= Math.cos(cos);
        }
        if(tan==true){
            double tan=Math.toRadians(resultado);
            resultado= Math.tan(tan);
        }
        
        suma=false;
        resta=false;
        
        return resultado;
    }
 
}
