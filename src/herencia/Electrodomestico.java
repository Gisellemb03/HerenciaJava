/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author gi_mb
 */
public class Electrodomestico {
    //constantes, para declarar una constante se define con el modificador final
    
   static final protected double precioBaseD=100;
   static final protected String colorD="blanco";
   static final protected char consumoEnergeticoD='F';
   static final protected int pesoD=5;
   
   //atributos
   protected double precioBase;
   protected String color;
   protected char consumoEnergetico;
   protected int peso;
   
   //Metodo para el color
   private void verificarColor(String color){
       //arreglos de los colores disponibles
       String colores[] ={"blanco","negro","rojo","azul","gris"};
       //ciclo para vericar el color o dejar el color por defecto
       boolean encontrado=false;
       
       for(int i=0;i<colores.length && !encontrado; i++){
           if(colores[i].equals(color)){
               encontrado=true;
           }
       }
       if(encontrado){
           this.color=color;
       }else{
           this.color=colorD;
       }
   }
    //verificar el consumo
   public void verificarConsumoEnergetico (char consumoEnergetico){
       
       if(consumoEnergetico>=65 && consumoEnergetico<=70){
           this.consumoEnergetico=consumoEnergetico;
       }else{
           this.consumoEnergetico=consumoEnergeticoD;
       }
   }
   
   //METODOS

    public static double getPrecioBaseD() {
        return precioBaseD;
    }

    public static String getColorD() {
        return colorD;
    }

    public static char getConsumoEnergeticoD() {
        return consumoEnergeticoD;
    }

    public static int getPesoD() {
        return pesoD;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

   

   

 //Ciclo para aumentar el precio dependiendo el consumo energetico y el peso
    public double precioFinal(){
        double extra=0;
        switch(consumoEnergetico){
            case 'A':
                extra+=100;
                break;
            case 'B':
                extra+=80;
                break;
            case 'C':
                extra+=60;
                break;
            case 'D':
                extra+=50;
                break;
            case 'E':
                extra+=30;
                break;
            case 'F':
                extra+=10;
                break;
        }
        if(peso>=0 && peso<19){
            extra+=10;
        }else if(peso>=20 && peso<49){
            extra+=50;
        }else if (peso>=50 && peso<=79){
            extra+=80;
        }else if(peso>=80){
            extra+=100;
        }
        return precioBase+extra;
    
    }
    
    //contructores
    public Electrodomestico(){
        this(precioBaseD,colorD,consumoEnergeticoD, pesoD);
    }

    
    public Electrodomestico(double precioBase, int peso){
        this(precioBase, colorD,consumoEnergeticoD,peso);
        
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        verificarColor(color);
        verificarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }
    
}
    
    

