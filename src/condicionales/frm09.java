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

public class frm09 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCodigo, txtUnidades, txtTotalPagar, txtDescuento, txtImporteCompra;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm09 frame = new frm09();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm09() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 500, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCodigo = new JLabel("Código del producto:");
        lblCodigo.setBounds(50, 50, 150, 30);
        getContentPane().add(lblCodigo);

        JLabel lblUnidades = new JLabel("Unidades compradas:");
        lblUnidades.setBounds(50, 90, 150, 30);
        getContentPane().add(lblUnidades);

        JLabel lblImporteCompra = new JLabel("Importe de la compra:");
        lblImporteCompra.setBounds(50, 130, 150, 30);
        getContentPane().add(lblImporteCompra);

        JLabel lblDescuento = new JLabel("Descuento aplicado:");
        lblDescuento.setBounds(50, 170, 150, 30);
        getContentPane().add(lblDescuento);

        JLabel lblTotalPagar = new JLabel("Total a pagar:");
        lblTotalPagar.setBounds(50, 210, 150, 30);
        getContentPane().add(lblTotalPagar);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(220, 50, 100, 30);
        txtCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCodigo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCodigo);

        txtUnidades = new JTextField();
        txtUnidades.setBounds(220, 90, 100, 30);
        txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
        txtUnidades.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtUnidades);

        txtImporteCompra = new JTextField();
        txtImporteCompra.setBounds(220, 130, 100, 30);
        txtImporteCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        txtImporteCompra.setFocusable(false);
        txtImporteCompra.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtImporteCompra);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(220, 170, 100, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setFocusable(false);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtTotalPagar = new JTextField();
        txtTotalPagar.setBounds(220, 210, 100, 30);
        txtTotalPagar.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotalPagar.setFocusable(false);
        txtTotalPagar.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTotalPagar);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 250, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int codigo = Integer.parseInt(txtCodigo.getText());
        int unidades = Integer.parseInt(txtUnidades.getText());
        double precioUnitario = 0;
        double descuento = 0;
        double importeCompra = 0;
        double totalPagar = 0;

        if (codigo == 101) {
            precioUnitario = 17;
            if (unidades >= 1 && unidades <= 10) {
                descuento = 0.05; 
            }
        } else if (codigo == 102) {
            precioUnitario = 25;
            if (unidades >= 11 && unidades <= 20) {
                descuento = 0.08; 
            }
        } else if (codigo == 103) {
            precioUnitario = 16;
            if (unidades >= 21 && unidades <= 30) {
                descuento = 0.10; 
            }
        } else if (codigo == 104) {
            precioUnitario = 27;
            if (unidades >= 31) {
                descuento = 0.13; 
            }
        } else {
            txtImporteCompra.setText("Código inválido");
            return;
        }

        importeCompra = precioUnitario * unidades;
        double montoDescuento = importeCompra * descuento;
        totalPagar = importeCompra - montoDescuento;

        DecimalFormat df = new DecimalFormat("###.00");
        txtImporteCompra.setText(df.format(importeCompra));
        txtDescuento.setText(df.format(montoDescuento));
        txtTotalPagar.setText(df.format(totalPagar));
    }
}
