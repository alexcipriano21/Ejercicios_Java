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

public class frm25 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtSueldoBruto, txtNumeroHijos, txtBonificacion, txtSueldoNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm25 frame = new frm25();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm25() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 390, 370);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblSueldoBruto = new JLabel("Sueldo Bruto (S/.):");
        lblSueldoBruto.setBounds(50, 50, 150, 30);
        getContentPane().add(lblSueldoBruto);

        JLabel lblNumeroHijos = new JLabel("Número de Hijos:");
        lblNumeroHijos.setBounds(50, 130, 150, 30);
        getContentPane().add(lblNumeroHijos);

        JLabel lblBonificacion = new JLabel("Bonificación (S/.):");
        lblBonificacion.setBounds(50, 170, 150, 30);
        getContentPane().add(lblBonificacion);

        JLabel lblSueldoNeto = new JLabel("Sueldo Neto (S/.):");
        lblSueldoNeto.setBounds(50, 210, 150, 30);
        getContentPane().add(lblSueldoNeto);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(220, 50, 100, 30);
        txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoBruto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoBruto);

        txtNumeroHijos = new JTextField();
        txtNumeroHijos.setBounds(220, 130, 100, 30);
        txtNumeroHijos.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumeroHijos.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumeroHijos);

        txtBonificacion = new JTextField();
        txtBonificacion.setBounds(220, 170, 100, 30);
        txtBonificacion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBonificacion.setFocusable(false);
        txtBonificacion.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBonificacion);

        txtSueldoNeto = new JTextField();
        txtSueldoNeto.setBounds(220, 210, 100, 30);
        txtSueldoNeto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoNeto.setFocusable(false);
        txtSueldoNeto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoNeto);

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
        double sueldoBruto = Double.parseDouble(txtSueldoBruto.getText());
        int numeroHijos = Integer.parseInt(txtNumeroHijos.getText());
        
        double bonificacion;
        if (numeroHijos > 1) {
            
            bonificacion = sueldoBruto * 0.125 + (40 * numeroHijos);
        } else {

            bonificacion = sueldoBruto * 0.10;
        }
        
        double sueldoNeto = sueldoBruto + bonificacion;

        DecimalFormat df = new DecimalFormat("###.00");

        txtBonificacion.setText(df.format(bonificacion));
        txtSueldoNeto.setText(df.format(sueldoNeto));
    }
}
