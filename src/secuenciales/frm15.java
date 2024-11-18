package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm15 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtJuan, txtRosa, txtDaniel, txtTotalDolares, txtPorcentajeJuan, txtPorcentajeRosa, txtPorcentajeDaniel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm15 frame = new frm15();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm15() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblJuan = new JLabel("Juan (USD):");
        lblJuan.setBounds(50, 50, 150, 30);
        getContentPane().add(lblJuan);
        
        JLabel lblRosa = new JLabel("Rosa (USD):");
        lblRosa.setBounds(50, 90, 150, 30);
        getContentPane().add(lblRosa);
        
        JLabel lblDaniel = new JLabel("Daniel (S/.):");
        lblDaniel.setBounds(50, 130, 150, 30);
        getContentPane().add(lblDaniel);
        
        JLabel lblTotalDolares = new JLabel("Total en Dólares:");
        lblTotalDolares.setBounds(50, 210, 150, 30);
        getContentPane().add(lblTotalDolares);
        
        JLabel lblPorcentajeJuan = new JLabel("Porcentaje Juan:");
        lblPorcentajeJuan.setBounds(50, 250, 150, 30);
        getContentPane().add(lblPorcentajeJuan);
        
        JLabel lblPorcentajeRosa = new JLabel("Porcentaje Rosa:");
        lblPorcentajeRosa.setBounds(50, 290, 150, 30);
        getContentPane().add(lblPorcentajeRosa);
        
        JLabel lblPorcentajeDaniel = new JLabel("Porcentaje Daniel:");
        lblPorcentajeDaniel.setBounds(50, 330, 150, 30);
        getContentPane().add(lblPorcentajeDaniel);

        txtJuan = new JTextField();
        txtJuan.setBounds(220, 50, 100, 30);
        txtJuan.setHorizontalAlignment(SwingConstants.RIGHT);
        txtJuan.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtJuan);
        
        txtRosa = new JTextField();
        txtRosa.setBounds(220, 90, 100, 30);
        txtRosa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRosa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRosa);
        
        txtDaniel = new JTextField();
        txtDaniel.setBounds(220, 130, 100, 30);
        txtDaniel.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDaniel.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDaniel);
        
        txtTotalDolares = new JTextField();
        txtTotalDolares.setBounds(220, 210, 100, 30);
        txtTotalDolares.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotalDolares.setFocusable(false);
        txtTotalDolares.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTotalDolares);
        
        txtPorcentajeJuan = new JTextField();
        txtPorcentajeJuan.setBounds(220, 250, 100, 30);
        txtPorcentajeJuan.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPorcentajeJuan.setFocusable(false);
        txtPorcentajeJuan.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPorcentajeJuan);
        
        txtPorcentajeRosa = new JTextField();
        txtPorcentajeRosa.setBounds(220, 290, 100, 30);
        txtPorcentajeRosa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPorcentajeRosa.setFocusable(false);
        txtPorcentajeRosa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPorcentajeRosa);
        
        txtPorcentajeDaniel = new JTextField();
        txtPorcentajeDaniel.setBounds(220, 330, 100, 30);
        txtPorcentajeDaniel.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPorcentajeDaniel.setFocusable(false);
        txtPorcentajeDaniel.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPorcentajeDaniel);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 390, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double aporteJuan = Double.parseDouble(txtJuan.getText());
        double aporteRosa = Double.parseDouble(txtRosa.getText());
        double aporteDaniel = Double.parseDouble(txtDaniel.getText());
        
        double aporteDanielDolares = aporteDaniel / 3.00;
        
        double capitalTotalDolares = aporteJuan + aporteRosa + aporteDanielDolares;

        double porcentajeJuan = (aporteJuan / capitalTotalDolares) * 100;
        double porcentajeRosa = (aporteRosa / capitalTotalDolares) * 100;
        double porcentajeDaniel = (aporteDanielDolares / capitalTotalDolares) * 100;

        DecimalFormat df = new DecimalFormat("###.00");
        txtTotalDolares.setText(df.format(capitalTotalDolares));
        txtPorcentajeJuan.setText(df.format(porcentajeJuan) + " %");
        txtPorcentajeRosa.setText(df.format(porcentajeRosa) + " %");
        txtPorcentajeDaniel.setText(df.format(porcentajeDaniel) + " %");
    }
}
