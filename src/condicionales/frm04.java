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

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPractica1, txtPractica2, txtPractica3, txtPromedioFinal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm04 frame = new frm04();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm04() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 330, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPractica1 = new JLabel("Nota Práctica 1:");
        lblPractica1.setBounds(50, 50, 150, 30);
        getContentPane().add(lblPractica1);

        JLabel lblPractica2 = new JLabel("Nota Práctica 2:");
        lblPractica2.setBounds(50, 100, 150, 30);
        getContentPane().add(lblPractica2);

        JLabel lblPractica3 = new JLabel("Nota Práctica 3:");
        lblPractica3.setBounds(50, 150, 150, 30);
        getContentPane().add(lblPractica3);

        JLabel lblPromedioFinal = new JLabel("Promedio:");
        lblPromedioFinal.setBounds(50, 200, 150, 30);
        getContentPane().add(lblPromedioFinal);

        txtPractica1 = new JTextField();
        txtPractica1.setBounds(200, 50, 60, 30);
        txtPractica1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPractica1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPractica1);

        txtPractica2 = new JTextField();
        txtPractica2.setBounds(200, 100, 60, 30);
        txtPractica2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPractica2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPractica2);

        txtPractica3 = new JTextField();
        txtPractica3.setBounds(200, 150, 60, 30);
        txtPractica3.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPractica3.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPractica3);

        txtPromedioFinal = new JTextField();
        txtPromedioFinal.setBounds(200, 200, 60, 30);
        txtPromedioFinal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPromedioFinal.setFocusable(false);
        txtPromedioFinal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPromedioFinal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 260, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double practica1 = Double.parseDouble(txtPractica1.getText());
        double practica2 = Double.parseDouble(txtPractica2.getText());
        double practica3 = Double.parseDouble(txtPractica3.getText());

        if (practica3 >= 10) {
            practica3 += 2;
        }

        double promedioFinal = (practica1 + practica2 + practica3) / 3;

        txtPromedioFinal.setText(String.format("%.2f", promedioFinal));
    }
}
