package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm14 frame = new frm14();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm14() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 450, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 50, 150, 30);
        getContentPane().add(lblNumero);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 90, 150, 30);
        getContentPane().add(lblResultado);

        txtNumero = new JTextField();
        txtNumero.setBounds(220, 50, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtResultado = new JTextField();
        txtResultado.setBounds(220, 90, 100, 30);
        txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado.setFocusable(false);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(150, 150, 100, 30);
        getContentPane().add(btnVerificar);

        btnVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnVerificar_actionPerformed();
            }
        });
    }

    protected void btnVerificar_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        if (esPrimo(numero, 2)) {
            txtResultado.setText("Es primo");
        } else {
            txtResultado.setText("No es primo");
        }
    }

    private boolean esPrimo(int numero, int divisor) {
        if (numero <= 1) {
            return false;
        }
        if (divisor > Math.sqrt(numero)) {
            return true;
        }
        if (numero % divisor == 0) {
            return false;
        }
        return esPrimo(numero, divisor + 1);
    }
}
