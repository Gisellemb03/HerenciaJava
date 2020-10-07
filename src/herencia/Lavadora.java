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
public class Lavadora extends Electrodomestico{
    
    private final static int cargaD=5;
    
    //atributo
    private int carga;


    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    //precio final de la lavadora
    
    @Override
    public double precioFinal(){
        //invocar el metodo de la clase padre
        double extra=super.precioFinal();
        
        if(carga>30){
            extra+=50;
        }
        return extra;
        
    }
    
    //constructor
   public Lavadora(){
       this(cargaD, precioBaseD, colorD, consumoEnergeticoD, pesoD);
    }
   
   public Lavadora(double precioBase, int peso){
        super(precioBase,colorD, consumoEnergeticoD, peso);
    }
  

    public Lavadora(int carga, double precioBase, String color, char consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    
    
    
}
