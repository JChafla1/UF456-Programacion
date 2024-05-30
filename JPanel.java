import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JPanel {
    public static void main(String[] args) {

        // Crear el JFrame
        JFrame frame = new JFrame("Ejemplo con botones de JPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear el JPanel amb un GridLayout
        // 3 files, 3 columnes
        JPanel panel = new JPanel(new GridLayout(3, 3));

        // Crear i afegir botons al JPanel
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("Botó " + i);
            panel.add(button);
        }

        // Agregar el JPanel al JFrame
        frame.add(panel);
        
        // Hacer visible el JFrame
        frame.setVisible(true);

    }
}
