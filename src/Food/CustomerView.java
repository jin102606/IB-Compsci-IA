package Food;

import java.awt.BorderLayout;

import java.sql.*;
import java.util.HashMap;
import java.util.Vector;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerView extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private JSpinner sngf_spinner;
	private JTable table;
	private JTable ShoppingCart;
	private JTable table_1;
	private JButton sngf_btn;
	private JLabel lbl_sngf;
	private JButton fgsf_btn;
	private JSpinner fgsf_spinner;
	private JSpinner xsgf_spinner;
	private JButton xsgf_btn;
	private JSpinner fvgf_spinner;
	private JButton fvgf_btn;
	private JSpinner tgf_spinner;
	private JButton tgf_btn;
	private JSpinner sgf_spinner;
	private JButton sgf_btn;
	private JSpinner ppgf_spinner;

	private JButton ppgf_btn;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * 
	 */

	public CustomerView() {

		DefaultTableModel table = new DefaultTableModel();
		Vector coloumnTitles = new Vector();
		coloumnTitles.add("Food Name");
		coloumnTitles.add("Quantity");
		coloumnTitles.add("Price");
		table_1 = new JTable(table);
		table.setColumnIdentifiers(coloumnTitles);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 861);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel sn = new JLabel("New label");
		sn.setIcon(new ImageIcon("/Users/caoli/Desktop/Screenshot 2021-06-24 at 8.59.20 AM.png"));
		sn.setBounds(31, 20, 177, 128);
		contentPane.add(sn);

		lbl_sngf = new JLabel("Spicy Numbing Grilled Fish");
		lbl_sngf.setBounds(24, 159, 198, 16);
		contentPane.add(lbl_sngf);

		sngf_spinner = new JSpinner();
		sngf_spinner.setBounds(54, 187, 122, 26);
		contentPane.add(sngf_spinner);

		sngf_btn = new JButton("Add Order");
		sngf_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addOrder("spicy numbing grill fish", sngf_spinner);

			}
		});
		sngf_btn.setBounds(54, 225, 117, 29);
		contentPane.add(sngf_btn);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/caoli/Desktop/Screenshot 2021-06-24 at 9.19.16 AM.png"));
		lblNewLabel_2.setBounds(249, 20, 180, 128);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_1_1 = new JLabel("Finely Grilled Spicy Fish");
		lblNewLabel_1_1.setBounds(259, 159, 169, 16);
		contentPane.add(lblNewLabel_1_1);

		fgsf_spinner = new JSpinner();
		fgsf_spinner.setBounds(272, 187, 122, 26);
		contentPane.add(fgsf_spinner);

		fgsf_btn = new JButton("Add Order");
		fgsf_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addOrder("Finely Grilled Spicy Fish", fgsf_spinner);
			}
		});
		fgsf_btn.setBounds(272, 225, 117, 29);
		contentPane.add(fgsf_btn);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("/Users/caoli/Desktop/Screenshot 2021-06-24 at 9.22.04 AM.png"));
		lblNewLabel_3.setBounds(492, 20, 179, 128);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_1_2 = new JLabel("Xuzhou Style Grilled Fish");
		lblNewLabel_1_2.setBounds(502, 159, 169, 16);
		contentPane.add(lblNewLabel_1_2);

		xsgf_spinner = new JSpinner();
		xsgf_spinner.setBounds(515, 187, 122, 26);
		contentPane.add(xsgf_spinner);

		xsgf_btn = new JButton("Add Order");
		xsgf_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addOrder("Xuzhou Style Grilled Fish", xsgf_spinner);
			}
		});
		xsgf_btn.setBounds(515, 225, 117, 29);
		contentPane.add(xsgf_btn);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("/Users/caoli/Desktop/Screenshot 2021-06-24 at 9.09.21 AM.png"));
		lblNewLabel_4.setBounds(31, 266, 180, 132);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_1_3 = new JLabel("Fermented Vegetable Grilled Fish");
		lblNewLabel_1_3.setBounds(16, 405, 206, 16);
		contentPane.add(lblNewLabel_1_3);

		fvgf_spinner = new JSpinner();
		fvgf_spinner.setBounds(54, 433, 122, 26);
		contentPane.add(fvgf_spinner);

		fvgf_btn = new JButton("Add Order");
		fvgf_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addOrder("Fermented Vegetable Grilled Fish", fvgf_spinner);
			}
		});
		fvgf_btn.setBounds(54, 471, 117, 29);
		contentPane.add(fvgf_btn);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("/Users/caoli/Desktop/Screenshot 2021-06-24 at 9.05.54 AM.png"));
		lblNewLabel_5.setBounds(249, 266, 181, 128);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_1_4 = new JLabel("Tomato Grilled Fish");
		lblNewLabel_1_4.setBounds(262, 405, 145, 16);
		contentPane.add(lblNewLabel_1_4);

		tgf_spinner = new JSpinner();
		tgf_spinner.setBounds(272, 433, 122, 26);
		contentPane.add(tgf_spinner);

		tgf_btn = new JButton("Add Order");
		tgf_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addOrder("Tomato Grilled Fish", tgf_spinner);
			}
		});
		tgf_btn.setBounds(272, 471, 117, 29);
		contentPane.add(tgf_btn);

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("/Users/caoli/Desktop/Screenshot 2021-06-24 at 9.11.05 AM.png"));
		lblNewLabel_6.setBounds(459, 266, 180, 129);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_1_5 = new JLabel("Sauce Grilled Fish");
		lblNewLabel_1_5.setBounds(469, 405, 135, 16);
		contentPane.add(lblNewLabel_1_5);

		sgf_spinner = new JSpinner();
		sgf_spinner.setBounds(482, 433, 122, 26);
		contentPane.add(sgf_spinner);

		sgf_btn = new JButton("Add Order");
		sgf_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addOrder("Sauce Grilled Fish", sgf_spinner);
			}
		});
		sgf_btn.setBounds(482, 471, 117, 29);
		contentPane.add(sgf_btn);

		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("/Users/caoli/Desktop/Screenshot 2021-06-24 at 9.14.03 AM.png"));
		lblNewLabel_7.setBounds(31, 512, 179, 130);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_1_6 = new JLabel("Pickeled Peper Grilled Fish ");
		lblNewLabel_1_6.setBounds(31, 651, 178, 16);
		contentPane.add(lblNewLabel_1_6);

		ppgf_spinner = new JSpinner();
		ppgf_spinner.setBounds(54, 679, 122, 26);
		contentPane.add(ppgf_spinner);

		ppgf_btn = new JButton("Add Order");
		ppgf_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addOrder("Pickeled Peper Grilled Fish ", ppgf_spinner);
			}
		});
		ppgf_btn.setBounds(54, 717, 117, 29);
		contentPane.add(ppgf_btn);

		JButton btnNewButton_7 = new JButton("Side and Drink ");
		btnNewButton_7.setBounds(366, 732, 156, 29);
		contentPane.add(btnNewButton_7);

		JLabel lblNewLabel_8 = new JLabel("Shopping cart");
		lblNewLabel_8.setBounds(695, 76, 135, 16);
		contentPane.add(lblNewLabel_8);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(695, 147, 372, 599);
		contentPane.add(scrollPane);

		scrollPane.setViewportView(table_1);

		JButton delete_btn = new JButton("Delete");
		delete_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeSelectedRows(table_1);
			}
		});
		delete_btn.setBounds(695, 757, 117, 29);
		contentPane.add(delete_btn);

		JButton btnSave = new JButton("Save Orders");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				putOrdersIntoDatabase();
			}
		});
		btnSave.setBounds(922, 757, 117, 29);
		contentPane.add(btnSave);
	}

	private void addOrder(String message, JSpinner spinner) {

		int quantity = 0;
		try {
			quantity = (int) spinner.getValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		DefaultTableModel foodTable = (DefaultTableModel) table_1.getModel();
		Vector data = new Vector();
		data.add(message);
		data.add("" + quantity);
		foodTable.addRow(data);
	}

	private void removeSelectedRows(JTable table) {
		DefaultTableModel model = (DefaultTableModel) this.table_1.getModel();
		int[] rows = table.getSelectedRows();
		for (int i = 0; i < rows.length; i++) {
			model.removeRow(rows[i] - i);
		}

	}

	private void putOrdersIntoDatabase() {
		DefaultTableModel model = (DefaultTableModel) this.table_1.getModel();
		
		

		Connection conn;
		String url = "jdbc:sqlite:/Users/caoli/Documents/sqlite_databases/CompSciIA.db";



		try {
			conn = DriverManager.getConnection(url);
			// open a database connection
			for (int i = 0; i < model.getRowCount(); i++) {
				String foodname = (String) model.getValueAt(i, 0);
				String quantity = (String) model.getValueAt(i, 1);
				String sql2 = "INSERT INTO customerorder (foodname,orderamount) VALUES(\"" + foodname + "\",\"" + quantity
				+ "\")";
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(sql2);
				stmt.close();

			}

				
				// insert into orders (food_name) values ("cheese")


			

			// close the connection

			conn.close();

		}catch(

	Exception e)
	{

		e.printStackTrace();

	}
}

}