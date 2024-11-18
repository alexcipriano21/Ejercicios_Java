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

public class frm18 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad, txtPrecioUnitario, txtImporteCompra, txtDescuento, txtImporteAPagar;

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
        setBounds(0, 0, 350, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(50, 50, 100, 30);
        getContentPane().add(lblCantidad);
        
        JLabel lblPrecioUnitario = new JLabel("Precio Unitario:");
        lblPrecioUnitario.setBounds(50, 90, 100, 30);
        getContentPane().add(lblPrecioUnitario);
        
        JLabel lblImporteCompra = new JLabel("Importe de Compra:");
        lblImporteCompra.setBounds(50, 130, 150, 30);
        getContentPane().add(lblImporteCompra);
        
        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 170, 100, 30);
        getContentPane().add(lblDescuento);
        
        JLabel lblImporteAPagar = new JLabel("Importe a Pagar:");
        lblImporteAPagar.setBounds(50, 210, 150, 30);
        getContentPane().add(lblImporteAPagar);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(180, 50, 100, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);
        
        txtPrecioUnitario = new JTextField();
        txtPrecioUnitario.setBounds(180, 90, 100, 30);
        txtPrecioUnitario.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrecioUnitario.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPrecioUnitario);
        
        txtImporteCompra = new JTextField();
        txtImporteCompra.setBounds(180, 130, 100, 30);
        txtImporteCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        txtImporteCompra.setFocusable(false);
        txtImporteCompra.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtImporteCompra);
        
        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 170, 100, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setFocusable(false);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);
        
        txtImporteAPagar = new JTextField();
        txtImporteAPagar.setBounds(180, 210, 100, 30);
        txtImporteAPagar.setHorizontalAlignment(SwingConstants.RIGHT);
        txtImporteAPagar.setFocusable(false);
        txtImporteAPagar.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtImporteAPagar);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 280, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int cantidad = Integer.parseInt(txtCantidad.getText());

        double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText());
        double importeCompra = cantidad * precioUnitario;

        double descuento1 = importeCompra * 0.15;
        double importeConDescuento1 = importeCompra - descuento1;
        double descuento2 = importeConDescuento1 * 0.15;
        double importeAPagar = importeConDescuento1 - descuento2;

        double totalDescuento = descuento1 + descuento2;

        DecimalFormat df = new DecimalFormat("###.00");
        txtImporteCompra.setText(df.format(importeCompra));
        txtDescuento.setText(df.format(totalDescuento));
        txtImporteAPagar.setText(df.format(importeAPagar));
    }
}
