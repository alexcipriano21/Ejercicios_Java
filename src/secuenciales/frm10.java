package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtNumeroReves;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm10 frame = new frm10();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm10() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblNumero = new JLabel("Números: ");
        lblNumero.setBounds(50, 30, 110, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(170, 30, 80, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero);

        JLabel lblNumeroReves = new JLabel("N. al revés: ");
        lblNumeroReves.setBounds(50, 80, 110, 30);
        getContentPane().add(lblNumeroReves);

        txtNumeroReves = new JTextField();
        txtNumeroReves.setBounds(170, 80, 80, 30);
        txtNumeroReves.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumeroReves.setFocusable(false); 
        getContentPane().add(txtNumeroReves);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 130, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        String input = txtNumero.getText();
        String numeroReves = new StringBuilder(input).reverse().toString();
        txtNumeroReves.setText(numeroReves);
    }
}
