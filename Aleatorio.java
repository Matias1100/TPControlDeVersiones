/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.punto.pkg3;

/**
 *
 * @author Josemi
 */
public class Aleatorio {
    private double valora,valorb;
    
    public Aleatorio(){
       valora= Math.random();
       valorb=Math.random();
    }
    public void analizarValores(){
        System.out.println("Prosesando...");
        if (valora > valorb){
            double aux;
            aux=valora;
            valora=valorb;
            valorb=aux;
            System.out.println("Los valores fueron intercambiados");
        }else {
            System.out.println("Todo normal por aqui");
        }
               
        
    }
    public String toString(){
        String aux;
        aux= "primer valor generado "+ valora + "segundo valor generado "+ valorb;
        
        return aux;
    }
   
}
