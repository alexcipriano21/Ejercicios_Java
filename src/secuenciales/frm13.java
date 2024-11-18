package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm13 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCateto1, txtCateto2, txtHipotenusa;

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
        setBounds(0, 0, 320, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCateto1 = new JLabel("Cateto 1:");
        lblCateto1.setBounds(50, 50, 80, 30);
        getContentPane().add(lblCateto1);

        JLabel lblCateto2 = new JLabel("Cateto 2:");
        lblCateto2.setBounds(50, 90, 80, 30);
        getContentPane().add(lblCateto2);

        JLabel lblHipotenusa = new JLabel("Hipotenusa:");
        lblHipotenusa.setBounds(50, 130, 80, 30);
        getContentPane().add(lblHipotenusa);

        txtCateto1 = new JTextField();
        txtCateto1.setBounds(150, 50, 100, 30);
        txtCateto1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCateto1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCateto1);

        txtCateto2 = new JTextField();
        txtCateto2.setBounds(150, 90, 100, 30);
        txtCateto2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCateto2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCateto2);

        txtHipotenusa = new JTextField();
        txtHipotenusa.setBounds(150, 130, 100, 30);
        txtHipotenusa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHipotenusa.setFocusable(false);
        txtHipotenusa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHipotenusa);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 200, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double cateto1 = Double.parseDouble(txtCateto1.getText());
        double cateto2 = Double.parseDouble(txtCateto2.getText());

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        DecimalFormat df = new DecimalFormat("###.00");
        txtHipotenusa.setText(df.format(hipotenusa));
    }
}
