
package Modelo;

public class Ventas {
    int id;
    String nitcli;
    String codven;
    String noventa;
    String fecha;
    double monto;
    String estado;

    public Ventas() {
    }

    public Ventas(int id, String nitcli, String codven, String noventa, String fecha, double monto, String estado) {
        this.id = id;
        this.nitcli = nitcli;
        this.codven = codven;
        this.noventa = noventa;
        this.fecha = fecha;
        this.monto = monto;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNitcli() {
        return nitcli;
    }

    public void setNitcli(String nitcli) {
        this.nitcli = nitcli;
    }

    public String getCodven() {
        return codven;
    }

    public void setCodven(String codven) {
        this.codven = codven;
    }

    public String getNoventa() {
        return noventa;
    }

    public void setNoventa(String noventa) {
        this.noventa = noventa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    
    
}
