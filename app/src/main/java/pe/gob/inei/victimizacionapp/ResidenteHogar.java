package pe.gob.inei.victimizacionapp;

/**
 * Created by RICARDO on 25/06/2017.
 */

public class ResidenteHogar {
    private int n;
    private String nombres;
    private String apellidos;
    private String parentezco;

    public ResidenteHogar(int n, String nombres, String apellidos, String parentezco) {
        this.n = n;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.parentezco = parentezco;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }
}
