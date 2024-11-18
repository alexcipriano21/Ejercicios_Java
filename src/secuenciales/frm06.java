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

public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;
    JTextField txtAltura, txtRadio, txtArea, txtVolumen;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm06 frame = new frm06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 310, 340);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblAltura = new JLabel("Altura");
        lblAltura.setBounds(50, 50, 80, 30);
        getContentPane().add(lblAltura);

        JLabel lblRadio = new JLabel("Radio");
        lblRadio.setBounds(50, 90, 80, 30);
        getContentPane().add(lblRadio);

        JLabel lblArea = new JLabel("Area");
        lblArea.setBounds(50, 130, 80, 30);
        getContentPane().add(lblArea);

        JLabel lblVolumen = new JLabel("Volumen");
        lblVolumen.setBounds(50, 170, 80, 30);
        getContentPane().add(lblVolumen);

        txtAltura = new JTextField();
        txtAltura.setBounds(130, 50, 110, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin( new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

        txtRadio = new JTextField();
        txtRadio.setBounds(130, 90, 110, 30);
        txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRadio.setMargin( new Insets(5, 5, 5, 5));
        getContentPane().add(txtRadio);

        txtArea = new JTextField();
        txtArea.setBounds(130, 130, 110, 30);
        txtArea.setHorizontalAlignment(SwingConstants.RIGHT);
        txtArea.setFocusable(false);
        txtArea.setMargin( new Insets(5, 5, 5, 5));
        getContentPane().add(txtArea);

        txtVolumen = new JTextField();
        txtVolumen.setBounds(130, 170, 110, 30);
        txtVolumen.setHorizontalAlignment(SwingConstants.RIGHT);
        txtVolumen.setFocusable(false);
        txtVolumen.setMargin( new Insets(5, 5, 5, 5));
        getContentPane().add(txtVolumen);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 230, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});
		
	}

    protected void btnCalcular_actionPerformed() {
        int altura = Integer.parseInt( txtAltura.getText() );
        int radio = Integer.parseInt( txtRadio.getText() );

        double area = 2 * Math.PI * radio * (radio + altura);
        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        DecimalFormat df = new DecimalFormat("###.00");
        txtArea.setText( df.format(area));
        txtVolumen.setText( df.format(volumen));

	}
        

}

