package Quan_ly_khach_san;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Choice;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import GiaoDien.giaodien;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class GiaoDienQuanLyKhachSan {

	public JFrame frame1;
	private JTextField tenkhachhang;
	private JTextField tuoi;
	private JTextField chungminhthu;
	private JTextField phong;
	private JTextField sobuoi;
	private JTable table;
	private JTable table_1;
	private Vector colHdrs;
	private JTable table_2;
	private JScrollPane scrollPane;
	Choice choice;
	static khachsan danhsach = new khachsan();
	private DefaultTableModel tblModel = new DefaultTableModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDienQuanLyKhachSan window = new GiaoDienQuanLyKhachSan();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GiaoDienQuanLyKhachSan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame("Đỗ Hoàng Việt-20198272");
		frame1.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame1.setBounds(100, 100, 1020, 565);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		
		colHdrs = new Vector(10);
	    colHdrs.addElement(new String("Ticker"));
	    
		String columns []= {"Tên","Tuổi","Chứng Minh Thư","Phòng","Loại phòng","Số ngày đặt"};		
		
		JLabel lblNewLabel = new JLabel("t\u00EAn kh\u00E1ch h\u00E0ng");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 28, 113, 13);
		frame1.getContentPane().add(lblNewLabel);
		
		tenkhachhang = new JTextField();
		tenkhachhang.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tenkhachhang.setBounds(10, 51, 221, 20);
		frame1.getContentPane().add(tenkhachhang);
		tenkhachhang.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tu\u1ED5i");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 80, 49, 13);
		frame1.getContentPane().add(lblNewLabel_1);
		
		tuoi = new JTextField();
		tuoi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tuoi.setBounds(58, 78, 49, 20);
		frame1.getContentPane().add(tuoi);
		tuoi.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ch\u1EE9ng minh th\u01B0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 118, 197, 13);
		frame1.getContentPane().add(lblNewLabel_2);
		
		chungminhthu = new JTextField();
		chungminhthu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chungminhthu.setBounds(10, 143, 221, 20);
		frame1.getContentPane().add(chungminhthu);
		chungminhthu.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Ph\u00F2ng");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 185, 45, 13);
		frame1.getContentPane().add(lblNewLabel_3);
		
		phong = new JTextField();
		phong.setFont(new Font("Tahoma", Font.PLAIN, 13));
		phong.setBounds(58, 183, 49, 20);
		frame1.getContentPane().add(phong);
		phong.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("h\u1EA1ng");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(117, 186, 45, 13);
		frame1.getContentPane().add(lblNewLabel_4);
		
		Choice choice = new Choice();
		choice.setBounds(162, 184, 45, 21);
		frame1.getContentPane().add(choice);
		choice.add("A");
		choice.add("B");
		choice.add("C");
		
		JLabel lblNewLabel_5 = new JLabel("S\u1ED1 bu\u1ED5i");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(10, 217, 60, 13);
		frame1.getContentPane().add(lblNewLabel_5);
		
		sobuoi = new JTextField();
		sobuoi.setFont(new Font("Tahoma", Font.BOLD, 13));
		sobuoi.setBounds(68, 213, 96, 20);
		frame1.getContentPane().add(sobuoi);
		sobuoi.setColumns(10);
		
		JButton tinhtien = new JButton("T\u00EDnh Ti\u1EC1n");
		tinhtien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=JOptionPane.showInputDialog("Điền Chứng Minh Thư").toString();
					if(danhsach.calculator(a)==0) {
						JOptionPane.showMessageDialog(frame1, "Chứng minh thư không tồn tại");
					}else {
						JOptionPane.showMessageDialog(frame1,"Khách có chứng minh thư là "+a+" cần thanh toán số tiền là " +Integer.toString(danhsach.calculator(a))+"$");
					}
				
			}
		});
		tinhtien.setFont(new Font("Tahoma", Font.BOLD, 15));
		tinhtien.setBounds(10, 356, 221, 34);
		frame1.getContentPane().add(tinhtien);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(238, 10, 758, 508);
		frame1.getContentPane().add(scrollPane);
		
		
		tblModel.setColumnIdentifiers(columns);
		
		table_2 = new JTable();
		table_2.setModel(tblModel);
		scrollPane.setViewportView(table_2);
		
		// data mặc định
		showData();
		
		JButton themkhachhang = new JButton("Th\u00EAm kh\u00E1ch h\u00E0ng");
		themkhachhang.setFont(new Font("Tahoma", Font.BOLD, 15));
		themkhachhang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tenkhachhang.getText().equals("")||tuoi.getText().equals("")||chungminhthu.getText().equals("")||phong.getText().equals("")||sobuoi.getText().equals("")) {
					JOptionPane.showMessageDialog(frame1, "Nhập dữ liệu khách hàng");
				}else {
					// add data to array list
					nguoi nguoi1= new nguoi(tenkhachhang.getText(), Integer.parseInt(tuoi.getText()), chungminhthu.getText(), phong.getText(), choice.getSelectedItem(),Integer.parseInt(sobuoi.getText()) );
					danhsach.add(nguoi1);
					JOptionPane.showMessageDialog(frame1, "thêm dữ liệu thành công");// thông báo thêm thành công
					showData();
					// clear data 
					clear();
		
				}
			}
		});
		themkhachhang.setBounds(10, 253, 221, 34);
		frame1.getContentPane().add(themkhachhang);
		JButton xoakhach = new JButton("Xóa khách hàng");
		xoakhach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=JOptionPane.showInputDialog("Điền Chứng Minh Thư").toString();
				System.out.println(a);
				int size = tblModel.getRowCount();
				if(danhsach.delete(a)) {
					JOptionPane.showMessageDialog(frame1, "Xóa thành công");
					showData();
				}else {
					JOptionPane.showMessageDialog(frame1, "Chứng minh thư không tồn tại");
				}
			}
		});
		xoakhach.setFont(new Font("Tahoma", Font.BOLD, 15));
		xoakhach.setBounds(10, 303, 221, 34);
		frame1.getContentPane().add(xoakhach);
		
		JButton btnNewButton = new JButton("Quay Lại");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giaodien a = new giaodien();
				a.frame.setVisible(true);
				frame1.setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 410, 221, 34);
		frame1.getContentPane().add(btnNewButton);
		
	}
	// xóa data ở các Jtext
	public void clear() {
		tenkhachhang.setText("");
		tuoi.setText("");
		chungminhthu.setText("");
		phong.setText("");
		sobuoi.setText("");
	}
	// hiển thị data vào bảng
	public void showData() {
		tblModel.setRowCount(0);
		for(int i=0;i<danhsach.sizeList();i++) {	
			String khachhang1 []= {danhsach.At(i).getName(),Integer.toString(danhsach.At(i).getAge()),danhsach.At(i).getPassport(),danhsach.At(i).getRoom(),danhsach.At(i).getType(),Integer.toString(danhsach.At(i).getNumberRent())};
			tblModel.addRow(khachhang1);
		}
	}
}
