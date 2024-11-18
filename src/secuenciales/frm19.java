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

public class frm19 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtMontoVendido, txtComision, txtSueldoBruto, txtDescuento, txtSueldoNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm19 frame = new frm19();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm19() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 360, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblMontoVendido = new JLabel("Monto Vendido:");
        lblMontoVendido.setBounds(50, 50, 120, 30);
        getContentPane().add(lblMontoVendido);
        
        JLabel lblComision = new JLabel("Comisión:");
        lblComision.setBounds(50, 90, 120, 30);
        getContentPane().add(lblComision);
        
        JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
        lblSueldoBruto.setBounds(50, 130, 120, 30);
        getContentPane().add(lblSueldoBruto);
        
        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 170, 120, 30);
        getContentPane().add(lblDescuento);
        
        JLabel lblSueldoNeto = new JLabel("Sueldo Neto:");
        lblSueldoNeto.setBounds(50, 210, 120, 30);
        getContentPane().add(lblSueldoNeto);

        txtMontoVendido = new JTextField();
        txtMontoVendido.setBounds(180, 50, 100, 30);
        txtMontoVendido.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoVendido.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoVendido);
        
        txtComision = new JTextField();
        txtComision.setBounds(180, 90, 100, 30);
        txtComision.setHorizontalAlignment(SwingConstants.RIGHT);
        txtComision.setFocusable(false);
        txtComision.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtComision);
        
        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(180, 130, 100, 30);
        txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoBruto.setFocusable(false);
        txtSueldoBruto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoBruto);
        
        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 170, 100, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setFocusable(false);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);
        
        txtSueldoNeto = new JTextField();
        txtSueldoNeto.setBounds(180, 210, 100, 30);
        txtSueldoNeto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoNeto.setFocusable(false);
        txtSueldoNeto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoNeto);

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
        double sueldoBasico = 500.0; 
        double montoVendido = Double.parseDouble(txtMontoVendido.getText());
        double comision = montoVendido * 0.09;
        double sueldoBruto = sueldoBasico + comision;
        double descuento = sueldoBruto * 0.11;
        double sueldoNeto = sueldoBruto - descuento;

        DecimalFormat df = new DecimalFormat("###.00");
        txtComision.setText(df.format(comision));
        txtSueldoBruto.setText(df.format(sueldoBruto));
        txtDescuento.setText(df.format(descuento));
        txtSueldoNeto.setText(df.format(sueldoNeto));
    }
}
