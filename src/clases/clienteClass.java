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
public class clienteClass {

    public static clienteClass consultaClientexCedula(String consultaCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private long tel;
    private mascotasClass mascotasClass;

    public clienteClass(int cedula, String nombre, String apellido, String direccion, long tel, mascotasClass mascotasClass) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.tel = tel;
        this.mascotasClass = mascotasClass;
    }


     public clienteClass consultarClientexCedula(int cedula,  clienteClass[]  clienteClass){
        for (int j = 0; j < clienteClass.length; j++) {
            if (clienteClass[j].getCedula()==(cedula)){
                return clienteClass[j];
            }
        }
        return null;
    }


    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public mascotasClass getMascotasClass() {
        return mascotasClass;
    }

    public void setMascotasClass(mascotasClass mascotasClass) {
        this.mascotasClass = mascotasClass;
    }

    public void registrarCliente(int cedula, String nombre, String apellido, String direccion, long tel) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "clienteClass{" + "cedula=" + cedula + "\n" +
                ", nombre=" + nombre + "\n" +
                ", apellido=" + apellido + "\n" +
                ", direccion=" + direccion + "\n" +
                ", tel=" + tel + "\n" +
                ", mascota=" + mascotasClass.toString() + '}';
    }
      
   
    }
