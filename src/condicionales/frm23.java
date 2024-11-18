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

public class frm23 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMatematicas, txtFisica, txtPropina, txtObsequio;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm23 frame = new frm23();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm23() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 310, 300);
        setLayout(null);
        setLocationRelativeTo(null);
    
        JLabel lblMatematicas = new JLabel("Matemáticas:");
        lblMatematicas.setBounds(30, 30, 100, 30);
        getContentPane().add(lblMatematicas);

        txtMatematicas = new JTextField();
        txtMatematicas.setBounds(150, 30, 100, 30);
        txtMatematicas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMatematicas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMatematicas);

        JLabel lblFisica = new JLabel("Física:");
        lblFisica.setBounds(30, 70, 100, 30);
        getContentPane().add(lblFisica);

        txtFisica = new JTextField();
        txtFisica.setBounds(150, 70, 100, 30);
        txtFisica.setHorizontalAlignment(SwingConstants.RIGHT);
        txtFisica.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtFisica);

        JLabel lblPropina = new JLabel("Propina total:");
        lblPropina.setBounds(30, 110, 100, 30);
        getContentPane().add(lblPropina);

        txtPropina = new JTextField();
        txtPropina.setBounds(150, 110, 100, 30);
        txtPropina.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPropina.setMargin(new Insets(5, 5, 5, 5));
        txtPropina.setFocusable(false);
        getContentPane().add(txtPropina);

        JLabel lblObsequio = new JLabel("Obsequio:");
        lblObsequio.setBounds(30, 150, 100, 30);
        getContentPane().add(lblObsequio);

        txtObsequio = new JTextField();
        txtObsequio.setBounds(150, 150, 100, 30);
        txtObsequio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtObsequio.setMargin(new Insets(5, 5, 5, 5));
        txtObsequio.setFocusable(false);
        getContentPane().add(txtObsequio);

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

        double notaMatematicas = Double.parseDouble(txtMatematicas.getText());
        double notaFisica = Double.parseDouble(txtFisica.getText());

        double propina = 0;
        String obsequio = "Sin obsequio";

        if (notaMatematicas > 17) {
            propina += 3;
        } else {
            propina += notaMatematicas * 1;
        }

        if (notaFisica > 15) {
            propina += 2;
        } else {
            propina += notaFisica * 0.50; 
        }

        double promedio = (notaMatematicas + notaFisica) / 2;

        if (promedio > 16) {
            obsequio = "Un reloj";
        }

        txtPropina.setText(String.format("S/. %.2f", propina));
        txtObsequio.setText(obsequio);
    }
}
