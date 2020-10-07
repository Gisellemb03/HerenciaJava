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
public class Television extends Electrodomestico {
    //contante
    private final static int resolucionD=20;
    
    private int resolucion;
    private boolean sintonizadorTDT;
    
    //metodo para el precio final de la television
    @Override
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double extra=super.precioFinal();
  
        //Añadimos el codigo necesario
        if (resolucion>40){
            extra+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            extra+=50;
        }
  
        return extra;
    }
    
    //constructores
    
    public Television(){
        this(precioBaseD, pesoD, consumoEnergeticoD, colorD, resolucionD, false);
    }
  
   
    public Television(double precioBase, int peso){
        this(precioBase, peso, consumoEnergeticoD, colorD, resolucionD, false);
    }
  
    
    
    public Television(double precioBase, int peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
    
}
