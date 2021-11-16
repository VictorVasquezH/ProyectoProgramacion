
package Modelo;


public class Producto {
    int id;
    String codpro ;
    String nompro ;
    String despro ;
    String precio ;
    int exispro;

    public Producto() {
    }

    public Producto(String codpro, String nompro, String despro, String precio) {
        this.id = id;
        this.codpro = codpro;
        this.nompro = nompro;
        this.despro = despro;
        this.precio = precio;
        this.exispro = exispro;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getNompro() {
        return nompro;
    }

    public void setNompro(String nompro) {
        this.nompro = nompro;
    }

    public String getDespro() {
        return despro;
    }

    public void setDespro(String despro) {
        this.despro = despro;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getExispro() {
        return exispro;
    }

    public void setExispro(int exispro) {
        this.exispro = exispro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  
    
    
    
    
    
}
