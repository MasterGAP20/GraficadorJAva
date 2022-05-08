import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public MainFrame() {
        // Declaracion e inicializacion de variables
        JFrame jf_ventana = new JFrame("Frame de prueba");
        JPanel jp_panel = new JPanel();
        JLabel jl_texto = new JLabel("Esto es un Ejemplo");
        JButton jb_boton = new JButton();
        jb_boton.setText("Bomton");
        // Propiedades panel
        jp_panel.setLayout(new FlowLayout());
        jp_panel.setBorder(BorderFactory.createLineBorder(Color.blue));
        // Asignacion de posiciones
        jl_texto.setLocation(50, 50);
        jb_boton.setLocation(150, 150);
        // Inclusion de componentes
        jp_panel.add(jl_texto);
        jp_panel.add(jb_boton);
        // Propiedades de ventana
        jf_ventana.setSize(700,600);
        jf_ventana.add(jp_panel);
        jf_ventana.setResizable(false);
        jf_ventana.setLocationRelativeTo(null);
        jf_ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf_ventana.setVisible(true);
    }

}
