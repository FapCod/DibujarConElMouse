/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujarconelmouse;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Frank
 */
public class DibujarConElMouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se crea el objeto Jframe
        JFrame aplicacion = new JFrame("Un programa para dibujar");
        dibujo dibujar = new dibujo();
        aplicacion.add(dibujar,BorderLayout.CENTER);
        //crea una etiqueta y la coloca en la region SOUTH de BorderLayout
        aplicacion.add(new JLabel("Arrastre el raton para dibujar"), BorderLayout.SOUTH);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(400, 200);
        aplicacion.setVisible(true);
    }
    
}
