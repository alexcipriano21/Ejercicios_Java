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

public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtInicio, txtFin;
    JTextArea txtTablaMultiplicar;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm06 frame = new frm06();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm06() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 450, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número (n):");
        lblNumero.setBounds(50, 50, 150, 30);
        getContentPane().add(lblNumero);

        JLabel lblInicio = new JLabel("Inicio de la tabla (x):");
        lblInicio.setBounds(50, 90, 150, 30);
        getContentPane().add(lblInicio);

        JLabel lblFin = new JLabel("Fin de la tabla (y):");
        lblFin.setBounds(50, 130, 150, 30);
        getContentPane().add(lblFin);

        JLabel lblTabla = new JLabel("Tablas de multiplicar:");
        lblTabla.setBounds(50, 170, 150, 30);
        getContentPane().add(lblTabla);

        txtNumero = new JTextField();
        txtNumero.setBounds(220, 50, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtInicio = new JTextField();
        txtInicio.setBounds(220, 90, 100, 30);
        txtInicio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtInicio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtInicio);

        txtFin = new JTextField();
        txtFin.setBounds(220, 130, 100, 30);
        txtFin.setHorizontalAlignment(SwingConstants.RIGHT);
        txtFin.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtFin);

        txtTablaMultiplicar = new JTextArea();
        txtTablaMultiplicar.setBounds(50, 210, 300, 120);
        txtTablaMultiplicar.setEditable(false);
        getContentPane().add(txtTablaMultiplicar);

        JButton btnGenerar = new JButton("Generar tablas");
        btnGenerar.setBounds(150, 340, 120, 30);
        getContentPane().add(btnGenerar);

        btnGenerar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnGenerar_actionPerformed();
            }
        });
    }

    protected void btnGenerar_actionPerformed() {
        try {
            int numero = Integer.parseInt(txtNumero.getText());
            int inicio = Integer.parseInt(txtInicio.getText());
            int fin = Integer.parseInt(txtFin.getText());

            if (inicio > fin) {
                txtTablaMultiplicar.setText("El valor de inicio debe ser menor o igual que el valor de fin.");
                return;
            }

            StringBuilder tablasMultiplicar = new StringBuilder();
            generarTablasMultiplicar(numero, inicio, fin, tablasMultiplicar);
            txtTablaMultiplicar.setText(tablasMultiplicar.toString());

        } catch (NumberFormatException e) {
            txtTablaMultiplicar.setText("Por favor, ingrese valores válidos.");
        }
    }

    private void generarTablasMultiplicar(int numero, int inicio, int fin, StringBuilder tablasMultiplicar) {
        if (inicio > fin) {
            return;
        }

        tablasMultiplicar.append("Tabla de ").append(inicio).append(":\n");
        generarTablaMultiplicar(numero, inicio, 1, tablasMultiplicar);
        tablasMultiplicar.append("\n");

        generarTablasMultiplicar(numero, inicio + 1, fin, tablasMultiplicar);
    }

    private void generarTablaMultiplicar(int numero, int base, int i, StringBuilder tablasMultiplicar) {
        if (i > 12) {
            return;
        }

        tablasMultiplicar.append(base)
                .append(" x ")
                .append(i)
                .append(" = ")
                .append(base * i)
                .append("\n");

        generarTablaMultiplicar(numero, base, i + 1, tablasMultiplicar);
    }
}
