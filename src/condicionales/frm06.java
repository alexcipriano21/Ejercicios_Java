package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtEdad1, txtEdad2, txtEdad3, txtEdadMayor, txtEdadMenor;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm06 frame = new frm06();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm06() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblEdad1 = new JLabel("Edad 1:");
        lblEdad1.setBounds(50, 50, 100, 30);
        getContentPane().add(lblEdad1);

        txtEdad1 = new JTextField();
        txtEdad1.setBounds(150, 50, 100, 30);
        txtEdad1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdad1);

        JLabel lblEdad2 = new JLabel("Edad 2:");
        lblEdad2.setBounds(50, 100, 100, 30);
        getContentPane().add(lblEdad2);

        txtEdad2 = new JTextField();
        txtEdad2.setBounds(150, 100, 100, 30);
        txtEdad2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdad2);

        JLabel lblEdad3 = new JLabel("Edad 3:");
        lblEdad3.setBounds(50, 150, 100, 30);
        getContentPane().add(lblEdad3);

        txtEdad3 = new JTextField();
        txtEdad3.setBounds(150, 150, 100, 30);
        txtEdad3.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad3.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdad3);

        JLabel lblEdadMayor = new JLabel("Edad Mayor:");
        lblEdadMayor.setBounds(50, 200, 100, 30);
        getContentPane().add(lblEdadMayor);

        txtEdadMayor = new JTextField();
        txtEdadMayor.setBounds(150, 200, 100, 30);
        txtEdadMayor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdadMayor.setFocusable(false);
        txtEdadMayor.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdadMayor);

        JLabel lblEdadMenor = new JLabel("Edad Menor:");
        lblEdadMenor.setBounds(50, 250, 100, 30);
        getContentPane().add(lblEdadMenor);

        txtEdadMenor = new JTextField();
        txtEdadMenor.setBounds(150, 250, 100, 30);
        txtEdadMenor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdadMenor.setFocusable(false);
        txtEdadMenor.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdadMenor);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(110, 300, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int edad1 = Integer.parseInt(txtEdad1.getText());
        int edad2 = Integer.parseInt(txtEdad2.getText());
        int edad3 = Integer.parseInt(txtEdad3.getText());

        int edadMayor = edad1;
        int edadMenor = edad1;

        if (edad2 > edadMayor) {
            edadMayor = edad2;
        } else if (edad2 < edadMenor) {
            edadMenor = edad2;
        }

        if (edad3 > edadMayor) {
            edadMayor = edad3;
        } else if (edad3 < edadMenor) {
            edadMenor = edad3;
        }

        txtEdadMayor.setText(String.valueOf(edadMayor));
        txtEdadMenor.setText(String.valueOf(edadMenor));
    }
}
