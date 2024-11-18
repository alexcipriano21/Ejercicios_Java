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

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtCantidadDivisores;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm03 frame = new frm03();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm03() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 450, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 50, 150, 30);
        getContentPane().add(lblNumero);

        JLabel lblCantidadDivisores = new JLabel("Cantidad de divisores:");
        lblCantidadDivisores.setBounds(50, 90, 150, 30);
        getContentPane().add(lblCantidadDivisores);

        txtNumero = new JTextField();
        txtNumero.setBounds(220, 50, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtCantidadDivisores = new JTextField();
        txtCantidadDivisores.setBounds(220, 90, 100, 30);
        txtCantidadDivisores.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidadDivisores.setFocusable(false);
        txtCantidadDivisores.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidadDivisores);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 130, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        int cantidadDivisores = contarDivisores(numero, 1, 0);
        txtCantidadDivisores.setText(String.valueOf(cantidadDivisores));
    }

    private int contarDivisores(int numero, int i, int contador) {
        if (i > numero) {
            return contador;
        }

        if (numero % i == 0) {
            contador++;
        }

        return contarDivisores(numero, i + 1, contador);
    }
}
