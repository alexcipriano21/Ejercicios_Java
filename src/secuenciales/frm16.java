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

public class frm16 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHorasTrabajadas, txtTarifaHoraria, txtSueldoBasico, txtSueldoBruto, txtSueldoNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm16 frame = new frm16();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm16() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 360);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblHorasTrabajadas = new JLabel("Horas Trabajadas:");
        lblHorasTrabajadas.setBounds(50, 50, 150, 30);
        getContentPane().add(lblHorasTrabajadas);
        
        JLabel lblTarifaHoraria = new JLabel("Tarifa Horaria:");
        lblTarifaHoraria.setBounds(50, 90, 150, 30);
        getContentPane().add(lblTarifaHoraria);
        
        JLabel lblSueldoBasico = new JLabel("Sueldo Básico:");
        lblSueldoBasico.setBounds(50, 130, 150, 30);
        getContentPane().add(lblSueldoBasico);
        
        JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
        lblSueldoBruto.setBounds(50, 170, 150, 30);
        getContentPane().add(lblSueldoBruto);
        
        JLabel lblSueldoNeto = new JLabel("Sueldo Neto:");
        lblSueldoNeto.setBounds(50, 210, 150, 30);
        getContentPane().add(lblSueldoNeto);

        txtHorasTrabajadas = new JTextField();
        txtHorasTrabajadas.setBounds(220, 50, 100, 30);
        txtHorasTrabajadas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHorasTrabajadas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHorasTrabajadas);
        
        txtTarifaHoraria = new JTextField();
        txtTarifaHoraria.setBounds(220, 90, 100, 30);
        txtTarifaHoraria.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTarifaHoraria.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTarifaHoraria);
        
        txtSueldoBasico = new JTextField();
        txtSueldoBasico.setBounds(220, 130, 100, 30);
        txtSueldoBasico.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoBasico.setFocusable(false);
        txtSueldoBasico.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoBasico);
        
        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(220, 170, 100, 30);
        txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoBruto.setFocusable(false);
        txtSueldoBruto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoBruto);
        
        txtSueldoNeto = new JTextField();
        txtSueldoNeto.setBounds(220, 210, 100, 30);
        txtSueldoNeto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoNeto.setFocusable(false);
        txtSueldoNeto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoNeto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 260, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int horasTrabajadas = Integer.parseInt(txtHorasTrabajadas.getText());
        
        double tarifaHoraria = Double.parseDouble(txtTarifaHoraria.getText());
        double sueldoBasico = horasTrabajadas * tarifaHoraria;
        double sueldoBruto = sueldoBasico * 1.20;        
        double sueldoNeto = sueldoBruto * 0.90;

        DecimalFormat df = new DecimalFormat("###.00");
        txtSueldoBasico.setText(df.format(sueldoBasico));
        txtSueldoBruto.setText(df.format(sueldoBruto));
        txtSueldoNeto.setText(df.format(sueldoNeto));
    }
}
