import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class RegistrationForm {
    public static void main(String[] args) {

        JFrame f = new JFrame("Registration");

        JTextField name = new JTextField();
        JTextField email = new JTextField();
        JTextField phone = new JTextField();
        JButton submit = new JButton("Submit");

        name.setBounds(50,50,150,30);
        email.setBounds(50,100,150,30);
        phone.setBounds(50,150,150,30);
        submit.setBounds(50,200,100,30);

        f.add(name); f.add(email); f.add(phone); f.add(submit);

        submit.addActionListener(e -> {
            try {
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/test","root","");

                PreparedStatement ps = con.prepareStatement(
                        "insert into student values(?,?,?)");

                ps.setString(1,name.getText());
                ps.setString(2,email.getText());
                ps.setString(3,phone.getText());

                ps.executeUpdate();
                JOptionPane.showMessageDialog(f,"Inserted!");
            } catch(Exception ex){
                System.out.println(ex);
            }
        });

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}