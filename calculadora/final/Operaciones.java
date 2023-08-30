/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author soloj
 */
public class Operaciones {
    
   private String digito;
   private double resultado;
   private boolean suma;
   private boolean resta;
   private boolean multiplicacion;
   private boolean division;
   private boolean raiz;
   private boolean seno;
   private boolean coseno;
   private boolean tangente;
   private boolean cotangente;
   private boolean secante;
   private boolean cosecante;
   private boolean alcuadrado;
   private boolean alapotencia;
   private boolean iva;
   
   
   public Operaciones(){
   
       digito="";
       suma=false;
       resta=false;
       multiplicacion=false;
       division=false;
       raiz=false;
       seno=false;
       coseno=false;
       tangente=false;
       cotangente=false;
       secante=false;
       cosecante=false;
       alcuadrado=false;
       alapotencia=false;
       iva=false;
  
   }
   
public String concatenamiento(String digito){
   
       this.digito=this.digito+digito;
       return this.digito;
       
   
   }
   
public void suma(String digito){
   
       this.resultado=Double.parseDouble(digito);
       suma=true;
       this.digito="";
   
   }
   
public void resta(String digito){
   
       this.resultado=Double.parseDouble(digito);
       resta=true;
       this.digito="";
   
   }
    
public void multiplicacion(String digito){
   
       this.resultado=Double.parseDouble(digito);
       multiplicacion=true;
       this.digito="";
   
   }
     
public void division(String digito){
   
       this.resultado=Double.parseDouble(digito);
       division=true;
       this.digito="";
   
   }
      
public void raiz(String digito){
   
       this.resultado=Double.parseDouble(digito);
       raiz=true;
       this.digito="";
   
   }

       public void seno(String digito){
   
       this.resultado=Double.parseDouble(digito);
       seno=true;
       this.digito="";
   
   }
        
public void coseno(String digito){
   
       this.resultado=Double.parseDouble(digito);
       coseno=true;
       this.digito="";
   
   }
         
public void tangente(String digito){
   
       this.resultado=Double.parseDouble(digito);
       tangente=true;
       this.digito="";
   
   }
          
public void cotangente(String digito){
   
       this.resultado=Double.parseDouble(digito);
       cotangente=true;
       this.digito="";
   
   }
           
public void secante(String digito){
   
       this.resultado=Double.parseDouble(digito);
       secante=true;
       this.digito="";
   
   }
            
public void cosecante(String digito){
   
       this.resultado=Double.parseDouble(digito);
       cosecante=true;
       this.digito="";
   
   }
             
public void alcuadrado(String digito){
   
       this.resultado=Double.parseDouble(digito);
       alcuadrado=true;
       this.digito="";
   
   }
              
public void alapotencia(String digito){
   
       this.resultado=Double.parseDouble(digito);
       alapotencia=true;
       this.digito="";
   
   }
             
public void iva(String digito){
   
       this.resultado=Double.parseDouble(digito);
       iva=true;
       this.digito="";
   
   }

   public double resultado(String numero){
   
       if(suma==true){
           
       resultado=resultado+Double.parseDouble(numero);
       
       }
       
       else if(resta==true){
           
       resultado=resultado-Double.parseDouble(numero);
       
       }
       
           else if(multiplicacion==true){
           
       resultado=resultado*Double.parseDouble(numero);
       
       }
       
           else if(division==true){
           
       resultado=resultado/Double.parseDouble(numero);
       
       }
       
           else if(raiz==true){
           
       resultado=Math.sqrt(Double.parseDouble(numero));
      
       }
       
           else if(seno==true){
           
               double seno=Math.toRadians(resultado);
               resultado=Math.sin(seno);
           }
       
        else if(coseno==true){
           
               double coseno=Math.toRadians(resultado);
               resultado=Math.cos(coseno);
           }
       
        else if(tangente==true){
           
               double tangente=Math.toRadians(resultado);
               resultado=Math.tan(tangente);
           }
       
        else if(cotangente==true){
           
               double cotangente=Math.toRadians(resultado);
               resultado=1/Math.tan(cotangente);
           }
       
        else if(secante==true){
           
               double secante=Math.toRadians(resultado);
               resultado=1/Math.cos(secante);
           }
       
        else if(cosecante==true){
           
               double cosecante=Math.toRadians(resultado);
               resultado=1/Math.sin(cosecante);
           }
       
        else if(alcuadrado==true){
        
            resultado=Math.pow(resultado, 2);
        }
       
        else if(alapotencia==true){
        
            resultado=Math.pow(resultado, Double.parseDouble(numero));
        }
       
       else if(iva==true){
        
            resultado = (resultado*1/100)*Double.parseDouble(numero);
        }
       
       suma=false;
       resta=false;
       multiplicacion=false;
       division=false;
       raiz=false;
       seno=false;
       coseno=false;
       tangente=false;
       cotangente=false;
       secante=false;
       cosecante=false;
       alcuadrado=false;
       alapotencia=false;
       
       return resultado;
       
   }
               
    
}
