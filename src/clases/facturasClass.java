/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Interface.vetInterface;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author pipe_
 */
public class facturasClass implements vetInterface{
    private int cant;
    private int precio;

    public facturasClass() {
              Path path = Paths.get("");
        String directoryName = path.toAbsolutePath().toString();
        String url = directoryName + "/BASES/factFichero.txt";
        String urlTemp = directoryName + "/BASES/vetFicherotem.txt";
    
    }

    public facturasClass(int cant, int precio) {
        this.cant = cant;
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void registrar () throws IOException{
        String url = null;
        BufferedWriter bw = new BufferedWriter(new FileWriter(url, true));
        bw.write("hola a todos");
        bw.flush();
        bw.newLine();
        bw.close();
    }
    
    @Override
    public int facturacion(int precio, int cant) {
        return precio*cant;
        //throw new UnsupportedOpereationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
