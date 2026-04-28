import javax.swing.*;
import java.awt.event.*;

class CalculatorSwing {
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JLabel l = new JLabel("Result");

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        t1.setBounds(50,50,100,30);
        t2.setBounds(50,100,100,30);

        add.setBounds(50,150,45,30);
        sub.setBounds(105,150,45,30);
        mul.setBounds(50,190,45,30);
        div.setBounds(105,190,45,30);

        l.setBounds(50,230,150,30);

        f.add(t1); f.add(t2); f.add(add); f.add(sub);
        f.add(mul); f.add(div); f.add(l);

        add.addActionListener(e -> l.setText(""+(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText()))));
        sub.addActionListener(e -> l.setText(""+(Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText()))));
        mul.addActionListener(e -> l.setText(""+(Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText()))));
        div.addActionListener(e -> l.setText(""+(Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText()))));

        f.setSize(300,350);
        f.setLayout(null);
        f.setVisible(true);
    }
}