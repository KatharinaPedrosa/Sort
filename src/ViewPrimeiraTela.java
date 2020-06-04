import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JTextField;

public class ViewPrimeiraTela extends JFrame {

	private JPanel contentPane;
	private JTextField txtTempo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException  | InstantiationException |  IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	            System.err.println(ex);
	        }
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrimeiraTela frame = new ViewPrimeiraTela();
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
	public ViewPrimeiraTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 414);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(107, 142, 35));
		panel.setBounds(0, 0, 140, 375);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("M\u00E9todos de Ordena\u00E7\u00E3o");
		lblNewLabel.setBounds(10, 11, 120, 29);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Insertion Sort", "Quick Sort", "Merge Sort"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(10, 44, 120, 22);
		panel.add(comboBox);
		
		JButton btnSelecionar = new JButton("Selecionar \r\nArquivo");
		btnSelecionar.setBounds(10, 72, 120, 38);
		panel.add(btnSelecionar);
		btnSelecionar.setForeground(Color.BLACK);
		
		JButton btnExecutar = new JButton("Executar");
		btnExecutar.setForeground(new Color(0, 0, 0));
		btnExecutar.setBackground(new Color(124, 252, 0));
		btnExecutar.setBounds(10, 115, 120, 38);
		panel.add(btnExecutar);
		
		JList list = new JList();
		list.setBounds(194, 177, 167, -112);
		contentPane.add(list);
		
		JLabel lblNewLabel_1 = new JLabel("Tempo de Execu\u00E7\u00E3o:");
		lblNewLabel_1.setBounds(150, 323, 111, 22);
		contentPane.add(lblNewLabel_1);
		
		txtTempo = new JTextField();
		txtTempo.setBounds(271, 324, 103, 21);
		contentPane.add(txtTempo);
		txtTempo.setColumns(10);
		
		JList list_1 = new JList();
		list_1.setBounds(217, 233, 188, -171);
		contentPane.add(list_1);
	}
}
