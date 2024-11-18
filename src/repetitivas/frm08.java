package repetitivas;

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
    JTextField txtBase, txtExponente, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm08 frame = new frm08();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm08() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblBase = new JLabel("Base (n):");
        lblBase.setBounds(50, 50, 150, 30);
        getContentPane().add(lblBase);

        JLabel lblExponente = new JLabel("Exponente (m):");
        lblExponente.setBounds(50, 90, 150, 30);
        getContentPane().add(lblExponente);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 150, 150, 30);
        getContentPane().add(lblResultado);

        txtBase = new JTextField();
        txtBase.setBounds(150, 50, 100, 30);
        txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBase.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBase);

        txtExponente = new JTextField();
        txtExponente.setBounds(150, 90, 100, 30);
        txtExponente.setHorizontalAlignment(SwingConstants.RIGHT);
        txtExponente.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtExponente);

        txtResultado = new JTextField();
        txtResultado.setBounds(150, 150, 100, 30);
        txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado.setFocusable(false);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Calcular Potencia");
        btnCalcular.setBounds(120, 200, 150, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        try {
            int base = Integer.parseInt(txtBase.getText());
            int exponente = Integer.parseInt(txtExponente.getText());

            int resultado = calcularPotencia(base, exponente);

            txtResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            txtResultado.setText("Por favor ingrese números válidos.");
        }
    }

    public int calcularPotencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base; 
        }
        return resultado;
    }
}
