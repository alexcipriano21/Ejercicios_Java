package condicionales;

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

public class frm30 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCuota, txtDiaPago, txtMontoFinal;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm30 frame = new frm30();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm30() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 450, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCuota = new JLabel("Monto de la cuota:");
        lblCuota.setBounds(50, 50, 150, 30);
        getContentPane().add(lblCuota);

        JLabel lblDiaPago = new JLabel("Día de pago:");
        lblDiaPago.setBounds(50, 90, 150, 30);
        getContentPane().add(lblDiaPago);

        JLabel lblMontoFinal = new JLabel("Monto final:");
        lblMontoFinal.setBounds(50, 130, 150, 30);
        getContentPane().add(lblMontoFinal);

        txtCuota = new JTextField();
        txtCuota.setBounds(220, 50, 100, 30);
        txtCuota.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCuota.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCuota);

        txtDiaPago = new JTextField();
        txtDiaPago.setBounds(220, 90, 100, 30);
        txtDiaPago.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDiaPago.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDiaPago);

        txtMontoFinal = new JTextField();
        txtMontoFinal.setBounds(220, 130, 100, 30);
        txtMontoFinal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoFinal.setFocusable(false);
        txtMontoFinal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoFinal);

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
        double cuota = Double.parseDouble(txtCuota.getText());
        int diaPago = Integer.parseInt(txtDiaPago.getText());
        double montoFinal;

        if (diaPago >= 1 && diaPago <= 10) {
            double descuento = Math.max(5, cuota * 0.02);
            montoFinal = cuota - descuento;
        } else if (diaPago >= 11 && diaPago <= 20) {
            montoFinal = cuota;
        } else if (diaPago >= 21 && diaPago <= 31) {
            double recargo = Math.max(10, cuota * 0.03);
            montoFinal = cuota + recargo;
        } else {
            txtMontoFinal.setText("Día inválido");
            return;
        }

        DecimalFormat df = new DecimalFormat("###.00");
        txtMontoFinal.setText(df.format(montoFinal));
    }
}

