package org.example.Presentacion;

import org.example.Logica.Ordenes;

import javax.swing.*;
import java.awt.event.*;

public class Home extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JComboBox ComidasCB;
    private JComboBox CantidadCB;

    public Home() {
        setLocationRelativeTo(null);
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        Ordenes Ord = new Ordenes();
        Ord.llenarCB(ComidasCB);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });


    }

    private void onOK() {
        Ordenes Ord = new Ordenes();
//        Ord.mostrarDatos(CantidadCB,ComidasCB);
//        dispose();
        Ord.pasaracodigo(ComidasCB,CantidadCB);
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

}
