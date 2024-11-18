package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPies, txtPulgadas, txtMetros;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm04 frame = new frm04();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm04() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblPies = new JLabel("Pies");
        lblPies.setBounds(50, 30, 80, 30);
        getContentPane().add(lblPies);

        JLabel lblPulgadas = new JLabel("Pulgadas");
        lblPulgadas.setBounds(50, 70, 80, 30);
        getContentPane().add(lblPulgadas);

        JLabel lblMetros = new JLabel("Estatura en Metros");
        lblMetros.setBounds(50, 150, 150, 30);
        getContentPane().add(lblMetros);

        txtPies = new JTextField();
        txtPies.setBounds(160, 30, 120, 30);
        txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPies);

        txtPulgadas = new JTextField();
        txtPulgadas.setBounds(160, 70, 120, 30);
        txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPulgadas);

        txtMetros = new JTextField();
        txtMetros.setBounds(160, 150, 120, 30);
        txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMetros.setFocusable(false);
        getContentPane().add(txtMetros);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 200, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double pies = Double.parseDouble(txtPies.getText());
        double pulgadas = Double.parseDouble(txtPulgadas.getText());

        double totalMetros = (pies * 0.3048) + (pulgadas * 0.0254);

        DecimalFormat df = new DecimalFormat("###.00");
        txtMetros.setText(df.format(totalMetros));
    }
}
