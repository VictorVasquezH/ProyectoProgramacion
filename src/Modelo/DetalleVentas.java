
package Modelo;

public class DetalleVentas {
    int id;
    int idventas;
    int idproducto;
    int cantidad;
    double preventa;

    public DetalleVentas() {
    }

    public DetalleVentas(int id, int idventas, int idproducto, int cantidad, double preventa) {
        this.id = id;
        this.idventas = idventas;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.preventa = preventa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdventas() {
        return idventas;
    }

    public void setIdventas(int idventas) {
        this.idventas = idventas;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPreventa() {
        return preventa;
    }

    public void setPreventa(double preventa) {
        this.preventa = preventa;
    }
    
    
    
}
