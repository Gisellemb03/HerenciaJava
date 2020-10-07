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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // array de electrodomesticos
        Electrodomestico arrayElectrodomesticos[]=new Electrodomestico[10];
        
        arrayElectrodomesticos[0]=new Lavadora(100, 250, "gris", 'C', 10);
        arrayElectrodomesticos[1]=new Lavadora(60, 100, "blanco", 'E', 7);
        arrayElectrodomesticos[2]=new Lavadora(50, 130);
        arrayElectrodomesticos[3]=new Lavadora(15, 120);
        arrayElectrodomesticos[4]=new Lavadora(300, 500, "negro", 'A', 30);
        arrayElectrodomesticos[5]=new Television(400,20,'C',"azul",40,true);
        arrayElectrodomesticos[6]=new Television(390,30,'D',"negro",40,false);
        arrayElectrodomesticos[7]=new Television(400,20);
        arrayElectrodomesticos[8]=new Television(700,50);
        arrayElectrodomesticos[9]=new Television(900,60);
        
        //Creamos las variables para almacenar la suma de los precios
        double sumaTelevisiones=0;
        double sumaLavadoras=0;
   
        //Recorremos el array invocando el metodo precioFinal
        for(int i=0;i<arrayElectrodomesticos.length;i++){
            
            if(arrayElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=arrayElectrodomesticos[i].precioFinal();
            }
            if(arrayElectrodomesticos[i] instanceof Television){
                sumaTelevisiones+=arrayElectrodomesticos[i].precioFinal();
            }
        }
   
        //Mostrar los resultados
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
        
        
        
    }
    
}
