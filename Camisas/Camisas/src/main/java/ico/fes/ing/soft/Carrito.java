/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.ing.soft;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Carrito {
    private ArrayList<Camisas> camisas;

    public Carrito() {
       camisas = new ArrayList<Camisas>();
    }

    public Carrito(ArrayList<Camisas> camisas) {
        this.camisas = camisas;
    }
    
    public void agregarCamisas(Camisas camisa){
        camisas.add(camisa);
    }
    
    public float Cobro(){
    float total = 0.0f;
    int cantidad = camisas.size();
    if (cantidad <= 2) {
         System.out.println("Descuento no aplicable");
         for (Camisas camisa : camisas) {
              total += camisa.getPrecio();
        }
    }     
    if (cantidad >= 3 && cantidad <= 5) {
        float descuento = 0.05f;
        for (Camisas camisa : camisas) {
            total += camisa.getPrecio();
        }
        total -= total * descuento;
    }    
    if (cantidad > 5) {
        float descuento = 0.08f;
        for (Camisas camisa : camisas) {
            total += camisa.getPrecio();
        }
        total -= total * descuento;
    }
    return total;
}    
     
            
}
        
    
   
    
    

