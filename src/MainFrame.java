import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends javax.swing.JFrame{
    public MainFrame() {
        setTitle("Graficador");
        jb_boton.setBounds(5,5,120,60);
        jb_boton.addActionListener((event) -> {
            System.out.println("Ola");
        });
        add(jb_boton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,500);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Declaracionde variables
    JButton jb_boton = new JButton("Click");
}
