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

public class frm02 extends JFrame {
	private static final long serialVersionUID = 1L;
    JTextField txtMetros,txtCentimetros, txtPulgadas, txtPies, txtYardas;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm02 frame = new frm02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblMetros = new JLabel("Metros");
        lblMetros.setBounds(50, 50, 80, 30);
        getContentPane().add(lblMetros);

        JLabel lblCentimetros = new JLabel("Centimetros");
        lblCentimetros.setBounds(50, 90, 80, 30);
        getContentPane().add(lblCentimetros);

        JLabel lblPulgadas = new JLabel("Pulgadas");
        lblPulgadas.setBounds(50, 130, 80, 30);
        getContentPane().add(lblPulgadas);

        JLabel lblPies = new JLabel("Pies");
        lblPies.setBounds(50, 170, 80, 30);
        getContentPane().add(lblPies);

        JLabel lblYardas = new JLabel("Yardas");
        lblYardas.setBounds(50, 210, 80, 30);
        getContentPane().add(lblYardas);

        txtMetros = new JTextField();
        txtMetros.setBounds(130, 50, 80, 30);
        txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMetros.setMargin( new Insets(5, 5, 5, 5));
        getContentPane().add(txtMetros);

        txtCentimetros = new JTextField();
        txtCentimetros.setBounds(130, 90, 80, 30);
        txtCentimetros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCentimetros.setFocusable(false);
        txtCentimetros.setMargin( new Insets(5, 5, 5, 5));
        getContentPane().add(txtCentimetros);

        txtPulgadas = new JTextField();
        txtPulgadas.setBounds(130, 130, 80, 30);
        txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPulgadas.setFocusable(false);
        txtPulgadas.setMargin( new Insets(5, 5, 5, 5));
        getContentPane().add(txtPulgadas);

        txtPies = new JTextField();
        txtPies.setBounds(130, 170, 80, 30);
        txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPies.setFocusable(false);
        txtPies.setMargin( new Insets(5, 5, 5, 5));
        getContentPane().add(txtPies);

        txtYardas = new JTextField();
        txtYardas.setBounds(130, 210, 80, 30);
        txtYardas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtYardas.setFocusable(false);
        txtYardas.setMargin( new Insets(5, 5, 5, 5));
        getContentPane().add(txtYardas);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 280, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});
		
	}

    protected void btnCalcular_actionPerformed() {
        int metros = Integer.parseInt( txtMetros.getText() );

        double centimetros = metros * 100;
        double pulgadas = centimetros / 2.54;
        double pies = pulgadas / 12;
        double yardas = pies / 3;


        DecimalFormat df = new DecimalFormat("###.00");
        txtCentimetros.setText( df.format(centimetros));
        txtPulgadas.setText( df.format(pulgadas));
        txtPies.setText( df.format(pies));
        txtYardas.setText( df.format(yardas));

		
	}
        

}
