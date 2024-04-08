package mockup;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.border.EtchedBorder;
import javax.swing.JCheckBoxMenuItem;

public class Mockup1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField parameterValue;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mockup1 frame = new Mockup1();
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
	public Mockup1() {
		setTitle("Active Contours");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Options");
		menuBar.add(mnNewMenu_1);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("New check item");
		mnNewMenu_1.add(chckbxmntmNewCheckItem);
		
		JMenu mnNewMenu = new JMenu("Help");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Option 1");
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBorder(new TitledBorder(null, "Left Panel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(leftPanel, BorderLayout.WEST);
		leftPanel.setLayout(new GridLayout(5, 1, 0, 0));
		
		JPanel preset = new JPanel();
		leftPanel.add(preset);
		
		JButton presetIconButton = new JButton("Icon");
		preset.add(presetIconButton);
		
		JLabel presetLabel = new JLabel("New label");
		preset.add(presetLabel);
		
		JPanel preset1 = new JPanel();
		leftPanel.add(preset1);
		
		JButton presetIconButton1 = new JButton("Icon1");
		preset1.add(presetIconButton1);
		
		JLabel presetLabel1 = new JLabel("New label");
		preset1.add(presetLabel1);
		
		JPanel preset2 = new JPanel();
		leftPanel.add(preset2);
		
		JButton presetIconButton2 = new JButton("Icon2");
		preset2.add(presetIconButton2);
		
		JLabel presetLabel2 = new JLabel("New label");
		preset2.add(presetLabel2);
		
		JPanel preset3 = new JPanel();
		leftPanel.add(preset3);
		
		JButton presetIconButton3 = new JButton("Icon3");
		preset3.add(presetIconButton3);
		
		JLabel presetLabel3 = new JLabel("New label");
		preset3.add(presetLabel3);
		
		JPanel preset4 = new JPanel();
		leftPanel.add(preset4);
		
		JButton presetIconButton4 = new JButton("Icon4");
		preset4.add(presetIconButton4);
		
		JLabel presetLabel4 = new JLabel("New label");
		preset4.add(presetLabel4);
		
		JPanel rightPanel = new JPanel();
		rightPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Right Panel", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(rightPanel, BorderLayout.CENTER);
		rightPanel.setLayout(new GridLayout(10, 1, 0, 0));
		
		JPanel parameter = new JPanel();
		rightPanel.add(parameter);
		
		JLabel parameterName = new JLabel("parameter");
		parameter.add(parameterName);
		
		parameterValue = new JTextField();
		parameter.add(parameterValue);
		parameterValue.setColumns(10);
		
		JPanel parameter_1 = new JPanel();
		rightPanel.add(parameter_1);
		
		JLabel parameterName_1 = new JLabel("parameter");
		parameter_1.add(parameterName_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		parameter_1.add(textField);
		
		JPanel parameter_2 = new JPanel();
		rightPanel.add(parameter_2);
		
		JLabel parameterName_2 = new JLabel("parameter");
		parameter_2.add(parameterName_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		parameter_2.add(textField_1);
		
		JPanel parameter_3 = new JPanel();
		rightPanel.add(parameter_3);
		
		JLabel parameterName_3 = new JLabel("parameter");
		parameter_3.add(parameterName_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		parameter_3.add(textField_2);
		
		JPanel parameter_4 = new JPanel();
		rightPanel.add(parameter_4);
		
		JLabel parameterName_4 = new JLabel("parameter");
		parameter_4.add(parameterName_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		parameter_4.add(textField_3);
		
		JPanel parameter_5 = new JPanel();
		rightPanel.add(parameter_5);
		
		JLabel parameterName_5 = new JLabel("parameter");
		parameter_5.add(parameterName_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		parameter_5.add(textField_4);
		
		JPanel parameter_6 = new JPanel();
		rightPanel.add(parameter_6);
		
		JLabel parameterName_6 = new JLabel("parameter");
		parameter_6.add(parameterName_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		parameter_6.add(textField_5);
		
		JPanel parameter_7 = new JPanel();
		rightPanel.add(parameter_7);
		
		JLabel parameterName_7 = new JLabel("parameter");
		parameter_7.add(parameterName_7);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		parameter_7.add(textField_6);
		
		JPanel parameter_8 = new JPanel();
		rightPanel.add(parameter_8);
		
		JLabel parameterName_8 = new JLabel("parameter");
		parameter_8.add(parameterName_8);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		parameter_8.add(textField_7);
		
		JPanel parameter_9 = new JPanel();
		rightPanel.add(parameter_9);
		
		JLabel parameterName_9 = new JLabel("parameter");
		parameter_9.add(parameterName_9);
		
		JList list = new JList();
		parameter_9.add(list);
		
		JPanel bottomPanel = new JPanel();
		contentPane.add(bottomPanel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("New button");
		bottomPanel.add(btnNewButton);
	}

}
