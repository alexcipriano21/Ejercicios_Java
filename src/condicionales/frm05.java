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

public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtMayorNumero;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm05 frame = new frm05();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm05() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 260);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Números:");
        lblNumero.setBounds(50, 50, 150, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 50, 80, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        JLabel lblMayorNumero = new JLabel("Mayor:");
        lblMayorNumero.setBounds(50, 100, 150, 30);
        getContentPane().add(lblMayorNumero);

        txtMayorNumero = new JTextField();
        txtMayorNumero.setBounds(180, 100, 80, 30);
        txtMayorNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMayorNumero.setFocusable(false);
        txtMayorNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMayorNumero);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 150, 120, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        String numeroStr = txtNumero.getText();

        char[] cifras = numeroStr.toCharArray();
        char mayorCifra = cifras[0];
        char menorCifra = cifras[0];

        for (char cifra : cifras) {
            if (cifra > mayorCifra) {
                mayorCifra = cifra;
            }
            if (cifra < menorCifra) {
                menorCifra = cifra;
            }
        }

        String mayorNumero = String.valueOf(mayorCifra) + String.valueOf(menorCifra);
        txtMayorNumero.setText(mayorNumero);
    }
}
