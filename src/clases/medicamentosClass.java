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
public class medicamentosClass {
        private String nombreM;
	private String descripcion;
	private String dosis;
        private facturasClass facturasClass;

    public medicamentosClass(String nombreM, String descripcion, String dosis, facturasClass facturasClass) {
        this.nombreM = nombreM;
        this.descripcion = descripcion;
        this.dosis = dosis;
        this.facturasClass = facturasClass;
    }



    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public facturasClass getFacturasClass() {
        return facturasClass;
    }

    public void setFacturasClass(facturasClass facturasClass) {
        this.facturasClass = facturasClass;
    }

    
        
 public void registrarMedicamentos(String nombreM, String descripcion, String dosis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return  "nombre Medicamento=" + nombreM + "\n" +
                ", descripcion=" + descripcion + "\n" +
                ", dosis=" + dosis +"\n" +
                ", factura=" + "\n" 
                + facturasClass.toString() + '}';
    }
 
}
