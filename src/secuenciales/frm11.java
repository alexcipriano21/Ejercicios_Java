package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm11 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2, txtResultado1, txtResultado2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm11 frame = new frm11();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm11() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 330);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblNumero1 = new JLabel("Número 1:");
        lblNumero1.setBounds(50, 30, 150, 30);
        getContentPane().add(lblNumero1);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(200, 30, 80, 30);
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero1);

        JLabel lblNumero2 = new JLabel("Número 2:");
        lblNumero2.setBounds(50, 80, 150, 30);
        getContentPane().add(lblNumero2);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(200, 80, 80, 30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero2);

        JLabel lblResultado1 = new JLabel("Resultado 1:");
        lblResultado1.setBounds(50, 130, 150, 30);
        getContentPane().add(lblResultado1);

        txtResultado1 = new JTextField();
        txtResultado1.setBounds(200, 130, 80, 30);
        txtResultado1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado1.setFocusable(false); 
        getContentPane().add(txtResultado1);

        JLabel lblResultado2 = new JLabel("Resultado 2:");
        lblResultado2.setBounds(50, 180, 150, 30);
        getContentPane().add(lblResultado2);

        txtResultado2 = new JTextField();
        txtResultado2.setBounds(200, 180, 80, 30);
        txtResultado2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado2.setFocusable(false);
        getContentPane().add(txtResultado2);

        JButton btnIntercambiar = new JButton("Calcular");
        btnIntercambiar.setBounds(100, 230, 150, 30);
        getContentPane().add(btnIntercambiar);

        btnIntercambiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnIntercambiar_actionPerformed();
            }
        });
    }

    protected void btnIntercambiar_actionPerformed() {
        String num1 = txtNumero1.getText();
        String num2 = txtNumero2.getText();
        
        char primeraCifra1 = num1.charAt(0);
        char segundaCifra1 = num1.charAt(1);
        char terceraCifra1 = num1.charAt(2);

        char primeraCifra2 = num2.charAt(0);
        char segundaCifra2 = num2.charAt(1);
        char terceraCifra2 = num2.charAt(2);

        String resultado1 = primeraCifra2 + String.valueOf(segundaCifra1) + terceraCifra2;
        String resultado2 = primeraCifra1 + String.valueOf(segundaCifra2) + terceraCifra1;

        txtResultado1.setText(resultado1);
        txtResultado2.setText(resultado2);
    }
}
