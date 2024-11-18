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

public class frm26 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMontoCompra, txtPrestamoBanco, txtInteres, txtDineroPropio;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm26 frame = new frm26();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm26() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 420, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMontoCompra = new JLabel("Monto de Compra:");
        lblMontoCompra.setBounds(50, 50, 150, 30);
        getContentPane().add(lblMontoCompra);

        JLabel lblPrestamoBanco = new JLabel("Préstamo del Banco:");
        lblPrestamoBanco.setBounds(50, 130, 150, 30);
        getContentPane().add(lblPrestamoBanco);

        JLabel lblInteres = new JLabel("Interés del Banco:");
        lblInteres.setBounds(50, 170, 150, 30);
        getContentPane().add(lblInteres);

        JLabel lblDineroPropio = new JLabel("Dinero Propio:");
        lblDineroPropio.setBounds(50, 210, 150, 30);
        getContentPane().add(lblDineroPropio);

        txtMontoCompra = new JTextField();
        txtMontoCompra.setBounds(220, 50, 120, 30);
        txtMontoCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoCompra.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoCompra);

        txtPrestamoBanco = new JTextField();
        txtPrestamoBanco.setBounds(220, 130, 120, 30);
        txtPrestamoBanco.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrestamoBanco.setFocusable(false);
        txtPrestamoBanco.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPrestamoBanco);

        txtInteres = new JTextField();
        txtInteres.setBounds(220, 170, 120, 30);
        txtInteres.setHorizontalAlignment(SwingConstants.RIGHT);
        txtInteres.setFocusable(false);
        txtInteres.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtInteres);

        txtDineroPropio = new JTextField();
        txtDineroPropio.setBounds(220, 210, 120, 30);
        txtDineroPropio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDineroPropio.setFocusable(false);
        txtDineroPropio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDineroPropio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 280, 120, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double montoCompra = Double.parseDouble(txtMontoCompra.getText());
        double porcentajePrestamo = (montoCompra > 5000) ? 0.30 : 0.20;

        double prestamoBanco = montoCompra * porcentajePrestamo;
        double interes = prestamoBanco * 0.10;
        double dineroPropio = montoCompra - prestamoBanco;

        DecimalFormat df = new DecimalFormat("###.00");

        txtPrestamoBanco.setText(df.format(prestamoBanco));
        txtInteres.setText(df.format(interes));
        txtDineroPropio.setText(df.format(dineroPropio));
    }
}
