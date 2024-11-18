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

public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtRadio, txtAltura, txtAreaBase, txtAreaLateral, txtAreaTotal;

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
        setBounds(0, 0, 350, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblRadio = new JLabel("Radio: ");
        lblRadio.setBounds(50, 30, 80, 30);
        getContentPane().add(lblRadio);

        JLabel lblAltura = new JLabel("Altura: ");
        lblAltura.setBounds(50, 70, 80, 30);
        getContentPane().add(lblAltura);

        JLabel lblAreaBase = new JLabel("Área Base: ");
        lblAreaBase.setBounds(50, 150, 80, 30);
        getContentPane().add(lblAreaBase);

        JLabel lblAreaLateral = new JLabel("Área Lateral: ");
        lblAreaLateral.setBounds(50, 190, 80, 30);
        getContentPane().add(lblAreaLateral);

        JLabel lblAreaTotal = new JLabel("Área Total: ");
        lblAreaTotal.setBounds(50, 230, 80, 30);
        getContentPane().add(lblAreaTotal);

        txtRadio = new JTextField();
        txtRadio.setBounds(160, 30, 120, 30);
        txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtRadio);

        txtAltura = new JTextField();
        txtAltura.setBounds(160, 70, 120, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtAltura);

        txtAreaBase = new JTextField();
        txtAreaBase.setBounds(160, 150, 120, 30);
        txtAreaBase.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAreaBase.setFocusable(false);
        getContentPane().add(txtAreaBase);

        txtAreaLateral = new JTextField();
        txtAreaLateral.setBounds(160, 190, 120, 30);
        txtAreaLateral.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAreaLateral.setFocusable(false);
        getContentPane().add(txtAreaLateral);

        txtAreaTotal = new JTextField();
        txtAreaTotal.setBounds(160, 230, 120, 30);
        txtAreaTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAreaTotal.setFocusable(false);
        getContentPane().add(txtAreaTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 290, 130, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double radio = Double.parseDouble(txtRadio.getText());
        double altura = Double.parseDouble(txtAltura.getText());

        double areaBase = Math.PI * Math.pow(radio, 2);
        double areaLateral = 2 * Math.PI * radio * altura;
        double areaTotal = 2 * areaBase + areaLateral;

        DecimalFormat df = new DecimalFormat("###.00");
        txtAreaBase.setText(df.format(areaBase));
        txtAreaLateral.setText(df.format(areaLateral));
        txtAreaTotal.setText(df.format(areaTotal));
    }
}
