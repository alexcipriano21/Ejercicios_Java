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

public class frm15 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtInput, txtMayusculas, txtMinusculas;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm15 frame = new frm15();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm15() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 450, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblInput = new JLabel("Texto:");
        lblInput.setBounds(50, 50, 150, 30);
        getContentPane().add(lblInput);

        JLabel lblMayusculas = new JLabel("Mayúsculas:");
        lblMayusculas.setBounds(50, 90, 150, 30);
        getContentPane().add(lblMayusculas);

        JLabel lblMinusculas = new JLabel("Minúsculas:");
        lblMinusculas.setBounds(50, 130, 150, 30);
        getContentPane().add(lblMinusculas);

        txtInput = new JTextField();
        txtInput.setBounds(220, 50, 150, 30);
        txtInput.setHorizontalAlignment(SwingConstants.RIGHT);
        txtInput.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtInput);

        txtMayusculas = new JTextField();
        txtMayusculas.setBounds(220, 90, 150, 30);
        txtMayusculas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMayusculas.setFocusable(false);
        txtMayusculas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMayusculas);

        txtMinusculas = new JTextField();
        txtMinusculas.setBounds(220, 130, 150, 30);
        txtMinusculas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMinusculas.setFocusable(false);
        txtMinusculas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMinusculas);

        JButton btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(150, 210, 100, 30);
        getContentPane().add(btnConvertir);

        btnConvertir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnConvertir_actionPerformed();
            }
        });
    }

    protected void btnConvertir_actionPerformed() {
        String inputText = txtInput.getText();
        txtMayusculas.setText(convertirAMayusculas(inputText, 0));
        txtMinusculas.setText(convertirAMinusculas(inputText, 0));
    }

    private String convertirAMayusculas(String texto, int i) {
        if (i >= texto.length()) {
            return "";
        }
        char c = texto.charAt(i);
        char nuevoChar = (c >= 'a' && c <= 'z') ? (char) (c - 'a' + 'A') : c;
        return nuevoChar + convertirAMayusculas(texto, i + 1);
    }

    private String convertirAMinusculas(String texto, int i) {
        if (i >= texto.length()) {
            return "";
        }
        char c = texto.charAt(i);
        char nuevoChar = (c >= 'A' && c <= 'Z') ? (char) (c + 'a' - 'A') : c;
        return nuevoChar + convertirAMinusculas(texto, i + 1);
    }
}
