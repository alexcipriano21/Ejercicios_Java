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

public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumeroTarjeta, txtMontoCompra, txtDescuento, txtTotalPagar;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm14 frame = new frm14();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm14() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 340);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumeroTarjeta = new JLabel("Número de Tarjeta:");
        lblNumeroTarjeta.setBounds(50, 30, 150, 30);
        getContentPane().add(lblNumeroTarjeta);

        txtNumeroTarjeta = new JTextField();
        txtNumeroTarjeta.setBounds(180, 30, 80, 30);
        txtNumeroTarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumeroTarjeta.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumeroTarjeta);

        JLabel lblMontoCompra = new JLabel("Monto de Compra:");
        lblMontoCompra.setBounds(50, 80, 150, 30);
        getContentPane().add(lblMontoCompra);

        txtMontoCompra = new JTextField();
        txtMontoCompra.setBounds(180, 80, 80, 30);
        txtMontoCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoCompra.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoCompra);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 130, 150, 30);
        getContentPane().add(lblDescuento);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 130, 80, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setFocusable(false);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        JLabel lblTotalPagar = new JLabel("Total:");
        lblTotalPagar.setBounds(50, 180, 150, 30);
        getContentPane().add(lblTotalPagar);

        txtTotalPagar = new JTextField();
        txtTotalPagar.setBounds(180, 180, 80, 30);
        txtTotalPagar.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotalPagar.setFocusable(false);
        txtTotalPagar.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTotalPagar);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(70, 230, 160, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        try {
            int numeroTarjeta = Integer.parseInt(txtNumeroTarjeta.getText());
            double montoCompra = Double.parseDouble(txtMontoCompra.getText());

            double montoDescuento;
            if (numeroTarjeta % 2 == 0 && numeroTarjeta >= 100) {
                montoDescuento = montoCompra * 0.15; 
            } else {
                montoDescuento = montoCompra * 0.05;
            }

            double totalPagar = montoCompra - montoDescuento;

            txtDescuento.setText("S/. " + String.format("%.2f", montoDescuento));
            txtTotalPagar.setText("S/. " + String.format("%.2f", totalPagar));

        } catch (NumberFormatException e) {
            txtDescuento.setText("Ingrese valores válidos.");
            txtTotalPagar.setText("");
        }
    }
}
