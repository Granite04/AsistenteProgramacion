package ventanas.cambiarManteniendoResolucionCordenadas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(Variables.cordX, Variables.cordY, Variables.resolucionX, Variables.resolucionY);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_4628039902600");
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitulo = new JLabel("Frame1");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblTitulo);
		
		JButton btnCambiar = new JButton("Cambiar Pantalla");
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funciones.cambioVentana(getBounds(), getWidth(), getHeight());
				Funciones.abrirFrame2();
				dispose();
			}
		});
		panel.add(btnCambiar, BorderLayout.SOUTH);
	}

}
