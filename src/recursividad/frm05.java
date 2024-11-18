package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JTextArea txtTablaMultiplicar;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm05 frame = new frm05();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm05() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 450, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número (n):");
        lblNumero.setBounds(50, 50, 150, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(220, 50, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        JLabel lblTabla = new JLabel("Tabla de multiplicar:");
        lblTabla.setBounds(50, 90, 150, 30);
        getContentPane().add(lblTabla);

        txtTablaMultiplicar = new JTextArea();
        txtTablaMultiplicar.setBounds(50, 130, 300, 150);
        txtTablaMultiplicar.setEditable(false);
        getContentPane().add(txtTablaMultiplicar);

        JButton btnGenerar = new JButton("Generar tabla");
        btnGenerar.setBounds(150, 290, 120, 30);
        getContentPane().add(btnGenerar);

        btnGenerar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnGenerar_actionPerformed();
            }
        });
    }

    protected void btnGenerar_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        StringBuilder tablaMultiplicar = new StringBuilder();

        generarTablaMultiplicar(numero, 1, tablaMultiplicar);

        txtTablaMultiplicar.setText(tablaMultiplicar.toString());
    }

    private void generarTablaMultiplicar(int numero, int i, StringBuilder tablaMultiplicar) {
        if (i > 12) {
            return;
        }

        tablaMultiplicar.append(numero)
                .append(" x ")
                .append(i)
                .append(" = ")
                .append(numero * i)
                .append("\n");

        generarTablaMultiplicar(numero, i + 1, tablaMultiplicar);
    }
}
