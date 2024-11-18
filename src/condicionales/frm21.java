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

public class frm21 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumeroEmpleado, txtEstadoCivil, txtEdad, txtSexo;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm21 frame = new frm21();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm21() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 410, 320);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumeroEmpleado = new JLabel("Número de Empleado:");
        lblNumeroEmpleado.setBounds(50, 30, 150, 30);
        getContentPane().add(lblNumeroEmpleado);

        txtNumeroEmpleado = new JTextField();
        txtNumeroEmpleado.setBounds(200, 30, 150, 30);
        txtNumeroEmpleado.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumeroEmpleado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumeroEmpleado);

        JLabel lblEstadoCivil = new JLabel("Estado Civil:");
        lblEstadoCivil.setBounds(50, 80, 150, 30);
        getContentPane().add(lblEstadoCivil);

        txtEstadoCivil = new JTextField();
        txtEstadoCivil.setBounds(200, 80, 150, 30);
        txtEstadoCivil.setFocusable(false);
        getContentPane().add(txtEstadoCivil);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(50, 130, 150, 30);
        getContentPane().add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(200, 130, 150, 30);
        txtEdad.setFocusable(false);
        getContentPane().add(txtEdad);

        JLabel lblSexo = new JLabel("Sexo:");
        lblSexo.setBounds(50, 180, 150, 30);
        getContentPane().add(lblSexo);

        txtSexo = new JTextField();
        txtSexo.setBounds(200, 180, 150, 30);
        txtSexo.setFocusable(false);
        getContentPane().add(txtSexo);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 230, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        try {
            int numero = Integer.parseInt(txtNumeroEmpleado.getText());

            if (numero < 1000 || numero > 9999) {
                txtEstadoCivil.setText("Número inválido");
                txtEdad.setText("");
                txtSexo.setText("");
                return;
            }

            int estadoCivil = (numero / 1000) % 10;
            int edad = (numero / 10) % 100;
            int sexo = numero % 10;

            String estadoCivilStr;
            switch (estadoCivil) {
                case 1:
                    estadoCivilStr = "Soltero";
                    break;
                case 2:
                    estadoCivilStr = "Casado";
                    break;
                case 3:
                    estadoCivilStr = "Divorciado";
                    break;
                case 4:
                    estadoCivilStr = "Viudo";
                    break;
                default:
                    estadoCivilStr = "Desconocido";
                    break;
            }

            String sexoStr;
            if (sexo == 1) {
                sexoStr = "Masculino";
            } else if (sexo == 2) {
                sexoStr = "Femenino";
            } else {
                sexoStr = "Desconocido";
            }

            txtEstadoCivil.setText(estadoCivilStr);
            txtEdad.setText(String.valueOf(edad));
            txtSexo.setText(sexoStr);

        } catch (NumberFormatException e) {
            txtEstadoCivil.setText("Entrada inválida");
            txtEdad.setText("");
            txtSexo.setText("");
        }
    }
}
