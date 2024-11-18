package repetitivas;

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
    JTextField txtNumero, txtCantidad, txtMultiplos;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm04 frame = new frm04();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm04() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 450, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número (n):");
        lblNumero.setBounds(50, 50, 150, 30);
        getContentPane().add(lblNumero);

        JLabel lblCantidad = new JLabel("Cantidad de múltiplos (m):");
        lblCantidad.setBounds(50, 90, 150, 30);
        getContentPane().add(lblCantidad);

        JLabel lblMultiplos = new JLabel("Múltiplos:");
        lblMultiplos.setBounds(50, 130, 150, 30);
        getContentPane().add(lblMultiplos);

        txtNumero = new JTextField();
        txtNumero.setBounds(220, 50, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(220, 90, 100, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);

        txtMultiplos = new JTextField();
        txtMultiplos.setBounds(220, 130, 100, 30);
        txtMultiplos.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMultiplos.setFocusable(false);
        txtMultiplos.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMultiplos);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 200, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        int cantidad = Integer.parseInt(txtCantidad.getText());
        StringBuilder multiplos = new StringBuilder();

        for (int i = 1; i <= cantidad; i++) {
            multiplos.append(numero * i).append(" ");
        }

        txtMultiplos.setText(multiplos.toString());
    }
}
