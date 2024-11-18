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

public class frm07 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtBase, txtAltura, txtArea, txtPerimetro;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm07 frame = new frm07();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm07() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 350);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblBase = new JLabel("Base: ");
        lblBase.setBounds(50, 30, 80, 30);
        getContentPane().add(lblBase);

        JLabel lblAltura = new JLabel("Altura: ");
        lblAltura.setBounds(50, 70, 80, 30);
        getContentPane().add(lblAltura);

        JLabel lblArea = new JLabel("Área: ");
        lblArea.setBounds(50, 130, 80, 30);
        getContentPane().add(lblArea);

        JLabel lblPerimetro = new JLabel("Perímetro: ");
        lblPerimetro.setBounds(50, 170, 80, 30);
        getContentPane().add(lblPerimetro);

        txtBase = new JTextField();
        txtBase.setBounds(160, 30, 120, 30);
        txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtBase);

        txtAltura = new JTextField();
        txtAltura.setBounds(160, 70, 120, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtAltura);

        txtArea = new JTextField();
        txtArea.setBounds(160, 130, 120, 30);
        txtArea.setHorizontalAlignment(SwingConstants.RIGHT);
        txtArea.setFocusable(false);
        getContentPane().add(txtArea);

        txtPerimetro = new JTextField();
        txtPerimetro.setBounds(160, 170, 120, 30);
        txtPerimetro.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPerimetro.setFocusable(false);
        getContentPane().add(txtPerimetro);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 230, 130, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double base = Double.parseDouble(txtBase.getText());
        double altura = Double.parseDouble(txtAltura.getText());

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        DecimalFormat df = new DecimalFormat("###.00");
        txtArea.setText(df.format(area));
        txtPerimetro.setText(df.format(perimetro));
    }
}
