import java.awt.GridLayout;
import javax.swing.JFrame;

public class JPanel {
    public static void main(String[] args) {

        // Crear el JFrame
        JFrame frame = new JFrame("Ejemplo con botones de JPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear el JPanel amb un GridLayout
        // 3 files, 3 columnes
        JPanel panel = new JPanel(new GroupLayout(3, 3)); 

    }
}
