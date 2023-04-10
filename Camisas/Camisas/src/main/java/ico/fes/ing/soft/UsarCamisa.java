/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.ing.soft;

/**
 *
 * @author diego
 */
public class UsarCamisa {
    public static void main(String[] args) {
        
        Camisas camisabase = new Camisas(190, "Manga Corta", "");
        System.out.println(camisabase);
        
        Camisas CamisaCasual = new Camisas(230, "Manga Larga", "Casual");
        System.out.println(CamisaCasual);
        
        Camisas CamisaFormal = new Camisas(310, "Manga Larga", "Formal");
        System.out.println(CamisaFormal);
        
        
       
    Carrito carrito = new Carrito();

   

    carrito.agregarCamisas(camisabase);
    carrito.agregarCamisas(CamisaCasual);
    carrito.agregarCamisas(CamisaFormal);

    float total = carrito.Cobro();
    System.out.println("El precio total de las camisas en el carrito es: " + total);
}
    }

