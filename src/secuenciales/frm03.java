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

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtKilometros, txtPies, txtMillas, txtMetros, txtYardas;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm03 frame = new frm03();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm03() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 310, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblKilometros = new JLabel("Kilómetros");
        lblKilometros.setBounds(50, 30, 80, 30);
        getContentPane().add(lblKilometros);

        JLabel lblPies = new JLabel("Pies");
        lblPies.setBounds(50, 70, 80, 30);
        getContentPane().add(lblPies);

        JLabel lblMillas = new JLabel("Millas");
        lblMillas.setBounds(50, 110, 80, 30);
        getContentPane().add(lblMillas);

        JLabel lblMetros = new JLabel("Total en Metros");
        lblMetros.setBounds(50, 190, 100, 30);
        getContentPane().add(lblMetros);

        JLabel lblYardas = new JLabel("Total en Yardas");
        lblYardas.setBounds(50, 230, 100, 30);
        getContentPane().add(lblYardas);

        txtKilometros = new JTextField();
        txtKilometros.setBounds(160, 30, 80, 30);
        txtKilometros.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtKilometros);

        txtPies = new JTextField();
        txtPies.setBounds(160, 70, 80, 30);
        txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPies);

        txtMillas = new JTextField();
        txtMillas.setBounds(160, 110, 80, 30);
        txtMillas.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtMillas);

        txtMetros = new JTextField();
        txtMetros.setBounds(160, 190, 80, 30);
        txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMetros.setFocusable(false);
        getContentPane().add(txtMetros);

        txtYardas = new JTextField();
        txtYardas.setBounds(160, 230, 80, 30);
        txtYardas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtYardas.setFocusable(false);
        getContentPane().add(txtYardas);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 290, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double kilometros = Double.parseDouble(txtKilometros.getText());
        double pies = Double.parseDouble(txtPies.getText());
        double millas = Double.parseDouble(txtMillas.getText());

        double totalMetros = (kilometros * 1000) + (pies / 3.2808) + (millas * 1609);
        double totalYardas = totalMetros * 1.09361;

        DecimalFormat df = new DecimalFormat("###.00");
        txtMetros.setText(df.format(totalMetros));
        txtYardas.setText(df.format(totalYardas));
    }
}
