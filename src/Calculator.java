import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {
	private JTextField Input;
	private double answer,number;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	
	public void addInput(String str) {
		Input.setText(Input.getText() + str);
	}
	
	public void Calculate() {
		switch (operation) {
		case 1: 
			answer = number + Double.parseDouble(Input.getText());
			Input.setText(Double.toString(answer));
			break;
		case 2:	
			answer = number - Double.parseDouble(Input.getText());
			Input.setText(Double.toString(answer));
			break;
		case 3:	
			answer = number * Double.parseDouble(Input.getText());
			Input.setText(Double.toString(answer));
			break;
		case 4:	
			answer = number / Double.parseDouble(Input.getText());
			Input.setText(Double.toString(answer));
			break;
		}
	}
	
	public Calculator() {
		setTitle("Hesap Makinesi");
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 362);
		getContentPane().setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(0, 0, 327, 72);
		getContentPane().add(screen);
		screen.setLayout(null);
		
		Input = new JTextField();
		Input.setForeground(Color.BLACK);
		Input.setBackground(Color.GRAY);
		Input.setHorizontalAlignment(SwingConstants.RIGHT);
		Input.setFont(new Font("Serif", Font.BOLD, 23));
		Input.setBounds(0, 0, 327, 72);
		screen.add(Input);
		Input.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 74, 327, 249);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 4, 20, 20));
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput( e.getActionCommand());
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput( e.getActionCommand());
			}
		});
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput( e.getActionCommand());
			}
		});
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_6 = new JButton("/");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				number = Double.parseDouble(Input.getText());
				operation = 4;
				Input.setText("");
			}
		});
		btnNewButton_6.setBackground(Color.CYAN);
		btnNewButton_6.setForeground(Color.BLACK);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("4");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput( e.getActionCommand());
			}
		});
		btnNewButton_8.setBackground(Color.CYAN);
		btnNewButton_8.setForeground(Color.BLACK);
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_12 = new JButton("5");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput( e.getActionCommand());
			}
		});
		btnNewButton_12.setBackground(Color.CYAN);
		btnNewButton_12.setForeground(Color.BLACK);
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_7 = new JButton("6");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput( e.getActionCommand());
			}
		});
		btnNewButton_7.setBackground(Color.CYAN);
		btnNewButton_7.setForeground(Color.BLACK);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_7);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(Input.getText());
				operation = 3;
				Input.setText("");
			}
		});
		btnX.setBackground(Color.CYAN);
		btnX.setForeground(Color.BLACK);
		btnX.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnX);
		
		JButton btnNewButton_4 = new JButton("1");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput( e.getActionCommand());
			}
		});
		btnNewButton_4.setBackground(Color.CYAN);
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("2");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput( e.getActionCommand());
			}
		});
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_11 = new JButton("3");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput( e.getActionCommand());
			}
		});
		btnNewButton_11.setBackground(Color.CYAN);
		btnNewButton_11.setForeground(Color.BLACK);
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_9 = new JButton("-");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(Input.getText());
				operation = 2;
				Input.setText("");
				
			}
		});
		btnNewButton_9.setBackground(Color.CYAN);
		btnNewButton_9.setForeground(Color.BLACK);
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				addInput( e.getActionCommand());
			}
		});
		btnNewButton_10.setBackground(Color.CYAN);
		btnNewButton_10.setForeground(Color.BLACK);
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_15 = new JButton("C");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input.setText("");
			}
		});
		btnNewButton_15.setBackground(Color.CYAN);
		btnNewButton_15.setForeground(Color.BLACK);
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Double.parseDouble(Input.getText()) == 0) {
					Input.setText("0'a bolunemez");
				}
				Calculate();
			}
		});
		btnNewButton_14.setBackground(Color.CYAN);
		btnNewButton_14.setForeground(Color.BLACK);
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_13 = new JButton("+");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(Input.getText());
				operation = 1;
				Input.setText("");
			}
		});
		btnNewButton_13.setBackground(Color.CYAN);
		btnNewButton_13.setForeground(Color.BLACK);
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_13);
	}
}
