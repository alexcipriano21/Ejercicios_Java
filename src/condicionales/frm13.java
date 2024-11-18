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

public class frm13 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm13 frame = new frm13();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm13() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Números:");
        lblNumero.setBounds(50, 30, 150, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 30, 60, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtResultado = new JTextField();
        txtResultado.setBounds(50, 80, 200, 30);
        txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
        txtResultado.setFocusable(false);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

        JButton btnVerificar = new JButton("Calcular");
        btnVerificar.setBounds(100, 130, 100, 30);
        getContentPane().add(btnVerificar);

        btnVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnVerificar_actionPerformed();
            }
        });
    }

    protected void btnVerificar_actionPerformed() {
        int numero;
        try {
            numero = Integer.parseInt(txtNumero.getText());

            if (numero < 100 || numero > 999) {
                txtResultado.setText("Ingrese un número de 3 cifras.");
                return;
            }

            int cifra1 = numero / 100; 
            int cifra2 = (numero / 10) % 10; 
            int cifra3 = numero % 10; 

            if ((cifra1 + 1 == cifra2 && cifra2 + 1 == cifra3) ||
                (cifra1 - 1 == cifra2 && cifra2 - 1 == cifra3)) {
                txtResultado.setText("Las cifras son consecutivas.");
            } else {
                txtResultado.setText("Las cifras NO son consecutivas.");
            }

        } catch (NumberFormatException e) {
            txtResultado.setText("Ingrese un número válido.");
        }
    }
}
