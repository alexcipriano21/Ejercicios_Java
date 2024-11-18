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

public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtExamenesAprobados, txtPropinaTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm08 frame = new frm08();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm08() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 240);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblExamenesAprobados = new JLabel("Exámenes Aprobados:");
        lblExamenesAprobados.setBounds(30, 30, 150, 30);
        getContentPane().add(lblExamenesAprobados);

        txtExamenesAprobados = new JTextField();
        txtExamenesAprobados.setBounds(180, 30, 100, 30);
        txtExamenesAprobados.setHorizontalAlignment(SwingConstants.RIGHT);
        txtExamenesAprobados.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtExamenesAprobados);

        JLabel lblPropinaTotal = new JLabel("Propina Total:");
        lblPropinaTotal.setBounds(30, 80, 150, 30);
        getContentPane().add(lblPropinaTotal);

        txtPropinaTotal = new JTextField();
        txtPropinaTotal.setBounds(180, 80, 100, 30);
        txtPropinaTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPropinaTotal.setFocusable(false);
        txtPropinaTotal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPropinaTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 130, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int propinaBase = 20;
        int propinaPorExamen = 5; 

        int examenesAprobados = Integer.parseInt(txtExamenesAprobados.getText());

        int propinaTotal = propinaBase + (examenesAprobados * propinaPorExamen);

        txtPropinaTotal.setText(String.valueOf(propinaTotal));
    }
}
