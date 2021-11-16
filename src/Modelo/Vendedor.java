
package Modelo;


public class Vendedor {
    int id;
    String cod;
    String clav;
    String nom;
    String apell;
    int tel;
    String correo;
    String dire;

    public Vendedor() {
    }

    public Vendedor(int id, String cod, String clav, String nom, String apell, int tel, String correo, String dire) {
        this.id = id;
        this.cod = cod;
        this.clav = clav;
        this.nom = nom;
        this.apell = apell;
        this.tel = tel;
        this.correo = correo;
        this.dire = dire;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getClav() {
        return clav;
    }

    public void setClav(String clav) {
        this.clav = clav;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
