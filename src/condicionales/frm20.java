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

public class frm20 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumeroA, txtNumeroB, txtNumeroC, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm20 frame = new frm20();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm20() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 360, 330);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumeroA = new JLabel("Número A:");
        lblNumeroA.setBounds(50, 30, 150, 30);
        getContentPane().add(lblNumeroA);

        txtNumeroA = new JTextField();
        txtNumeroA.setBounds(150, 30, 150, 30);
        txtNumeroA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumeroA.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumeroA);

        JLabel lblNumeroB = new JLabel("Número B:");
        lblNumeroB.setBounds(50, 80, 150, 30);
        getContentPane().add(lblNumeroB);

        txtNumeroB = new JTextField();
        txtNumeroB.setBounds(150, 80, 150, 30);
        txtNumeroB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumeroB.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumeroB);

        JLabel lblNumeroC = new JLabel("Número C:");
        lblNumeroC.setBounds(50, 130, 150, 30);
        getContentPane().add(lblNumeroC);

        txtNumeroC = new JTextField();
        txtNumeroC.setBounds(150, 130, 150, 30);
        txtNumeroC.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumeroC.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumeroC);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 180, 150, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(150, 180, 150, 30);
        txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
        txtResultado.setFocusable(false);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(130, 230, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        try {
            int a = Integer.parseInt(txtNumeroA.getText());
            int b = Integer.parseInt(txtNumeroB.getText());
            int c = Integer.parseInt(txtNumeroC.getText());

            String resultado;
            if (a < b && b < c) {
                resultado = "Ascendente";
            } else if (a > b && b > c) {
                resultado = "Descendente";
            } else {
                resultado = "Desordenado";
            }

            txtResultado.setText(resultado);

        } catch (NumberFormatException e) {
            txtResultado.setText("Entrada inválida");
        }
    }
}
