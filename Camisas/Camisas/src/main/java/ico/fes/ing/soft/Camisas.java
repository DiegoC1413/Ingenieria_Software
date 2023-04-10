/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ico.fes.ing.soft;

/**
 *
 * @author diego
 */
public class Camisas {

    private int Precio;
    private String Manga;
    private String Tipo;

    public Camisas() {
    }

    public Camisas(int Precio, String Manga, String Tipo) {
        this.Precio = Precio;
        this.Manga = Manga;
        this.Tipo = Tipo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getManga() {
        return Manga;
    }

    public void setManga(String Manga) {
        this.Manga = Manga;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Camisas{" + "Precio=" + Precio + ", Manga=" + Manga + ", Tipo=" + Tipo + '}';
    }
    
    
    
    
}
