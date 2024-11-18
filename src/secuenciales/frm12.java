package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm12 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNum1, txtNum2, txtResultado1, txtResultado2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm12 frame = new frm12();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm12() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 320);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNum1 = new JLabel("Número 1:");
        lblNum1.setBounds(50, 50, 80, 30);
        getContentPane().add(lblNum1);
        
        JLabel lblNum2 = new JLabel("Número 2:");
        lblNum2.setBounds(50, 90, 80, 30);
        getContentPane().add(lblNum2);
        
        JLabel lblResultado1 = new JLabel("Resultado 1:");
        lblResultado1.setBounds(50, 130, 80, 30);
        getContentPane().add(lblResultado1);
        
        JLabel lblResultado2 = new JLabel("Resultado 2:");
        lblResultado2.setBounds(50, 170, 80, 30);
        getContentPane().add(lblResultado2);

        txtNum1 = new JTextField();
        txtNum1.setBounds(150, 50, 100, 30);
        txtNum1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNum1);
        
        txtNum2 = new JTextField();
        txtNum2.setBounds(150, 90, 100, 30);
        txtNum2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNum2);

        txtResultado1 = new JTextField();
        txtResultado1.setBounds(150, 130, 100, 30);
        txtResultado1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado1.setFocusable(false);
        txtResultado1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado1);

        txtResultado2 = new JTextField();
        txtResultado2.setBounds(150, 170, 100, 30);
        txtResultado2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado2.setFocusable(false);
        txtResultado2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado2);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 220, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {

        String num1 = txtNum1.getText();
        String num2 = txtNum2.getText();
        

        if (num1.length() == 3 && num2.length() == 3) {
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
}
