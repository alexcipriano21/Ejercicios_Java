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

public class frm24 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtVentas, txtSueldo;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm24 frame = new frm24();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm24() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblVentas = new JLabel("Ventas totales:");
        lblVentas.setBounds(30, 30, 150, 30);
        getContentPane().add(lblVentas);

        txtVentas = new JTextField();
        txtVentas.setBounds(180, 30, 100, 30);
        txtVentas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtVentas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtVentas);

        JLabel lblSueldo = new JLabel("Sueldo:");
        lblSueldo.setBounds(30, 80, 150, 30);
        getContentPane().add(lblSueldo);

        txtSueldo = new JTextField();
        txtSueldo.setBounds(180, 80, 100, 30);
        txtSueldo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldo.setMargin(new Insets(5, 5, 5, 5));
        txtSueldo.setFocusable(false);
        getContentPane().add(txtSueldo);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 150, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double ventas = Double.parseDouble(txtVentas.getText());

        double sueldo = ventas * 0.10;


        if (ventas > 5000) {
            double exceso = ventas - 5000;
            sueldo += (exceso / 500) * 25; 
        }

        txtSueldo.setText(String.format("S/. %.2f", sueldo));
    }
}
