package raizPorIteracion;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Choice;

public class Main extends JFrame {

	private JPanel contentPane;
	private Button calcular;
	private JLabel lblCerrar;
	int xx, xy;
	private JPanel panel;
	private JLabel label;
	private JLabel lblX_1;
	private JLabel lblX_2;
	private JLabel lblX_5;
	private JLabel lblX_4;
	private JLabel lblX_3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setUndecorated(true);
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public Main() {
		
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 462);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx=e.getX();
				xy=e.getY();
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x=arg0.getXOnScreen();
				int y=arg0.getYOnScreen();
				Main.this.setLocation(x-xx,y- xy);
			}
		});
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			calcular = new Button("Calcular Raíz");
			calcular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			calcular.setFont(new Font("Quicksand", Font.BOLD, 18));
			calcular.setForeground(new Color(255, 255, 255));
			calcular.setBackground(new Color(56,124,175));
			calcular.setBounds(514, 383, 175, 33);
			contentPane.add(calcular);
		}
		
		{
			lblCerrar = new JLabel("X");
			lblCerrar.setBackground(Color.WHITE);
			lblCerrar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					System.exit(0);;
				}

			});
			lblCerrar.setForeground(new Color(255, 255, 255));
			lblCerrar.setFont(new Font("Helvetica LT Std", Font.BOLD, 14));
			lblCerrar.setHorizontalAlignment(SwingConstants.CENTER);
			lblCerrar.setBounds(695, 0, 36, 22);
			contentPane.add(lblCerrar);
			{
				panel = new JPanel();
				panel.setBackground(new Color(220, 20, 60));
				panel.setBounds(695, 0, 36, 22);
				contentPane.add(panel);
			}
		}
		{
			label = new JLabel("");
			label.setIcon(new ImageIcon(Main.class.getResource("/img/image4144.png")));
			label.setBounds(-369, -26, 524, 556);
			contentPane.add(label);
		}
		
		JLabel lblX = new JLabel("X³ +");
		lblX.setFont(new Font("Open Sans", Font.BOLD, 16));
		lblX.setBounds(473, 91, 33, 22);
		contentPane.add(lblX);
		{
			lblX_1 = new JLabel("X² +");
			lblX_1.setFont(new Font("Open Sans", Font.BOLD, 16));
			lblX_1.setBounds(551, 91, 33, 22);
			contentPane.add(lblX_1);
		}
		{
			lblX_2 = new JLabel("X +");
			lblX_2.setFont(new Font("Open Sans", Font.BOLD, 16));
			lblX_2.setBounds(629, 91, 24, 22);
			contentPane.add(lblX_2);
		}
		{
			lblX_5 = new JLabel("X⁶ +");
			lblX_5.setFont(new Font("Open Sans", Font.BOLD, 16));
			lblX_5.setBounds(239, 91, 33, 22);
			contentPane.add(lblX_5);
		}
		{
			lblX_4 = new JLabel("X⁵ +");
			lblX_4.setFont(new Font("Open Sans", Font.BOLD, 16));
			lblX_4.setBounds(317, 91, 33, 22);
			contentPane.add(lblX_4);
		}
		{
			lblX_3 = new JLabel("X⁴ +");
			lblX_3.setFont(new Font("Open Sans", Font.BOLD, 16));
			lblX_3.setBounds(395, 91, 33, 22);
			contentPane.add(lblX_3);
		}
		
		TextField textField_6 = new TextField();
		textField_6.setFont(new Font("Open Sans", Font.PLAIN, 16));
		textField_6.setBounds(200, 85, 33, 33);
		contentPane.add(textField_6);
		
		JLabel lblEcuacin = new JLabel("Ecuación:");
		lblEcuacin.setFont(new Font("Quicksand", Font.PLAIN, 18));
		lblEcuacin.setBounds(200, 355, 145, 22);
		contentPane.add(lblEcuacin);
		
		JLabel lblValores = new JLabel("Valores:");
		lblValores.setFont(new Font("Quicksand", Font.PLAIN, 18));
		lblValores.setBounds(200, 57, 145, 22);
		contentPane.add(lblValores);
		
		Button generarEcuacion = new Button("Generar Ecuación");
		generarEcuacion.setForeground(new Color(255, 255, 255));
		generarEcuacion.setFont(new Font("Quicksand", Font.BOLD, 18));
		generarEcuacion.setBackground(new Color(220, 151, 179));
		generarEcuacion.setBounds(500, 234, 189, 64);
		contentPane.add(generarEcuacion);
		
		TextField textField_5 = new TextField();
		textField_5.setFont(new Font("Open Sans", Font.PLAIN, 16));
		textField_5.setBounds(278, 85, 33, 33);
		contentPane.add(textField_5);
		
		TextField textField_4 = new TextField();
		textField_4.setFont(new Font("Open Sans", Font.PLAIN, 16));
		textField_4.setBounds(356, 85, 33, 33);
		contentPane.add(textField_4);
		
		TextField textField_3 = new TextField();
		textField_3.setFont(new Font("Open Sans", Font.PLAIN, 16));
		textField_3.setBounds(434, 85, 33, 33);
		contentPane.add(textField_3);
		
		TextField textField_2 = new TextField();
		textField_2.setFont(new Font("Open Sans", Font.PLAIN, 16));
		textField_2.setBounds(512, 85, 33, 33);
		contentPane.add(textField_2);
		
		TextField textField_1 = new TextField();
		textField_1.setFont(new Font("Open Sans", Font.PLAIN, 16));
		textField_1.setBounds(590, 85, 33, 33);
		contentPane.add(textField_1);
		
		TextField textField_constante = new TextField();
		textField_constante.setFont(new Font("Open Sans", Font.PLAIN, 16));
		textField_constante.setBounds(656, 85, 33, 33);
		contentPane.add(textField_constante);
		
		TextField textField_ecuacion = new TextField();
		textField_ecuacion.setFont(new Font("Quicksand", Font.PLAIN, 18));
		textField_ecuacion.setEnabled(false);
		textField_ecuacion.setBounds(200, 383, 307, 33);
		contentPane.add(textField_ecuacion);
		
		JLabel lblIntervalo = new JLabel("Intervalo:");
		lblIntervalo.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblIntervalo.setBounds(200, 161, 73, 22);
		contentPane.add(lblIntervalo);
		
		TextField textField_b = new TextField();
		textField_b.setFont(new Font("Open Sans", Font.PLAIN, 16));
		textField_b.setBounds(395, 150, 33, 33);
		contentPane.add(textField_b);
		
		TextField textField_a = new TextField();
		textField_a.setFont(new Font("Open Sans", Font.PLAIN, 16));
		textField_a.setBounds(356, 150, 33, 33);
		contentPane.add(textField_a);
		
		JLabel lblNumeroDeDecimales = new JLabel("Cantidad de decimales:");
		lblNumeroDeDecimales.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNumeroDeDecimales.setBounds(200, 276, 189, 22);
		contentPane.add(lblNumeroDeDecimales);
		
		TextField textField_decimales = new TextField();
		textField_decimales.setFont(new Font("Open Sans", Font.PLAIN, 16));
		textField_decimales.setBounds(395, 265, 33, 33);
		contentPane.add(textField_decimales);
		
		JLabel lblPorcentajeDeError = new JLabel("Porcentaje de error:");
		lblPorcentajeDeError.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblPorcentajeDeError.setBounds(200, 219, 159, 22);
		contentPane.add(lblPorcentajeDeError);
		
		TextField textField_porcError = new TextField();
		textField_porcError.setFont(new Font("Open Sans", Font.PLAIN, 16));
		textField_porcError.setBounds(395, 208, 33, 33);
		contentPane.add(textField_porcError);
		
		JLabel lblRazPorEl = new JLabel("Raíz por el metodo de bisección");
		lblRazPorEl.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblRazPorEl.setBounds(165, -1, 185, 22);
		contentPane.add(lblRazPorEl);
	}
}