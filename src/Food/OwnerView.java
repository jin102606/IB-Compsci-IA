package Food;

import java.awt.BorderLayout;
import java.util.HashMap;
import java.sql.Connection;

import java.awt.EventQueue;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;
import javax.swing.JList;

public class OwnerView extends JFrame {

	private JPanel contentPane;
	private JList lstCustomers;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public OwnerView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		lstCustomers = new JList();
		contentPane.add(lstCustomers, BorderLayout.CENTER);
	}

	void show(String aname) {
		Connection conn;
		try {
			String url = "jdbc:sqlite:/Users/caoli/Documents/sqlite_databases/CompSciIA.db";
			conn = DriverManager.getConnection(url);
			String sql = "select * from customerorder";

			sql = sql + "order by customerorder_id";
			Statement stmt = conn.createStatement();
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);

			DefaultListModel model = new DefaultListModel();
			lstCustomers.setModel(model);
			while (rs.next())
				;
			model.addElement(rs.getString("order.id"));
			stmt.close();
			conn.close();

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}
