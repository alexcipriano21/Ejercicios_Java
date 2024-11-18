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

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtAngulo;
    JTextField txtClasificacion;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm03 frame = new frm03();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm03() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 220);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblAngulo = new JLabel("Ángulo:");
        lblAngulo.setBounds(50, 30, 150, 30);
        getContentPane().add(lblAngulo);

        txtAngulo = new JTextField();
        txtAngulo.setBounds(150, 30, 100, 30);
        txtAngulo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAngulo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAngulo);

        JLabel lblClasificacion = new JLabel("Clasificación:");
        lblClasificacion.setBounds(50, 70, 150, 30);
        getContentPane().add(lblClasificacion);

        txtClasificacion = new JTextField();
        txtClasificacion.setBounds(150, 70, 100, 30);
        txtClasificacion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtClasificacion.setFocusable(false);
        txtClasificacion.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtClasificacion);

        JButton btnClasificar = new JButton("Clasificar");
        btnClasificar.setBounds(100, 120, 100, 30);
        getContentPane().add(btnClasificar);

        btnClasificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnClasificar_actionPerformed();
            }
        });
    }

    protected void btnClasificar_actionPerformed() {
        double angulo = Double.parseDouble(txtAngulo.getText());
        String clasificacion;

        if (angulo == 0) {
            clasificacion = "Nulo";
        } else if (angulo > 0 && angulo < 90) {
            clasificacion = "Agudo";
        } else if (angulo == 90) {
            clasificacion = "Recto";
        } else if (angulo > 90 && angulo < 180) {
            clasificacion = "Obtuso";
        } else if (angulo == 180) {
            clasificacion = "Llano";
        } else if (angulo > 180 && angulo < 360) {
            clasificacion = "Cóncavo";
        } else if (angulo == 360) {
            clasificacion = "Completo";
        } else {
            clasificacion = "Ángulo inválido"; 
        }

        txtClasificacion.setText(clasificacion);
    }
}

