/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujarconelmouse;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Frank
 */
public class dibujo extends JPanel {

    //Listar referencias Point 
    private final ArrayList<Point> puntos = new ArrayList<>();

    //establecer la gui y registra el manejador de eventos del raton
    public dibujo() {

        addMouseMotionListener(
                new MouseMotionAdapter() {//clase interna anonima
            //almacena las coordenadas de arrastre y vuelve a dibujar
            @Override
            public void mouseDragged(MouseEvent evento) {
                puntos.add(evento.getPoint());
                repaint(); //vuelve a dibujar el Jframe
            }
        }
        );

    }

//dibuja ovalos en iun cuadro delimitador de 4x4 en la ubicaciones especificadas en la ventana
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);//borra el area
        //dibuja todos los puntos
        for(Point punto : puntos)
         //   g.fill3DRect( punto.y, punto.y,punto.x, punto.x ,true);
       g.fillOval(punto.x, punto.y, 4, 4);
    }
}
//fin de la clase dibujo