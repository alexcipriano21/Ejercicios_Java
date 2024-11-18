package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm38 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMes, txtAnio, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm38 frame = new frm38();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm38() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        int margen = 20;

        JLabel lblMes = new JLabel("Mes (1-12):");
        lblMes.setBounds(margen, margen, 100, 30);
        getContentPane().add(lblMes);

        txtMes = new JTextField();
        txtMes.setBounds(margen + 100, margen, 150, 30);
        txtMes.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtMes);

        JLabel lblAnio = new JLabel("Año:");
        lblAnio.setBounds(margen, margen + 50, 100, 30);
        getContentPane().add(lblAnio);

        txtAnio = new JTextField();
        txtAnio.setBounds(margen + 100, margen + 50, 150, 30);
        txtAnio.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtAnio);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(margen, margen + 100, 100, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(margen + 100, margen + 100, 150, 30);
        txtResultado.setFocusable(false);
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(margen + 90, margen + 150, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int mes = Integer.parseInt(txtMes.getText());
        int anio = Integer.parseInt(txtAnio.getText());

        if (mes < 1 || mes > 12) {
            txtResultado.setText("Mes inválido");
            return;
        }

        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                                  "Julio", "Agosto", "Septiembre", "Octubre", 
                                  "Noviembre", "Diciembre"};
        
        int[] diasMeses = {31, (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) ? 29 : 28, 
                           31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        txtResultado.setText(String.format("%s tiene %d días", 
            nombresMeses[mes - 1], diasMeses[mes - 1]));
    }
}
