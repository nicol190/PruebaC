/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author pipe_
 */
public class mascotasClass {
        private int identificacion;
	private String nombreMa;
	private String raza;
	private int edad;
	private double peso;
        //private String cliente;
        private medicamentosClass[] medicamentosClass;

    public mascotasClass(int identificacion, String nombreMa, String raza, int edad, double peso, medicamentosClass[] medicamentosClass) {
        this.identificacion = identificacion;
        this.nombreMa = nombreMa;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        //this.cliente = cliente;
        this.medicamentosClass = medicamentosClass;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreMa() {
        return nombreMa;
    }

    public void setNombreMa(String nombreMa) {
        this.nombreMa = nombreMa;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

   

    public medicamentosClass[] getMedicamentosClass() {
        return medicamentosClass;
    }

    public void setMedicamentosClass(medicamentosClass[] medicamentosClass) {
        this.medicamentosClass = medicamentosClass;
    }

   

    @Override
    public String toString() {
        return "identificacion=" + identificacion + "\n" +
               ", nombre Mascota=" + nombreMa + "\n" +
                ", raza=" + raza +"\n" +
                ", edad=" + edad +"\n" + 
                ", peso=" + peso + "\n" +
                ", medicamentos=" + "\n" 
                + medicamentosClass + '}';
    }

   
}
