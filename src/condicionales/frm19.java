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

public class frm19 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtSexo, txtEdad, txtCategoria;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm19 frame = new frm19();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm19() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 270);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblSexo = new JLabel("Sexo (F/M):");
        lblSexo.setBounds(50, 30, 150, 30);
        getContentPane().add(lblSexo);

        txtSexo = new JTextField();
        txtSexo.setBounds(200, 30, 60, 30);
        txtSexo.setHorizontalAlignment(SwingConstants.CENTER);
        txtSexo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSexo);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(50, 80, 150, 30);
        getContentPane().add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(200, 80, 60, 30);
        txtEdad.setHorizontalAlignment(SwingConstants.CENTER);
        txtEdad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdad);

        JLabel lblCategoria = new JLabel("Categoría:");
        lblCategoria.setBounds(50, 130, 150, 30);
        getContentPane().add(lblCategoria);

        txtCategoria = new JTextField();
        txtCategoria.setBounds(200, 130, 60, 30);
        txtCategoria.setHorizontalAlignment(SwingConstants.CENTER);
        txtCategoria.setFocusable(false);
        txtCategoria.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCategoria);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 180, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        String sexo = txtSexo.getText().trim().toUpperCase();
        int edad;

        try {
            edad = Integer.parseInt(txtEdad.getText());

            String categoria = "";

            if (sexo.equals("F")) {
                categoria = (edad < 23) ? "FA" : "FB";
            } else if (sexo.equals("M")) {
                categoria = (edad < 25) ? "MA" : "MB";
            } else {
                categoria = "Sexo inválido";
            }

            txtCategoria.setText(categoria);

        } catch (NumberFormatException e) {
            txtCategoria.setText("Edad inválida");
        }
    }
}
