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

public class frm28 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHora24, txtHora12;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm28 frame = new frm28();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm28() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 280, 210);
        setLayout(null);
        setLocationRelativeTo(null);

        int margenIzquierdo = 20;
        int margenSuperior = 20;

        JLabel lblHora24 = new JLabel("Hora 24h:");
        lblHora24.setBounds(margenIzquierdo, margenSuperior, 100, 30);
        getContentPane().add(lblHora24);

        txtHora24 = new JTextField();
        txtHora24.setBounds(margenIzquierdo + 100, margenSuperior, 100, 30);
        txtHora24.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHora24.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHora24);

        JLabel lblHora12 = new JLabel("Hora 12h:");
        lblHora12.setBounds(margenIzquierdo, margenSuperior + 50, 100, 30);
        getContentPane().add(lblHora12);

        txtHora12 = new JTextField();
        txtHora12.setBounds(margenIzquierdo + 100, margenSuperior + 50, 100, 30);
        txtHora12.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHora12.setMargin(new Insets(5, 5, 5, 5));
        txtHora12.setFocusable(false);
        getContentPane().add(txtHora12);

        JButton btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(margenIzquierdo + 50, margenSuperior + 100, 100, 30);
        getContentPane().add(btnConvertir);

        btnConvertir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnConvertir_actionPerformed();
            }
        });
    }

    protected void btnConvertir_actionPerformed() {
        String horaIngresada = txtHora24.getText();

        if (horaIngresada.matches("\\d{2}:\\d{2}")) {
            String[] partes = horaIngresada.split(":");
            int horas = Integer.parseInt(partes[0]);
            int minutos = Integer.parseInt(partes[1]);

            if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60) {
                String periodo = (horas >= 12) ? "PM" : "AM";
                horas = (horas % 12 == 0) ? 12 : horas % 12;

                txtHora12.setText(String.format("%02d:%02d %s", horas, minutos, periodo));
            } else {
                txtHora12.setText("Hora inválida");
            }
        } else {
            txtHora12.setText("Formato inválido");
        }
    }
}
