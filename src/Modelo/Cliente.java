
package Modelo;

public class Cliente {
    int ID;
    String nit;
    String nom;
    String apell;
    String dpi;
    int tel;
    String domici;
    String correoele;
    String esta;

    public Cliente() {
    }

    public Cliente(String nit, String nom, String apell, String dpi, int tel, String domici, String correoele, String esta, int ID) {
        this.ID = ID;
        this.nit = nit;
        this.nom = nom;
        this.apell = apell;
        this.dpi = dpi;
        this.tel = tel;
        this.domici = domici;
        this.correoele = correoele;
        this.esta = esta;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
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

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getDomici() {
        return domici;
    }

    public void setDomici(String domici) {
        this.domici = domici;
    }

    public String getCorreoele() {
        return correoele;
    }

    public void setCorreoele(String correoele) {
        this.correoele = correoele;
    }

    public String getEsta() {
        return esta;
    }

    public void setEsta(String esta) {
        this.esta = esta;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    
}
