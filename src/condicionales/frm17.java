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

public class frm17 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDocenas, txtPrecioUnitario, txtMontoCompra, txtDescuento, txtTotalPagar, txtLapiceros;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm17 frame = new frm17();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm17() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 420);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDocenas = new JLabel("Cantidad de Docenas:");
        lblDocenas.setBounds(50, 30, 150, 30);
        getContentPane().add(lblDocenas);

        txtDocenas = new JTextField();
        txtDocenas.setBounds(220, 30, 60, 30);
        txtDocenas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDocenas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDocenas);

        JLabel lblPrecioUnitario = new JLabel("Precio Unitario:");
        lblPrecioUnitario.setBounds(50, 80, 150, 30);
        getContentPane().add(lblPrecioUnitario);

        txtPrecioUnitario = new JTextField();
        txtPrecioUnitario.setBounds(220, 80, 60, 30);
        txtPrecioUnitario.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrecioUnitario.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPrecioUnitario);

        JLabel lblMontoCompra = new JLabel("Monto de Compra:");
        lblMontoCompra.setBounds(50, 130, 150, 30);
        getContentPane().add(lblMontoCompra);

        txtMontoCompra = new JTextField();
        txtMontoCompra.setBounds(220, 130, 60, 30);
        txtMontoCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoCompra.setFocusable(false);
        txtMontoCompra.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoCompra);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 180, 150, 30);
        getContentPane().add(lblDescuento);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(220, 180, 60, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setFocusable(false);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        JLabel lblTotalPagar = new JLabel("Total:");
        lblTotalPagar.setBounds(50, 230, 150, 30);
        getContentPane().add(lblTotalPagar);

        txtTotalPagar = new JTextField();
        txtTotalPagar.setBounds(220, 230, 60, 30);
        txtTotalPagar.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotalPagar.setFocusable(false);
        txtTotalPagar.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTotalPagar);

        JLabel lblLapiceros = new JLabel("Lapiceros de Obsequio:");
        lblLapiceros.setBounds(50, 280, 150, 30);
        getContentPane().add(lblLapiceros);

        txtLapiceros = new JTextField();
        txtLapiceros.setBounds(220, 280, 60, 30);
        txtLapiceros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtLapiceros.setFocusable(false);
        txtLapiceros.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtLapiceros);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 330, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        try {
            int docenas = Integer.parseInt(txtDocenas.getText());
            double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText());

            double montoCompra = docenas * precioUnitario;

            double descuento = (docenas >= 6) ? montoCompra * 0.15 : montoCompra * 0.10;

            double totalPagar = montoCompra - descuento;

            int lapiceros = (docenas >= 30) ? (docenas / 3) * 2 : 0;

            txtMontoCompra.setText("S/. " + String.format("%.2f", montoCompra));
            txtDescuento.setText("S/. " + String.format("%.2f", descuento));
            txtTotalPagar.setText("S/. " + String.format("%.2f", totalPagar));
            txtLapiceros.setText(String.valueOf(lapiceros));

        } catch (NumberFormatException e) {
            txtMontoCompra.setText("Ingrese valores válidos.");
            txtDescuento.setText("");
            txtTotalPagar.setText("");
            txtLapiceros.setText("");
        }
    }
}
