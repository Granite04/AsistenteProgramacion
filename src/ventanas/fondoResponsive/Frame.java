package ventanas.fondoResponsive;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("serial")
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibuja la imagen de fondo en el contentPane
                if (Variables.imagenFondo != null) {
                    g.drawImage(Variables.imagenFondo, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));
        
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        contentPane.add(panel, "name_5726470735900");
        panel.setLayout(new GridLayout(0, 1, 0, 0));
        
        JLabel lbl = new JLabel("New label");
        lbl.setForeground(new Color(0, 255, 0));
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lbl);
        
        JRadioButton rdbtn = new JRadioButton("New radio button");
        rdbtn.setForeground(new Color(0, 255, 0));
        rdbtn.setOpaque(false);
        rdbtn.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(rdbtn);
        
        JCheckBox chckbx = new JCheckBox("New check box");
        chckbx.setForeground(new Color(0, 255, 0));
        chckbx.setOpaque(false);
        chckbx.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(chckbx);
        
        JButton btn = new JButton("New button");
        btn.setForeground(new Color(0, 255, 0));
        panel.add(btn);
        
     // Cargar la imagen de fondo
        try {
        	Variables.imagenFondo = ImageIO.read(getClass().getResource("fondo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
