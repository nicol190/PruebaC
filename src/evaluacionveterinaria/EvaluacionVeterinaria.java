/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionveterinaria;

import clases.clienteClass;
import clases.facturasClass;
import clases.mascotasClass;
import clases.medicamentosClass;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pipe_
 */
public class EvaluacionVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        int precio = 0;
        int cant = 0;
        int cedula = 0;
        long tel = 0;
        int identificacion = 0;
        int edad = 0;
        double peso = 0;
        String nombre = "";
        //String nombreCliente = "";
        String apellido = "";
        String direccion = "";
        String nombreMa = "";
        String raza = "";
        String nombreM = "";
        String descripcion = "";
        String dosis = "";
        medicamentosClass[] listaMedicamentos = null;
        facturasClass factura = null;
        mascotasClass mascota = null;

        clienteClass[][] listaClientes = null;

        int tamanoLista = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de clientes a registrar"));

        clienteClass[] ListaClientes = new clienteClass[tamanoLista];

        for (int i = 0; i < tamanoLista; i++) {
            cedula = Integer.parseInt(JOptionPane.showInputDialog("ingrese cedula de cliente"));
            nombre = (JOptionPane.showInputDialog("ingrese nombre del cliente"));
            apellido = (JOptionPane.showInputDialog("ingrese apellido del cliente"));
            direccion = (JOptionPane.showInputDialog("ingrese direccion del cliente"));
            tel = Long.parseLong(JOptionPane.showInputDialog("ingrese numero de telefono"));
            
         
            //JOptionPane.showMessageDialog(null, "Registro de mascota");
            JOptionPane.showMessageDialog(null, "Registro de mascota");

            identificacion = Integer.parseInt(JOptionPane.showInputDialog("ingrese identificacion de la mascota"));
            nombreMa = (JOptionPane.showInputDialog("nombre de la mascota"));
            raza = (JOptionPane.showInputDialog("raza de la mascota"));
            edad = Integer.parseInt(JOptionPane.showInputDialog("edad de la mascota"));
            peso = Double.parseDouble(JOptionPane.showInputDialog("peso de la mascota"));
            //String nombreMedicamento = (JOptionPane.showInputDialog("medicamento resetado"));
            //nombreCliente = (JOptionPane.showInputDialog("ingrese nombre del cliente"));

            JOptionPane.showMessageDialog(null, "Registro de medicamentos");

            int numeroMedicamento = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de medicamentos"));

            listaMedicamentos = new medicamentosClass[numeroMedicamento];
            medicamentosClass[] medicamentos = new medicamentosClass[numeroMedicamento];
            for (int x = 0; x < numeroMedicamento; x++) {
                nombreM = (JOptionPane.showInputDialog("ingrese nombre de medicamento resetado"));
                descripcion = (JOptionPane.showInputDialog("descripcion del medicamento"));
                dosis = (JOptionPane.showInputDialog("dosis de medicamento"));
                precio = Integer.parseInt(JOptionPane.showInputDialog("ingrese precio de medicamento por unidad"));
                cant = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad"));
                factura = new facturasClass(cant, precio);
                listaMedicamentos[x] = new medicamentosClass(nombreM, "", dosis, factura);
            }

            //factura = new facturasClass(cant, precio);
            //medicamento = new medicamentosClass(nombreMedicamento, "", dosis, factura);
            mascota = new mascotasClass(identificacion, nombreMa, raza, edad, peso,listaMedicamentos);
            clienteClass cliente = new clienteClass(cedula, nombre, apellido, direccion, tel, mascota);

            ListaClientes[i] = cliente;
            
            int sumaTotal = 0;
            String mensaje = "=================== FACTURA DEL CLIENTE " + cliente.getNombre() + "  ===================\n\n";
            for (int a = 0; a < cliente.getMascotasClass().getMedicamentosClass().length;a++){
                
                mensaje = mensaje +" " + a + ". "+ listaMedicamentos[a].getNombreM() + " cantidad: " + cant + " valor por unidad" + precio;
                int total = cliente.getMascotasClass().getMedicamentosClass()[a].getFacturasClass().facturacion(precio, cant);
                sumaTotal = sumaTotal + total;
            
            }
             JOptionPane.showMessageDialog(null, mensaje + "\n\n TOTAL:   "+ sumaTotal);
          

            JOptionPane.showMessageDialog(null, "informe de cliente ");

            String consultaCliente = String.valueOf(JOptionPane.showInputDialog("digite cedula de cliente a consultar : "));
            clienteClass clienteConsulta = consultarClientexCedula(Integer.parseInt(consultaCliente), ListaClientes);
            if (clienteConsulta == null) {
                JOptionPane.showMessageDialog(null, "cliente no registrado");
            } else {
                JOptionPane.showMessageDialog(null, clienteConsulta.toString());
            }

        }
 
    }
 public static clienteClass consultarClientexCedula(int cedula, clienteClass[] ListaClientes) {
        for (int j = 0; j < ListaClientes.length; j++) {
            if (ListaClientes[j].getCedula() == (cedula)) {
                return ListaClientes[j];
            }
        }
        return null;
    }

}