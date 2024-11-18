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

public class frm18 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMontoDonacion, txtCentroSalud, txtComedorNinos, txtInversionBolsa;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm18 frame = new frm18();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm18() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 380, 330);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMontoDonacion = new JLabel("Monto de Donación($):");
        lblMontoDonacion.setBounds(50, 30, 200, 30);
        getContentPane().add(lblMontoDonacion);

        txtMontoDonacion = new JTextField();
        txtMontoDonacion.setBounds(220, 30, 100, 30);
        txtMontoDonacion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoDonacion.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoDonacion);

        JLabel lblCentroSalud = new JLabel("Centro de Salud:");
        lblCentroSalud.setBounds(50, 80, 150, 30);
        getContentPane().add(lblCentroSalud);

        txtCentroSalud = new JTextField();
        txtCentroSalud.setBounds(220, 80, 100, 30);
        txtCentroSalud.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCentroSalud.setFocusable(false);
        txtCentroSalud.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCentroSalud);

        JLabel lblComedorNinos = new JLabel("Comedor de Niños:");
        lblComedorNinos.setBounds(50, 130, 150, 30);
        getContentPane().add(lblComedorNinos);

        txtComedorNinos = new JTextField();
        txtComedorNinos.setBounds(220, 130, 100, 30);
        txtComedorNinos.setHorizontalAlignment(SwingConstants.RIGHT);
        txtComedorNinos.setFocusable(false);
        txtComedorNinos.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtComedorNinos);

        JLabel lblInversionBolsa = new JLabel("Inversión en Bolsa:");
        lblInversionBolsa.setBounds(50, 180, 150, 30);
        getContentPane().add(lblInversionBolsa);

        txtInversionBolsa = new JTextField();
        txtInversionBolsa.setBounds(220, 180, 100, 30);
        txtInversionBolsa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtInversionBolsa.setFocusable(false);
        txtInversionBolsa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtInversionBolsa);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 230, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        try {
            double montoDonacion = Double.parseDouble(txtMontoDonacion.getText());

            double centroSalud;
            double comedorNinos;
            double inversionBolsa;

            if (montoDonacion >= 10000) {
                centroSalud = montoDonacion * 0.30;
                comedorNinos = montoDonacion * 0.50;
                inversionBolsa = montoDonacion - (centroSalud + comedorNinos);
            } else {
                centroSalud = montoDonacion * 0.25;
                comedorNinos = montoDonacion * 0.60;
                inversionBolsa = montoDonacion - (centroSalud + comedorNinos);
            }

            txtCentroSalud.setText(String.format("%.2f", centroSalud));
            txtComedorNinos.setText(String.format("%.2f", comedorNinos));
            txtInversionBolsa.setText(String.format("%.2f", inversionBolsa));

        } catch (NumberFormatException e) {
            txtCentroSalud.setText("Ingrese valores válidos.");
            txtComedorNinos.setText("");
            txtInversionBolsa.setText("");
        }
    }
}
