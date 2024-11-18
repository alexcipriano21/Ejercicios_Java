package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm01 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDividendo, txtDivisor, txtCociente, txtResto;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm01 frame = new frm01();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm01() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 450, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDividendo = new JLabel("Dividendo:");
        lblDividendo.setBounds(50, 50, 150, 30);
        getContentPane().add(lblDividendo);

        JLabel lblDivisor = new JLabel("Divisor:");
        lblDivisor.setBounds(50, 90, 150, 30);
        getContentPane().add(lblDivisor);

        JLabel lblCociente = new JLabel("Cociente:");
        lblCociente.setBounds(50, 130, 150, 30);
        getContentPane().add(lblCociente);

        JLabel lblResto = new JLabel("Resto:");
        lblResto.setBounds(50, 170, 150, 30);
        getContentPane().add(lblResto);

        txtDividendo = new JTextField();
        txtDividendo.setBounds(220, 50, 100, 30);
        txtDividendo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDividendo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDividendo);

        txtDivisor = new JTextField();
        txtDivisor.setBounds(220, 90, 100, 30);
        txtDivisor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDivisor.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDivisor);

        txtCociente = new JTextField();
        txtCociente.setBounds(220, 130, 100, 30);
        txtCociente.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCociente.setFocusable(false);
        txtCociente.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCociente);

        txtResto = new JTextField();
        txtResto.setBounds(220, 170, 100, 30);
        txtResto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResto.setFocusable(false);
        txtResto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 210, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int dividendo = Integer.parseInt(txtDividendo.getText());
        int divisor = Integer.parseInt(txtDivisor.getText());

        if (divisor == 0) {
            txtCociente.setText("División por 0");
            txtResto.setText("");
            return;
        }

        Respuesta resultado = calcularCocienteYRestos(dividendo, divisor, 0);
        
        txtCociente.setText(String.valueOf(resultado.cociente));
        txtResto.setText(String.valueOf(resultado.resto));
    }

    private Respuesta calcularCocienteYRestos(int dividendo, int divisor, int cociente) {
        if (dividendo < divisor) {
            return new Respuesta(cociente, dividendo);  
        } else {
            return calcularCocienteYRestos(dividendo - divisor, divisor, cociente + 1);
        }
    }

    private static class Respuesta {
        int cociente;
        int resto;

        Respuesta(int cociente, int resto) {
            this.cociente = cociente;
            this.resto = resto;
        }
    }
}
