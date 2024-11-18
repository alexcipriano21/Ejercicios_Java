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

public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField[] txtNumbers = new JTextField[5];
    JTextField txtPromedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm14 frame = new frm14();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm14() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        for (int i = 0; i < 5; i++) {
            JLabel lblNumber = new JLabel("Número " + (i + 1));
            lblNumber.setBounds(50, 50 + (i * 40), 80, 30);
            getContentPane().add(lblNumber);

            txtNumbers[i] = new JTextField();
            txtNumbers[i].setBounds(150, 50 + (i * 40), 100, 30);
            txtNumbers[i].setHorizontalAlignment(SwingConstants.RIGHT);
            txtNumbers[i].setMargin(new Insets(5, 5, 5, 5));
            getContentPane().add(txtNumbers[i]);
        }

        JLabel lblPromedio = new JLabel("Promedio");
        lblPromedio.setBounds(50, 250, 80, 30);
        getContentPane().add(lblPromedio);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(150, 250, 100, 30);
        txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPromedio.setFocusable(false);
        txtPromedio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPromedio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 300, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double[] numbers = new double[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = Double.parseDouble(txtNumbers[i].getText());
        }

        java.util.Arrays.sort(numbers);
        
        double promedio = (numbers[3] + numbers[4]) / 2;

        DecimalFormat df = new DecimalFormat("###.00");
        txtPromedio.setText(df.format(promedio));
    }
}
