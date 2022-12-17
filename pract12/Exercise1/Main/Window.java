package Exercise1.Main;
import Exercise1.Shapes.Circle;
import Exercise1.Shapes.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {
    private JPanel shapePanel;
    Window(){
        super("Shapes");
        Random rand = new Random();
        setSize(400, 300);
        setLayout(new BorderLayout());
        shapePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int i = 0; i < 20; ++i){
                    int choice = rand.nextInt(2);
                    if (choice == 0) {
                        Circle tmp = new Circle();
                        g.setColor(tmp.getColor());
                        g.drawOval(tmp.getX(), tmp.getY(), tmp.getAxisFirst(), tmp.getAxisSecond());
                    }
                    else {
                        Rectangle tmp = new Rectangle();
                        g.setColor(tmp.getColor());
                        g.drawRect(tmp.getX(), tmp.getY(), tmp.getWidth(), tmp.getHeight());
                    }
                }
            }
        };
        add(shapePanel, BorderLayout.CENTER);
        setVisible(true);
    }

}
