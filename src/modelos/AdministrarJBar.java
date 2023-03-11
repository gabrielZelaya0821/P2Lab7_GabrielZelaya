package modelos;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author gabri
 */
public class AdministrarJBar extends Thread {

    private JProgressBar barra;
    private double largo;

    public AdministrarJBar(JProgressBar barra, double largo) {
        this.barra = barra;
        this.largo = largo;
    }

    @Override
    public void run() {
        int contador = 0;
        barra.setMaximum((int) (Math.round(largo) / 10));
        while (contador <= (int)(Math.round(largo)) / 10) {
            barra.setValue(contador);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            contador+=10;
        }
        JOptionPane.showMessageDialog(null, "¡Descarga completada!");
        barra.setValue(0);
    }
}
