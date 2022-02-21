package Week4;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class GUICalculator implements ActionListener {
	JFrame frame;
	JTextField txtNum1, txtNum2, txtNum3;
	JButton btnAdd, btnClose, btnAdd1, btnAdd2, btnAdd3, btnAdd4, btnAdd5;
	
	public static JMenuBar createMenu() {
		JMenuBar menubar;
		JMenu menu;
		JMenuItem menuitem ,menuitem1;
		
		//MenuBar
		menubar=new JMenuBar();

		
		//File Menu
		menu=new JMenu("File");
		menubar.add(menu);
		
		
		menuitem=new JMenuItem("New File");
		menu.add(menuitem);
		menuitem.setBackground(Color.CYAN);
		menuitem=new JMenuItem("About");
		menu.add(menuitem);
		menuitem.setBackground(Color.CYAN);
		menuitem=new JMenuItem("Open");
		menu.add(menuitem);
		menuitem.setBackground(Color.CYAN);
		menu.addSeparator();
		menuitem=new JMenuItem("Exit");
		menu.add(menuitem);
		menuitem.setBackground(Color.CYAN);
		
		menu=new JMenu("Calculate");
		menubar.add(menu);
		menuitem1=new JMenuItem("Add");
		menu.add(menuitem1);
		
		menuitem1.setOpaque(true);
		menuitem1.setBackground(Color.CYAN);
		
	
		
		return menubar;
		
	}

	public GUICalculator() {
		frame = new JFrame("Hancie Calculator");
		frame.setSize(350, 400);
		frame.getContentPane().setBackground(new Color(0, 128, 255));
		frame.setLayout(null);
		frame.setJMenuBar(createMenu());
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("nitesh.png")));
		frame.setResizable(false);
		frame.setLocation(600,220);

		JLabel label = new JLabel("Hancie Calculator");
		label.setBounds(80, 10, 250, 30);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Verdana", Font.BOLD, 20));
		frame.add(label);
		
		JPanel panel=new JPanel();
		panel.setBounds(40,140,260,80);
		panel.setBackground(new Color(102,178,255));
		frame.add(panel);
		

		txtNum1 = new JTextField();
		txtNum1.setBounds(100, 60, 190, 25);

		JLabel label1 = new JLabel("No.1");
		label1.setBounds(50, 60, 150, 25);
		frame.add(label1);
		label1.setForeground(Color.WHITE);

		btnAdd = new JButton();
		btnAdd.setText("+");
		btnAdd.setBounds(40, 150, 50, 25);
		btnAdd.addActionListener(this);
		btnAdd.setBackground(new Color(192,192,192));
		panel.add(btnAdd);

		txtNum2 = new JTextField();
		txtNum2.setBounds(100, 90, 190, 25);
		frame.add(txtNum2);

		JLabel label2 = new JLabel("No.2");
		label2.setBounds(50, 90, 150, 25);
		frame.add(label2);
		label2.setForeground(Color.WHITE);

		JLabel label3 = new JLabel("Result");
		label3.setBounds(150, 230, 90, 25);
		label3.setFont(new Font("Verdana", Font.BOLD, 15));
		frame.add(label3);

		txtNum3 = new JTextField();
		txtNum3.setBounds(40, 270, 250, 25);
		frame.add(txtNum3);

		btnAdd1 = new JButton();
		btnAdd1.setText("-");
		btnAdd1.setBounds(100, 150, 50, 25);
		btnAdd1.addActionListener(this);
		btnAdd1.setBackground(new Color(192,192,192));
		panel.add(btnAdd1);

		btnAdd2 = new JButton();
		btnAdd2.setText("*");
		btnAdd2.setBounds(160, 150, 50, 25);
		btnAdd2.addActionListener(this);
		btnAdd2.setBackground(new Color(192,192,192));
		panel.add(btnAdd2);

		btnAdd3 = new JButton();
		btnAdd3.setText("/");
		btnAdd3.setBounds(220, 150, 50, 25);
		btnAdd3.addActionListener(this);
		btnAdd3.setBackground(new Color(192,192,192));
		panel.add(btnAdd3);

		btnAdd4 = new JButton();
		btnAdd4.setText("Pow");
		btnAdd4.setBounds(60, 190, 90, 25);
		btnAdd4.addActionListener(this);
		btnAdd4.setBackground(new Color(192,192,192));
		panel.add(btnAdd4);

		btnAdd5 = new JButton();
		btnAdd5.setText("Sqrt");
		btnAdd5.setBounds(170, 190, 90, 25);
		btnAdd5.addActionListener(this);
		btnAdd5.setBackground(new Color(192,192,192));
		panel.add(btnAdd5);

		btnClose = new JButton();
		btnClose.setText("Close");
		btnClose.setBounds(130, 310, 90, 25);
		btnClose.addActionListener(this);

		frame.add(txtNum1);

		frame.add(btnClose);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnClose) {
			System.exit(0);//Off
		}
		else if(ae.getSource()==btnAdd) {
			//get text
			double n1, n2, n3;
			n1 = Double.parseDouble(txtNum1.getText());
			n2 = Double.parseDouble(txtNum2.getText());
			//sum
			n3 = n1+n2;
			//display
			txtNum3.setText(Double.toString(n3)); }
			
		else if(ae.getSource()==btnAdd1) {
				//get text
				double n1, n2, n3;
				n1 = Double.parseDouble(txtNum1.getText());
				n2 = Double.parseDouble(txtNum2.getText());
				//sum
				n3 = n1-n2;
				//display
				txtNum3.setText(Double.toString(n3));	
		}
		
		else if(ae.getSource()==btnAdd2) {
			//get text
			double n1, n2, n3;
			n1 = Double.parseDouble(txtNum1.getText());
			n2 = Double.parseDouble(txtNum2.getText());
			//sum
			n3 = n1*n2;
			//display
			txtNum3.setText(Double.toString(n3));	
	}
		
		else if(ae.getSource()==btnAdd3) {
			//get text
			double n1, n2, n3;
			n1 = Double.parseDouble(txtNum1.getText());
			n2 = Double.parseDouble(txtNum2.getText());
			//sum
			n3 = n1/n2;
			//display
			txtNum3.setText(Double.toString(n3));	
	}
		
		else if(ae.getSource()==btnAdd4) {
			//get text
			double n1, n2, n3;
			n1 = Double.parseDouble(txtNum1.getText());
			n2 = Double.parseDouble(txtNum2.getText());
			//sum
			n3 = Math.pow(n1,n2);
			//display
			txtNum3.setText(Double.toString(n3));	
	}
		
		else if(ae.getSource()==btnAdd5) {
			//get text
			double n1, n3;
			n1 = Double.parseDouble(txtNum1.getText());
			//sum
			n3 = Math.sqrt(n1);
			//display
			txtNum3.setText(Double.toString(n3));	
	}
		
		

	}

	public static void main(String[] args) {
		new GUICalculator();

	}

}