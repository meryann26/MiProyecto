package problema3;

import javax.swing.*;
import java.awt.*;

/**
 * Panel para dibujar
 */
public class JPanelDibujo extends JPanel {

    /* 
   * Constructor del panel para dibujar
     */
    public JPanelDibujo() {
        this.setBackground(Color.WHITE);
    }

    public void dibujaOvalo(Graphics g) {
        int N = 20;
        while (N != 0) {
            Ovalo ov = new Ovalo((int) (Math.random() * 200), (int) (Math.random() * 200), (int) (Math.random() * 500), (int) (Math.random() * 500));
            g.drawOval(ov.getPosX(), ov.getPosY(), ov.getAncho(), ov.getAlto()); //dibuja un ovalo sin fondo
            N--;
        }
    }

    public void dibujaRectangulo(Graphics g) {
        int N = 10;
        while (N != 0) {
            Rectangulo rect = new Rectangulo((int) (Math.random() * 200), (int) (Math.random() * 200), (int) (Math.random() * 500), (int) (Math.random() * 500));
            g.drawRect(rect.getPosX(), rect.getPosY(), rect.getAncho(), rect.getAlto()); //dibuja un rectángulo sin fondo
            N--;
        }
    }

    // Reimplementa paint
    public void paint(Graphics g) {
        super.paint(g);

        dibujaOvalo(g);

        dibujaRectangulo(g);

    }

}
