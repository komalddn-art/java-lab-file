import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PaintApp extends JFrame {

    int x,y;

    PaintApp(){
        addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent e){
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });

        setSize(400,400);
        setVisible(true);
    }

    public void paint(Graphics g){
        g.fillOval(x,y,10,10);
    }

    public static void main(String[] args){
        new PaintApp();
    }
}