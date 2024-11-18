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

public class frm02 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtUnidades, txtImporteCompra, txtDescuento, txtTotalPagar, txtCaramelos;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm02 frame = new frm02();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm02() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblUnidades = new JLabel("Cantidad de Unidades:");
        lblUnidades.setBounds(50, 50, 150, 30);
        getContentPane().add(lblUnidades);

        JLabel lblImporteCompra = new JLabel("Importe:");
        lblImporteCompra.setBounds(50, 100, 150, 30);
        getContentPane().add(lblImporteCompra);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 150, 150, 30);
        getContentPane().add(lblDescuento);

        JLabel lblTotalPagar = new JLabel("Total a Pagar:");
        lblTotalPagar.setBounds(50, 200, 150, 30);
        getContentPane().add(lblTotalPagar);

        JLabel lblCaramelos = new JLabel("Caramelos:");
        lblCaramelos.setBounds(50, 250, 150, 30);
        getContentPane().add(lblCaramelos);

        txtUnidades = new JTextField();
        txtUnidades.setBounds(220, 50, 100, 30);
        txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
        txtUnidades.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtUnidades);

        txtImporteCompra = new JTextField();
        txtImporteCompra.setBounds(220, 100, 100, 30);
        txtImporteCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        txtImporteCompra.setFocusable(false);
        txtImporteCompra.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtImporteCompra);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(220, 150, 100, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setFocusable(false);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtTotalPagar = new JTextField();
        txtTotalPagar.setBounds(220, 200, 100, 30);
        txtTotalPagar.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotalPagar.setFocusable(false);
        txtTotalPagar.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTotalPagar);

        txtCaramelos = new JTextField();
        txtCaramelos.setBounds(220, 250, 100, 30);
        txtCaramelos.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCaramelos.setFocusable(false);
        txtCaramelos.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCaramelos);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 300, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int unidades = Integer.parseInt(txtUnidades.getText());
        double precioUnitario = 20.0;
        double importeCompra = unidades * precioUnitario;
        double descuento;
        double totalPagar;
        int caramelos;

        if (importeCompra > 700) {
            descuento = importeCompra * 0.16;
        } else if (importeCompra >= 501) {
            descuento = importeCompra * 0.14;
        } else {
            descuento = importeCompra * 0.12;
        }

        totalPagar = importeCompra - descuento;

        if (unidades >= 1 && unidades <= 50) {
            caramelos = 5;
        } else if (unidades >= 51 && unidades <= 100) {
            caramelos = 10;
        } else {
            caramelos = 15;
        }

        txtImporteCompra.setText(String.format("%.2f", importeCompra));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtTotalPagar.setText(String.format("%.2f", totalPagar));
        txtCaramelos.setText(String.valueOf(caramelos));
    }
}
