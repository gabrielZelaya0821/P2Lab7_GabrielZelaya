package modelos;

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
        while (true) {
            barra.setValue(barra.getValue() + 1);
            if (barra.getValue() == (Math.round(largo)) / 10) {
                break;
            }
        }
        barra.setValue(MIN_PRIORITY);
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
    }

}
