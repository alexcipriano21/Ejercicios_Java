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

public class frm29 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHorasTrabajadas, txtPagoHora, txtSueldoBruto, txtDescuento, txtTotalPagar;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm29 frame = new frm29();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm29() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 450, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblHorasTrabajadas = new JLabel("Horas trabajadas:");
        lblHorasTrabajadas.setBounds(50, 50, 150, 30);
        getContentPane().add(lblHorasTrabajadas);

        JLabel lblPagoHora = new JLabel("Pago por hora:");
        lblPagoHora.setBounds(50, 90, 150, 30);
        getContentPane().add(lblPagoHora);

        JLabel lblSueldoBruto = new JLabel("Sueldo bruto:");
        lblSueldoBruto.setBounds(50, 130, 150, 30);
        getContentPane().add(lblSueldoBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 170, 150, 30);
        getContentPane().add(lblDescuento);

        JLabel lblTotalPagar = new JLabel("Total a pagar:");
        lblTotalPagar.setBounds(50, 210, 150, 30);
        getContentPane().add(lblTotalPagar);

        txtHorasTrabajadas = new JTextField();
        txtHorasTrabajadas.setBounds(220, 50, 100, 30);
        txtHorasTrabajadas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHorasTrabajadas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHorasTrabajadas);

        txtPagoHora = new JTextField();
        txtPagoHora.setBounds(220, 90, 100, 30);
        txtPagoHora.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPagoHora.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPagoHora);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(220, 130, 100, 30);
        txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoBruto.setFocusable(false);
        txtSueldoBruto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoBruto);

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
        btnCalcular.setBounds(150, 270, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int horasTrabajadas = Integer.parseInt(txtHorasTrabajadas.getText());
        double pagoHora = Double.parseDouble(txtPagoHora.getText());

        double sueldoBruto;
        if (horasTrabajadas <= 48) {
            sueldoBruto = horasTrabajadas * pagoHora;
        } else {
            int horasExtras = horasTrabajadas - 48;
            sueldoBruto = (48 * pagoHora) + (horasExtras * pagoHora * 1.2);
        }

        double descuento = (sueldoBruto > 1500) ? sueldoBruto * 0.11 : 0;
        double totalPagar = sueldoBruto - descuento;

        DecimalFormat df = new DecimalFormat("###.00");
        txtSueldoBruto.setText(df.format(sueldoBruto));
        txtDescuento.setText(df.format(descuento));
        txtTotalPagar.setText(df.format(totalPagar));
    }
}
