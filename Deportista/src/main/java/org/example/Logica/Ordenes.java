package org.example.Logica;

import org.example.Datos.Conexion;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.Statement;


public class Ordenes extends Conexion{
    private String Cantidad;
    private int Comida;
    Conexion con = new Conexion();

    public Ordenes(String cantidad, int comida) {
        this.Cantidad = cantidad;
        this.Comida = comida;
    }

    public Ordenes() {

    }

    public void mostrarDatos(JComboBox cant, JComboBox comi) {
        System.out.println("Cantidad: " + cant.getSelectedItem() + " Comida: " + comi.getSelectedItem());
    }

    public void llenarCB(JComboBox comboCom) {
        String sql = "Select n_comida from comidas";
        Statement st;

        try{
            st= con.Conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            comboCom.removeAllItems();
            while (rs.next()) {
                comboCom.addItem(rs.getString("n_comida"));
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void pasaracodigo(JComboBox comboCom, JComboBox comboCant){
        String cant = comboCant.getSelectedItem().toString();
        String comida = comboCom.getSelectedItem().toString();
        int id_comida = 0;
        String sql = "Select id_comida from comidas where n_comida = '"+comida+"'";
        Statement st;

        try{
            st= con.Conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                id_comida = Integer.parseInt(rs.getString("id_comida"));
            }

            String mensaje = "¿Desea continuar con la orden de " +cant+ " unidades de "+comida;


            Object[] opciones = {"Sí", "No"};


            int respuesta = JOptionPane.showOptionDialog(null,
                    mensaje,
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,

            null,
                    opciones,
                    opciones[0]);


            if (respuesta == JOptionPane.YES_OPTION) {
                String sql2 = "insert into ordenes (cantidad, id_comida) values ('"+cant+"',"+id_comida+")";
                st.executeUpdate(sql2);

                System.out.println("El usuario seleccionó Sí");
                JOptionPane.showMessageDialog(null, "Orden creada correctamente");

            } else if (respuesta == JOptionPane.NO_OPTION) {
                System.out.println("El usuario seleccionó No");

                JOptionPane.showMessageDialog(null, "Orden cancelada correctamente");
            } else {
                System.out.println("El usuario cerró el cuadro de diálogo");
            }

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e);
        }

    }

}

