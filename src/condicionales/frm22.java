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

public class frm22 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtUnidadesA, txtUnidadesB, txtImporteBruto, txtDescuento, txtTotalPagar;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm22 frame = new frm22();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm22() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblUnidadesA = new JLabel("Unidades de Producto A:");
        lblUnidadesA.setBounds(50, 30, 180, 30);
        getContentPane().add(lblUnidadesA);

        txtUnidadesA = new JTextField();
        txtUnidadesA.setBounds(230, 30, 100, 30);
        txtUnidadesA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtUnidadesA.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtUnidadesA);

        JLabel lblUnidadesB = new JLabel("Unidades de Producto B:");
        lblUnidadesB.setBounds(50, 70, 180, 30);
        getContentPane().add(lblUnidadesB);

        txtUnidadesB = new JTextField();
        txtUnidadesB.setBounds(230, 70, 100, 30);
        txtUnidadesB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtUnidadesB.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtUnidadesB);

        JLabel lblImporteBruto = new JLabel("Importe Bruto:");
        lblImporteBruto.setBounds(50, 120, 180, 30);
        getContentPane().add(lblImporteBruto);

        txtImporteBruto = new JTextField();
        txtImporteBruto.setBounds(230, 120, 100, 30);
        txtImporteBruto.setFocusable(false);
        getContentPane().add(txtImporteBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 160, 180, 30);
        getContentPane().add(lblDescuento);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(230, 160, 100, 30);
        txtDescuento.setFocusable(false);
        getContentPane().add(txtDescuento);

        JLabel lblTotalPagar = new JLabel("Total a Pagar:");
        lblTotalPagar.setBounds(50, 200, 180, 30);
        getContentPane().add(lblTotalPagar);

        txtTotalPagar = new JTextField();
        txtTotalPagar.setBounds(230, 200, 100, 30);
        txtTotalPagar.setFocusable(false);
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
        try {

            double precioA = 25;
            double precioB = 30;

            double descuentoA = 0.15;
            double descuentoB = 0.10;

            int unidadesA = Integer.parseInt(txtUnidadesA.getText());
            int unidadesB = Integer.parseInt(txtUnidadesB.getText());

            double importeBrutoA = unidadesA * precioA;
            double importeBrutoB = unidadesB * precioB;
            double importeBrutoTotal = importeBrutoA + importeBrutoB;

            double descuentoTotal = 0;
            if (unidadesA > 50) {
                descuentoTotal += importeBrutoA * descuentoA;
            }
            if (unidadesB > 60) {
                descuentoTotal += importeBrutoB * descuentoB;
            }

            double totalPagar = importeBrutoTotal - descuentoTotal;

            txtImporteBruto.setText(String.format("%.2f", importeBrutoTotal));
            txtDescuento.setText(String.format("%.2f", descuentoTotal));
            txtTotalPagar.setText(String.format("%.2f", totalPagar));

        } catch (NumberFormatException e) {
            txtImporteBruto.setText("Error");
            txtDescuento.setText("Error");
            txtTotalPagar.setText("Error");
        }
    }
}
