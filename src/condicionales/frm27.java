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

public class frm27 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMontoVendido, txtSueldoBruto, txtDescuento, txtSueldoNeto, txtPolos;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm27 frame = new frm27();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm27() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 460, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMontoVendido = new JLabel("Monto Vendido:");
        lblMontoVendido.setBounds(50, 50, 150, 30);
        getContentPane().add(lblMontoVendido);

        JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
        lblSueldoBruto.setBounds(50, 130, 150, 30);
        getContentPane().add(lblSueldoBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 170, 150, 30);
        getContentPane().add(lblDescuento);

        JLabel lblSueldoNeto = new JLabel("Sueldo Neto:");
        lblSueldoNeto.setBounds(50, 210, 150, 30);
        getContentPane().add(lblSueldoNeto);

        JLabel lblPolos = new JLabel("N° de Polos Obsequiados:");
        lblPolos.setBounds(50, 250, 180, 30);
        getContentPane().add(lblPolos);

        txtMontoVendido = new JTextField();
        txtMontoVendido.setBounds(250, 50, 120, 30);
        txtMontoVendido.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoVendido.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoVendido);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(250, 130, 120, 30);
        txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoBruto.setFocusable(false);
        txtSueldoBruto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoBruto);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(250, 170, 120, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setFocusable(false);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtSueldoNeto = new JTextField();
        txtSueldoNeto.setBounds(250, 210, 120, 30);
        txtSueldoNeto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoNeto.setFocusable(false);
        txtSueldoNeto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoNeto);

        txtPolos = new JTextField();
        txtPolos.setBounds(250, 250, 120, 30);
        txtPolos.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPolos.setFocusable(false);
        txtPolos.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPolos);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(160, 300, 120, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double montoVendido = Double.parseDouble(txtMontoVendido.getText());
        double sueldoBasico = 600;
        double comision = montoVendido * 0.15;
        double sueldoBruto = sueldoBasico + comision;

        double descuento = (sueldoBruto > 1800) ? sueldoBruto * 0.10 : sueldoBruto * 0.05;

        double sueldoNeto = sueldoBruto - descuento;

        int polos = (montoVendido > 1000) ? 3 : 1;

        DecimalFormat df = new DecimalFormat("###.00");

        txtSueldoBruto.setText(df.format(sueldoBruto));
        txtDescuento.setText(df.format(descuento));
        txtSueldoNeto.setText(df.format(sueldoNeto));
        txtPolos.setText(String.valueOf(polos));
    }
}
