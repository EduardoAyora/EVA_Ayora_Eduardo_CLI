package ec.edu.ups.est.ProyectoFinal.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.xml.namespace.QName;

import ec.edu.ups.est.ProyectoFinal.Automovil;
import ec.edu.ups.est.ProyectoFinal.AutomovilSOAP;
import ec.edu.ups.est.ProyectoFinal.AutomovilSOAPService;
import ec.edu.ups.est.ProyectoFinal.AutomovilSOAP_AutomovilSOAPPort_Client;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frame;
	private JTextField txtPlaca;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtColor;
	private DefaultListModel<String> detallesEnLista;
	private List<Automovil> automoviles = new ArrayList<Automovil>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
        
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		detallesEnLista = new DefaultListModel<String>();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 516, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Placa:");
		panel_2.add(lblNewLabel);
		
		txtPlaca = new JTextField();
		panel_2.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Marca:");
		panel_3.add(lblNewLabel_1);
		
		txtMarca = new JTextField();
		panel_3.add(txtMarca);
		txtMarca.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Modelo:");
		panel_4.add(lblNewLabel_2);
		
		txtModelo = new JTextField();
		panel_4.add(txtModelo);
		txtModelo.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Color:");
		panel_5.add(lblNewLabel_3);
		
		txtColor = new JTextField();
		panel_5.add(txtColor);
		txtColor.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		
		JButton btnNewButton = new JButton("Guardar Vehiculo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URL wsdlURL = AutomovilSOAPService.WSDL_LOCATION;

		        AutomovilSOAPService ss = new AutomovilSOAPService(wsdlURL, new QName("http://bean.ProyectoFinal.est.ups.edu.ec/", "AutomovilSOAPService"));
		        AutomovilSOAP port = ss.getAutomovilSOAPPort();
		        
		        port.crearAutomovil(txtPlaca.getText(), txtMarca.getText(), txtModelo.getText(), txtColor.getText());
				txtPlaca.setText("");
				txtMarca.setText("");
				txtModelo.setText("");
				txtColor.setText("");
				
				automoviles = port.getAutomoviles();
				
				actualizarJList();
			}
		});
		panel_6.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		JList<String> list = new JList<String>(detallesEnLista);
		panel_1.add(list);
	}
	
	private void actualizarJList() {
		List<String> detallesEnTexto = new ArrayList<String>();
		for (Automovil automovil : automoviles) {
			String detalleEnTexto = " " + automovil.getPlaca() + " " + automovil.getMarca() + " " + automovil.getModelo() + automovil.getColor();
			detallesEnTexto.add(detalleEnTexto);
        }
		detallesEnLista.removeAllElements();
		for (String detalle : detallesEnTexto) {
			detallesEnLista.addElement(detalle);
		}
	}

}
