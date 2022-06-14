package GiaoDien;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JToolBar;

import bai_tap_tuan_29.DemSo;
import bai_tap_tuan_29.InRaSoChiaHet3Va5Va7;
import bai_tap_tuan_29.InRaSoChiaHet3Va7;
import bai_tap_tuan_29.InRaSoHoanHao;
import bai_tap_tuan_29.in_ra_hop_so;
import bai_tap_tuan_29.in_ra_so_nguyen_to;
import bai_tap_tuan_30.bai1;
import bai_tap_tuan_30.bai2;
import bai_tap_tuan_30.bai3;
import bai_tap_tuan_30.bai4;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.Choice;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JTextField;
import java.awt.Font;
import bai_tap_tuan_30.bai1;
import java.util.*;
public class giaodien {

	private JFrame frame;
	private JTextField Input;
	private JTextField Output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giaodien window = new giaodien();
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
	public giaodien() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("bai tap");
		frame.setBounds(100, 100, 802, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Choice choice = new Choice();
		choice.setBounds(44, 45, 183, 18);
		frame.getContentPane().add(choice);
		

				
		choice.add("Bai tap tuan 29");
		choice.add("bai tap tuan 30");
		choice.add("bai tap tuan 31");
		choice.add("bai tap tuan 32"); 
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(44, 126, 183, 18);
		frame.getContentPane().add(choice_1);
		
		choice_1.add("bai1");
		choice_1.add("bai2");
		choice_1.add("bai3");
		choice_1.add("bai4");
		choice_1.add("bai5");
		choice_1.add("bai6");
		choice_1.add("bai7a");
		choice_1.add("bai7b");
		choice_1.add("bai7c");
		choice_1.add("bai7d");
		choice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				Choice choiceTmp = (Choice) e.getSource();
				
				if(choiceTmp.getSelectedItem()==choice.getItem(0)) {
					choice_1.removeAll();
					choice_1.add("bai1");
					choice_1.add("bai2");
					choice_1.add("bai3");
					choice_1.add("bai4");
					choice_1.add("bai5");
					choice_1.add("bai6");
					choice_1.add("bai7a");
					choice_1.add("bai7b");
					choice_1.add("bai7c");
					choice_1.add("bai7d");
				}else if(choiceTmp.getSelectedItem()==choice.getItem(1)) {
					choice_1.removeAll();
					choice_1.add("bai1");
					choice_1.add("bai2");
					choice_1.add("bai3");
					choice_1.add("bai4");
				}else if(choiceTmp.getSelectedItem()==choice.getItem(2)) {
					choice_1.removeAll();
					choice_1.add("bai1");
					choice_1.add("bai2");
					choice_1.add("bai3");
					choice_1.add("bai4");
					choice_1.add("bai5");
					choice_1.add("bai6");
					
				}else {
					choice_1.removeAll();
					choice_1.add("bai1");
					choice_1.add("bai2");
					choice_1.add("bai3");
					choice_1.add("bai4");
					choice_1.add("bai5");
					choice_1.add("bai6");
					choice_1.add("bai7");
					choice_1.add("bai8");
					choice_1.add("bai9");
					
					
				}
				
			}
		});
		
		
		JLabel lblNewLabel = new JLabel("\u0110\u1EC1 B\u00E0i:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(263, 50, 54, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel DeBai = new JLabel("");
		DeBai.setFont(new Font("Tahoma", Font.PLAIN, 13));
		DeBai.setBounds(340, 50, 1000, 21);
		frame.getContentPane().add(DeBai);
		
		JLabel lblNewLabel_1 = new JLabel("Input");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(263, 131, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setText("Input");
		
		JLabel lblNewLabel_2 = new JLabel("Output");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(263, 213, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		Input = new JTextField();
		Input.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Input.setBounds(358, 125, 359, 21);
		frame.getContentPane().add(Input);
		Input.setColumns(10);
		
		Output = new JTextField();
		Output.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Output.setBounds(358, 211, 359, 21);
		frame.getContentPane().add(Output);
		Output.setColumns(10);
		

		
		
		Button button = new Button("Chon");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai1")) {
					DeBai.setText("In ra màn hình tất cả các hợp số <100");
					Input.setText("100");
					String input = Input.getText();
					Input.setText("100");
					in_ra_hop_so bai1= new in_ra_hop_so();
					Output.setText(bai1.printHopSo(Integer.parseInt(input))+"");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai2")) {
					DeBai.setText("In ra màn hình 20 số nguyên tố đầu tiên");
					Input.setText("20");
					String input = Input.getText();
					in_ra_so_nguyen_to bai2= new in_ra_so_nguyen_to();
					Output.setText(bai2.listSoNguyenTo(Integer.parseInt(input))+"");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai3")) {
					DeBai.setText("In ra màn hình tất cả các số nguyên tố từ 1000 đến 2000");
					String input = Input.getText();
					Input.setText("1000, 2000");
					in_ra_so_nguyen_to bai3= new in_ra_so_nguyen_to();
					Output.setText(bai3.listSoNguyenTo(1000,2000)+"");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai4")) {
					DeBai.setText("In ra màn hình các số <100 và chia hết cho 3,7");
					Input.setText("100, 3, 7");
					InRaSoChiaHet3Va7 bai4 = new InRaSoChiaHet3Va7();
					Output.setText(bai4.arrayListInRaSoChiaHet3Va7(100)+" ");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai5")) {
					DeBai.setText("In ra màn hình các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3,5,7");
					Input.setText("1000, 2000, 3, 5, 7");
					InRaSoChiaHet3Va5Va7 bai5 = new InRaSoChiaHet3Va5Va7();
					Output.setText(bai5.arrayListInRaSoChiaHet3Va5Va7(1000,2000)+" ");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai6")) {
					DeBai.setText("In ra màn hình 5 số hoàn hảo đầu tiên ");
					Input.setText("5");
					InRaSoHoanHao bai6 = new InRaSoHoanHao();
					Output.setText(bai6.arrayListInRaSoHoanHao(5)+" ");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai7a")) {
					DeBai.setText("Trong các số tự nhiên <=100 hãy đếm xem có bao nhiêu số chia het cho 5");
					Input.setText("100, 5");
					DemSo bai7a = new DemSo();
					Output.setText(bai7a.soSoChiaHet5(100)+" ");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai7b")) {
					DeBai.setText("Trong các số tự nhiên <=100 hãy đếm xem có bao nhiêu số chia 5 du 1");
					Input.setText("100");
					DemSo bai7b = new DemSo();
					Output.setText(bai7b.soSoChiaHet5Du1(100)+" ");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai7c")) {
					DeBai.setText("Trong các số tự nhiên <=100 hãy đếm xem có bao nhiêu số chia 5 du 2");
					Input.setText("100");
					DemSo bai7c = new DemSo();
					Output.setText(bai7c.soSoChiaHet5Du2(100)+" ");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai7d")) {
					DeBai.setText("Trong các số tự nhiên <=100 hãy đếm xem có bao nhiêu số chia 5 du 3");
					Input.setText("100");
					DemSo bai7d = new DemSo();
					Output.setText(bai7d.soSoChiaHet5Du3(100)+" ");
				}
				
				//Tuần 30
				if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 30") && choice_1.getSelectedItem().equalsIgnoreCase("bai1")) {
					DeBai.setText("Cho N bất kỳ. Tính tổng S=1+1/(1+2) + 1/(1+2+3) +…+ 1/(1+2+3+..+N)");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					bai1 Bai1= new bai1();
					Output.setText(Bai1.tinhBai1(Integer.parseInt(input))+"");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 30") && choice_1.getSelectedItem().equalsIgnoreCase("bai2")) {
					DeBai.setText("Cho N bất kỳ.Tính tổng S= 1+ 1/2! + 1/3! + … + 1/N!");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					bai2 Bai2= new bai2();
					Output.setText(Bai2.tinhTong2(Integer.parseInt(input))+"");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 30") && choice_1.getSelectedItem().equalsIgnoreCase("bai3")) {
					DeBai.setText("Cho N bất kỳ. tính tổng S=1+1/(1+2!) + 1/(1+2!+3!)+ ..+ 1/(1+2!+3!+..+N!)");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					bai3 Bai3= new bai3();
					Output.setText(Bai3.tinhTong3(Integer.parseInt(input))+"");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 30") && choice_1.getSelectedItem().equalsIgnoreCase("bai4")) {
					DeBai.setText("Dãy Fibonaxi 1, 2, 3, … F(k) = F(k-1) + F(k-2). Tính số Fibonaxi thứ N.");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					bai4 Bai4= new bai4();
					Output.setText(Bai4.Fibonacci(Integer.parseInt(input))+"");
				}
				
				//Tuần 31
				if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai1")) {
					DeBai.setText("Cho một dãy số tự nhiên, viết chương trình sắp xếp dãy này theo thứ tự giảm dần.");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					String[] arr =  input.split(" ");
					int[] values = Arrays.stream(arr)
	                        .mapToInt(Integer::parseInt)
	                        .toArray();
					ArrayList<Integer> arr1 = new  ArrayList<Integer>();
					for(int i : values ) {
						arr1.add(i);
					}
					arr1.sort((o1, o2) -> o2 - o1);// sap xep giam dan 
					Output.setText(arr1 +" ");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai2")) {
					DeBai.setText("Cho dãy số tự nhiên, in ra màn hình tất cả các số nguyên tố của dãy này.");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					String[] arr =  input.split(" ");
					int[] values = Arrays.stream(arr)
	                        .mapToInt(Integer::parseInt)
	                        .toArray();
					ArrayList<Integer> arr1 = new  ArrayList<Integer>();
					in_ra_hop_so x = new in_ra_hop_so();
					for(int i : values ) {
						if(x.checkHopSo(i)==false) {
							arr1.add(i);
						}
					}
					Output.setText(arr1+" ");
					
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai3")) {
					DeBai.setText("Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị min của dãy này và tất cả các chỉ số ứng với giá trị min này..");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					String[] arr =  input.split(" ");
					int[] values = Arrays.stream(arr)
	                        .mapToInt(Integer::parseInt)
	                        .toArray();
					bai_tap_tuan_31.bai3 a= new bai_tap_tuan_31.bai3();
					int x=a.timMin(values);
					ArrayList<Integer> arr1 = new  ArrayList<Integer>();
                    for(int i=0;i<values.length;i++) {
						if(values[i]==x) {
							arr1.add(i);
						}
					}
                    Output.setText("Min="+Integer.toString(x)+" và nằm ở vị trí "+arr1);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai4")) {
					DeBai.setText("Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị max của dãy này và tất cả các chỉ số ứng với giá trị max này.");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					String[] arr =  input.split(" ");
					int[] values = Arrays.stream(arr)
	                        .mapToInt(Integer::parseInt)
	                        .toArray();
					bai_tap_tuan_31.bai4 a= new bai_tap_tuan_31.bai4();
					int x=a.timMax(values);
					ArrayList<Integer> arr1 = new  ArrayList<Integer>();
                    for(int i=0;i<values.length;i++) {
						if(values[i]==x) {
							arr1.add(i);
						}
					}
                    Output.setText("Max="+Integer.toString(x)+" và nằm ở vị trí "+arr1);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai5")) {
					DeBai.setText("Cho một dãy số tự nhiên, hãy đếm xem trong dãy số trên có bao nhiêu số nguyên tố, có bao nhiêu hợp số.");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					String[] arr =  input.split(" ");
					int[] values = Arrays.stream(arr)
	                        .mapToInt(Integer::parseInt)
	                        .toArray();// chuyen mảng thành int
					int count=0;
					in_ra_hop_so x = new in_ra_hop_so();
					for(int i=0;i<values.length;i++) {
						if(x.checkHopSo(values[i])) {
							count++;
						}
					}
					Output.setText("Số hợp số trong day là"+count+" ;số số nguyên tố trong dãy là: "+(values.length-count));
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai6")) {
					DeBai.setText("Cho một dãy số tự nhiên, hãy in ra tất cả các số hạng của dãy trên thỏa mãn: số này là ước số thực sự của 1 số hạng khác trong dãy trên.");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					String[] arr =  input.split(" ");
					int[] values = Arrays.stream(arr)
	                        .mapToInt(Integer::parseInt)
	                        .toArray();// chuyen mảng thành int
				}
				// Tuần 32
				if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai1")) {
					DeBai.setText("Cho trước 1 xâu ký tự là họ tên người đầy đủ nhưng khi nhập có thể thừa một số dấu cách. Hãy xóa đi các dấu cách thừa và in ra họ tên chính xác.");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					Output.setText(input.replaceAll("  "," "));
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai2")) {
					DeBai.setText("Cho trước xâu ký tự bất kỳ. Hãy đếm xem trong xâu có bao nhiêu lần xuất hiện xâu con “abc”");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					int count =0;
					for(int i=0;i<input.length()-2;i++) {
						String b = input.substring(i, i+3);
						if(b.contains("abc")) {
							count ++;
						}
					}
					Output.setText("Số lần xuất hiện ký tự abc là "+count);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai3")){
					DeBai.setText("Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần tên của người này");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					input.lastIndexOf(" ");
					int b =input.lastIndexOf(" ");
					Output.setText("phần tên là: "+input.substring(b+1, input.length()));

				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai4")){
					DeBai.setText("Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần họ của người này");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					int b = input.indexOf(" ");
					Output.setText("Phần họ là : "+ input.substring(0,b));
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai5")){
					DeBai.setText("Bài 05: Cho một xâu ký tự bao gồm toàn các ký tự 0,1. Hãy biến đổi xâu này theo cách 0🡪1, 1🡪0 và in ra kết quả.");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					String[] arr = input.split("");
					String s="";
					for(int i=0;i<arr.length;i++) {
						if(arr[i].equalsIgnoreCase("1")) {
							s=s+"0";
						}else {
							s=s+"1";
						}
					}
					Output.setText(s);
					
					
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai6")){
					DeBai.setText("Cho trước xâu ký tự S, in ra xâu S1 ngược lại xâu S.");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					String[] arr = input.split("");
					String s="";
					for(int i=arr.length-1;i>=0;i--) {
						s=s+arr[i];
					}
					Output.setText(s);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai7")) {
					DeBai.setText("Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn tên “An”.(họ tên cách nhau bằng dấu ';')");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhập danh sách học sinh");
					}
					String[] arr = input.split(";");
					int count =0;
					for(int i=0;i<arr.length;i++) {
						int b =arr[i].lastIndexOf(" ");
						String x = "An";
						if(x.equalsIgnoreCase(arr[i].substring(b+1, arr[i].length()))) {
							count ++;
						}
					}
					Output.setText("Số lượng bạn tên An là "+count);
					
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai8")) {
					DeBai.setText("Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có phần đệm là “Thị”.( họ tên cách nhau bằng dấu '; '");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Danh sách học sinh");
					}
					String[] arr = input.split("; ");
					int count=0;
					for(int i=0;i<arr.length;i++) {
						int a= arr[i].indexOf(" ");
						int b =arr[i].lastIndexOf(" ");
						String x = "Thị";
						if(x.equalsIgnoreCase(arr[i].substring(a+1, b))) {
							count ++;
						}
					}
					Output.setText("Số lượng bạn có phần đềm là Thị là "+count);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai9")) {
					DeBai.setText("Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có tên bắt đầu bằng chữ “H”.( họ tên cách nhau bằng dấu '; '");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Danh sách học sinh");
					}
					String[] arr = input.split("; ");
					int count=0;
					for(int i=0;i<arr.length;i++) {
						int b =arr[i].lastIndexOf(" ");
						Character x= 'H';
						if(x.equals(arr[i].charAt(b+1))) {
							count++;
						}
						
					}
					Output.setText("Số lượng bạn có tên bắt đầu bằng H là "+count);
				    
				}
				}
		});

		button.setBounds(44, 185, 66, 21);
		frame.getContentPane().add(button);

	}
}
