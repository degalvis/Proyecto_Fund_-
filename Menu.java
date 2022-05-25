import javax.swing.*;
import java.awt.Color;

public class Menu extends JFrame{
    
    private JPanel panel_menu = new JPanel();

    public Menu(){
        setTitle("Menú");
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setSize(800, 600);
        panel_menu.setBackground(Color.CYAN);
        panel_menu.setSize(800,600);
//        panel_menu.setLocation(0,0);
        panel_menu.setVisible(true);
        add(panel_menu);
    }
}
