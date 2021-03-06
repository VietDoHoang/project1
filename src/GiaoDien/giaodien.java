package GiaoDien;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
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
import java.awt.TextArea;
public class giaodien {

	private JFrame frame;
	private JTextField Input;
	private JTextField Output;
	private JLabel DeBai;

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
		frame = new JFrame("????? Ho??ng Vi???t - 20198272");
		frame.setBounds(100, 100, 1200, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Choice choice = new Choice();
		choice.setBounds(44, 45, 183, 18);
		frame.getContentPane().add(choice);
		
				
		choice.add("Bai tap tuan 29");
		choice.add("Bai tap tuan 30");
		choice.add("Bai tap tuan 31");
		choice.add("Bai tap tuan 32"); 
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(44, 126, 183, 18);
		frame.getContentPane().add(choice_1);
		
		choice_1.add("Bai1");
		choice_1.add("Bai2");
		choice_1.add("Bai3");
		choice_1.add("Bai4");
		choice_1.add("Bai5");
		choice_1.add("Bai6");
		choice_1.add("Bai7a");
		choice_1.add("Bai7b");
		choice_1.add("Bai7c");
		choice_1.add("Bai7d");
		choice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				Choice choiceTmp = (Choice) e.getSource();
				
				if(choiceTmp.getSelectedItem()==choice.getItem(0)) {
					choice_1.removeAll();
					choice_1.add("Bai1");
					choice_1.add("Bai2");
					choice_1.add("Bai3");
					choice_1.add("Bai4");
					choice_1.add("Bai5");
					choice_1.add("Bai6");
					choice_1.add("Bai7a");
					choice_1.add("Bai7b");
					choice_1.add("Bai7c");
					choice_1.add("Bai7d");
				}else if(choiceTmp.getSelectedItem()==choice.getItem(1)) {
					choice_1.removeAll();
					choice_1.add("Bai1");
					choice_1.add("Bai2");
					choice_1.add("Bai3");
					choice_1.add("Bai4");
				}else if(choiceTmp.getSelectedItem()==choice.getItem(2)) {
					choice_1.removeAll();
					choice_1.add("Bai1");
					choice_1.add("Bai2");
					choice_1.add("Bai3");
					choice_1.add("Bai4");
					choice_1.add("Bai5");
					choice_1.add("Bai6");
					
				}else {
					choice_1.removeAll();
					choice_1.add("Bai1");
					choice_1.add("Bai2");
					choice_1.add("Bai3");
					choice_1.add("Bai4");
					choice_1.add("Bai5");
					choice_1.add("Bai6");
					choice_1.add("Bai7");
					choice_1.add("Bai8");
					choice_1.add("Bai9");
					
					
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
		
		
		
		JTextArea Output = new JTextArea(20,20);
		Output.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Output.setBounds(358, 221, 359, 154);
		frame.getContentPane().add(Output);
		Output.setLineWrap(true);
		Output.setWrapStyleWord(true);
		Output.setEditable(false);
		
		Button button = new Button("Chon");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai1")) {
					DeBai.setText("In ra m??n h??nh t???t c??? c??c h???p s??? <100");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai2")) {
					DeBai.setText("In ra m??n h??nh 20 s??? nguy??n t??? ?????u ti??n");
					Input.setText("20");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai3")) {
					DeBai.setText("In ra m??n h??nh t???t c??? c??c s??? nguy??n t??? t??? 1000 ?????n 2000");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai4")) {
					DeBai.setText("In ra m??n h??nh c??c s??? <100 v?? chia h???t cho 3,7");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai5")) {
					DeBai.setText("In ra m??n h??nh c??c s??? n???m gi???a 1000 v?? 2000 ?????ng th???i chia h???t cho 3,5,7");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai6")) {
					DeBai.setText("In ra m??n h??nh 5 s??? ho??n h???o ?????u ti??n ");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai7a")) {
					DeBai.setText("Trong c??c s??? t??? nhi??n <=100 h??y ?????m xem c?? bao nhi??u s??? chia het cho 5");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai7b")) {
					DeBai.setText("Trong c??c s??? t??? nhi??n <=100 h??y ?????m xem c?? bao nhi??u s??? chia 5 du 1");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai7c")) {
					DeBai.setText("Trong c??c s??? t??? nhi??n <=100 h??y ?????m xem c?? bao nhi??u s??? chia 5 du 2");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai7d")) {
					DeBai.setText("Trong c??c s??? t??? nhi??n <=100 h??y ?????m xem c?? bao nhi??u s??? chia 5 du 3");
					Input.setText(null);
					Output.setText(null);
				}
				
				//Tu???n 30
				if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 30") && choice_1.getSelectedItem().equalsIgnoreCase("bai1")) {
					DeBai.setText("Cho N b???t k???. T??nh t???ng S=1+1/(1+2) + 1/(1+2+3) +???+ 1/(1+2+3+..+N)");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 30") && choice_1.getSelectedItem().equalsIgnoreCase("bai2")) {
					DeBai.setText("Cho N b???t k???.T??nh t???ng S= 1+ 1/2! + 1/3! + ??? + 1/N!");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 30") && choice_1.getSelectedItem().equalsIgnoreCase("bai3")) {
					DeBai.setText("Cho N b???t k???. t??nh t???ng S=1+1/(1+2!) + 1/(1+2!+3!)+ ..+ 1/(1+2!+3!+..+N!)");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 30") && choice_1.getSelectedItem().equalsIgnoreCase("bai4")) {
					DeBai.setText("D??y Fibonaxi 1, 2, 3, ??? F(k) = F(k-1) + F(k-2). T??nh s??? Fibonaxi th??? N.");
					Input.setText(null);
					Output.setText(null);
				}
				
				//Tu???n 31
				if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai1")) {
					DeBai.setText("Cho m???t d??y s??? t??? nhi??n, vi???t ch????ng tr??nh s???p x???p d??y n??y theo th??? t??? gi???m d???n.(M???i s??? c??ch nhau b???ng kho???ng tr???ng)");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai2")) {
					DeBai.setText("Cho d??y s??? t??? nhi??n, in ra m??n h??nh t???t c??? c??c s??? nguy??n t??? c???a d??y n??y.(M???i s??? c??ch nhau b???ng kho???ng tr???ng)");
					Input.setText(null);
					Output.setText(null);
					
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai3")) {
					DeBai.setText("Cho m???t d??y c??c s??? t??? nhi??n, t??m v?? in ra 1 gi?? tr??? min c???a d??y n??y v?? t???t c??? c??c ch??? s??? ???ng v???i gi?? tr??? min n??y.(M???i s??? c??ch nhau b???ng kho???ng tr???ng)");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai4")) {
					DeBai.setText("Cho m???t d??y c??c s??? t??? nhi??n, t??m v?? in ra 1 gi?? tr??? max c???a d??y n??y v?? t???t c??? c??c ch??? s??? ???ng v???i gi?? tr??? max n??y.");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai5")) {
					DeBai.setText("Cho m???t d??y s??? t??? nhi??n, h??y ?????m xem trong d??y s??? tr??n c?? bao nhi??u s??? nguy??n t???, c?? bao nhi??u h???p s???.");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai6")) {
					DeBai.setText("Cho m???t d??y s??? t??? nhi??n, h??y in ra t???t c??? c??c s??? h???ng c???a d??y tr??n th???a m??n: s??? n??y l?? ?????c s??? th???c s??? c???a 1 s??? h???ng kh??c trong d??y tr??n.");
					Input.setText(null);
					Output.setText(null);
				}
				// Tu???n 32
				if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai1")) {
					DeBai.setText("Cho tr?????c 1 x??u k?? t??? l?? h??? t??n ng?????i ?????y ????? nh??ng khi nh???p c?? th??? th???a m???t s??? d???u c??ch. H??y x??a ??i c??c d???u c??ch th???a v?? in ra h??? t??n ch??nh x??c.");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai2")) {
					DeBai.setText("Cho tr?????c x??u k?? t??? b???t k???. H??y ?????m xem trong x??u c?? bao nhi??u l???n xu???t hi???n x??u con ???abc???");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai3")){
					DeBai.setText("Cho tr?????c 1 x??u k?? t??? l?? h??? t??n ng?????i ?????y ?????, h??y t??ch ra ph???n t??n c???a ng?????i n??y");
					Input.setText(null);
					Output.setText(null);

				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai4")){
					DeBai.setText("Cho tr?????c 1 x??u k?? t??? l?? h??? t??n ng?????i ?????y ?????, h??y t??ch ra ph???n h??? c???a ng?????i n??y");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai5")){
					DeBai.setText("B??i 05: Cho m???t x??u k?? t??? bao g???m to??n c??c k?? t??? 0,1. H??y bi???n ?????i x??u n??y theo c??ch 0????1, 1????0 v?? in ra k???t qu???.");
					Input.setText(null);
					Output.setText(null);
					
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai6")){
					DeBai.setText("Cho tr?????c x??u k?? t??? S, in ra x??u S1 ng?????c l???i x??u S.");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai7")) {
					DeBai.setText("Cho danh s??ch h??? t??n ?????y ????? h???c sinh. H??y ?????m xem c?? bao nhi??u b???n t??n ???An???.(h??? t??n c??ch nhau b???ng d???u ';')");
					Input.setText(null);
					Output.setText(null);
					
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai8")) {
					DeBai.setText("Cho danh s??ch h??? t??n ?????y ????? h???c sinh. H??y ?????m xem c?? bao nhi??u b???n c?? ph???n ?????m l?? ???Th??????.( h??? t??n c??ch nhau b???ng d???u '; '");
					Input.setText(null);
					Output.setText(null);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai9")) {
					DeBai.setText("Cho danh s??ch h??? t??n ?????y ????? h???c sinh. H??y ?????m xem c?? bao nhi??u b???n c?? t??n b???t ?????u b???ng ch??? ???H???.( h??? t??n c??ch nhau b???ng d???u '; '");
					Input.setText(null);
					Output.setText(null);
				    
				}
			
		}});

		button.setBounds(44, 185, 66, 21);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("ch???y");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai1")) {
					DeBai.setText("In ra m??n h??nh t???t c??? c??c h???p s??? <100");
					Input.setText("100");
					String input = Input.getText();
					Input.setText("100");
					in_ra_hop_so bai1= new in_ra_hop_so();
					Output.setText(bai1.printHopSo(Integer.parseInt(input))+"");
					
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai2")) {
					DeBai.setText("In ra m??n h??nh 20 s??? nguy??n t??? ?????u ti??n");
					Input.setText("20");
					String input = Input.getText();
					in_ra_so_nguyen_to bai2= new in_ra_so_nguyen_to();
					Output.setText(bai2.listSoNguyenTo(Integer.parseInt(input))+"");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai3")) {
					DeBai.setText("In ra m??n h??nh t???t c??? c??c s??? nguy??n t??? t??? 1000 ?????n 2000");
					String input = Input.getText();
					Input.setText("1000, 2000");
					in_ra_so_nguyen_to bai3= new in_ra_so_nguyen_to();
					Output.setText(bai3.listSoNguyenTo(1000,2000)+"");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai4")) {
					DeBai.setText("In ra m??n h??nh c??c s??? <100 v?? chia h???t cho 3,7");
					Input.setText("100, 3, 7");
					InRaSoChiaHet3Va7 bai4 = new InRaSoChiaHet3Va7();
					Output.setText(bai4.arrayListInRaSoChiaHet3Va7(100)+" ");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai5")) {
					DeBai.setText("In ra m??n h??nh c??c s??? n???m gi???a 1000 v?? 2000 ?????ng th???i chia h???t cho 3,5,7");
					Input.setText("1000, 2000, 3, 5, 7");
					InRaSoChiaHet3Va5Va7 bai5 = new InRaSoChiaHet3Va5Va7();
					Output.setText(bai5.arrayListInRaSoChiaHet3Va5Va7(1000,2000)+" ");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai6")) {
					DeBai.setText("In ra m??n h??nh 5 s??? ho??n h???o ?????u ti??n ");
					Input.setText("5");
					InRaSoHoanHao bai6 = new InRaSoHoanHao();
					Output.setText(bai6.arrayListInRaSoHoanHao(5)+" ");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai7a")) {
					DeBai.setText("Trong c??c s??? t??? nhi??n <=100 h??y ?????m xem c?? bao nhi??u s??? chia het cho 5");
					Input.setText("100, 5");
					DemSo bai7a = new DemSo();
					Output.setText(bai7a.soSoChiaHet5(100)+" ");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai7b")) {
					DeBai.setText("Trong c??c s??? t??? nhi??n <=100 h??y ?????m xem c?? bao nhi??u s??? chia 5 du 1");
					Input.setText("100");
					DemSo bai7b = new DemSo();
					Output.setText(bai7b.soSoChiaHet5Du1(100)+" ");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai7c")) {
					DeBai.setText("Trong c??c s??? t??? nhi??n <=100 h??y ?????m xem c?? bao nhi??u s??? chia 5 du 2");
					Input.setText("100");
					DemSo bai7c = new DemSo();
					Output.setText(bai7c.soSoChiaHet5Du2(100)+" ");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 29") && choice_1.getSelectedItem().equalsIgnoreCase("bai7d")) {
					DeBai.setText("Trong c??c s??? t??? nhi??n <=100 h??y ?????m xem c?? bao nhi??u s??? chia 5 du 3");
					Input.setText("100");
					DemSo bai7d = new DemSo();
					Output.setText(bai7d.soSoChiaHet5Du3(100)+" ");
				}
				
				//Tu???n 30
				if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 30") && choice_1.getSelectedItem().equalsIgnoreCase("bai1")) {
					DeBai.setText("Cho N b???t k???. T??nh t???ng S=1+1/(1+2) + 1/(1+2+3) +???+ 1/(1+2+3+..+N)");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					bai1 Bai1= new bai1();
					Output.setText(Bai1.tinhBai1(Integer.parseInt(input))+"");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 30") && choice_1.getSelectedItem().equalsIgnoreCase("bai2")) {
					DeBai.setText("Cho N b???t k???.T??nh t???ng S= 1+ 1/2! + 1/3! + ??? + 1/N!");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					bai2 Bai2= new bai2();
					Output.setText(Bai2.tinhTong2(Integer.parseInt(input))+"");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 30") && choice_1.getSelectedItem().equalsIgnoreCase("bai3")) {
					DeBai.setText("Cho N b???t k???. t??nh t???ng S=1+1/(1+2!) + 1/(1+2!+3!)+ ..+ 1/(1+2!+3!+..+N!)");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					bai3 Bai3= new bai3();
					Output.setText(Bai3.tinhTong3(Integer.parseInt(input))+"");
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 30") && choice_1.getSelectedItem().equalsIgnoreCase("bai4")) {
					DeBai.setText("D??y Fibonaxi 1, 2, 3, ??? F(k) = F(k-1) + F(k-2). T??nh s??? Fibonaxi th??? N.");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					bai4 Bai4= new bai4();
					Output.setText(Bai4.Fibonacci(Integer.parseInt(input))+"");
				}
				
				//Tu???n 31
				if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai1")) {
					DeBai.setText("Cho m???t d??y s??? t??? nhi??n, vi???t ch????ng tr??nh s???p x???p d??y n??y theo th??? t??? gi???m d???n.(M???i s??? c??ch nhau b???ng kho???ng tr???ng)");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nh???p d??y s???");
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
					DeBai.setText("Cho d??y s??? t??? nhi??n, in ra m??n h??nh t???t c??? c??c s??? nguy??n t??? c???a d??y n??y.(M???i s??? c??ch nhau b???ng kho???ng tr???ng)");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap d??y s???");
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
					DeBai.setText("Cho m???t d??y c??c s??? t??? nhi??n, t??m v?? in ra 1 gi?? tr??? min c???a d??y n??y v?? t???t c??? c??c ch??? s??? ???ng v???i gi?? tr??? min n??y.(M???i s??? c??ch nhau b???ng kho???ng tr???ng)");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap d??y s???");
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
                    Output.setText("Min="+Integer.toString(x)+" v?? n???m ??? v??? tr?? "+arr1);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai4")) {
					DeBai.setText("Cho m???t d??y c??c s??? t??? nhi??n, t??m v?? in ra 1 gi?? tr??? max c???a d??y n??y v?? t???t c??? c??c ch??? s??? ???ng v???i gi?? tr??? max n??y.");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap d??y s???");
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
                    Output.setText("Max="+Integer.toString(x)+" v?? n???m ??? v??? tr?? "+arr1);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai5")) {
					DeBai.setText("Cho m???t d??y s??? t??? nhi??n, h??y ?????m xem trong d??y s??? tr??n c?? bao nhi??u s??? nguy??n t???, c?? bao nhi??u h???p s???.");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nh???p d??y s???");
					}
					String[] arr =  input.split(" ");
					int[] values = Arrays.stream(arr)
	                        .mapToInt(Integer::parseInt)
	                        .toArray();// chuyen m???ng th??nh int
					int count=0;
					in_ra_hop_so x = new in_ra_hop_so();
					for(int i=0;i<values.length;i++) {
						if(x.checkHopSo(values[i])) {
							count++;
						}
					}
					Output.setText("S??? h???p s??? trong day l??"+count+" ;s??? s??? nguy??n t??? trong d??y l??: "+(values.length-count));
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 31") && choice_1.getSelectedItem().equalsIgnoreCase("bai6")) {
					DeBai.setText("Cho m???t d??y s??? t??? nhi??n, h??y in ra t???t c??? c??c s??? h???ng c???a d??y tr??n th???a m??n: s??? n??y l?? ?????c s??? th???c s??? c???a 1 s??? h???ng kh??c trong d??y tr??n.");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nh???p d??y s???");
					}
					String[] arr =  input.split(" ");
					int[] values = Arrays.stream(arr)
	                        .mapToInt(Integer::parseInt)
	                        .toArray();// chuyen m???ng th??nh int
				}
				// Tu???n 32
				if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai1")) {
					DeBai.setText("Cho tr?????c 1 x??u k?? t??? l?? h??? t??n ng?????i ?????y ????? nh??ng khi nh???p c?? th??? th???a m???t s??? d???u c??ch. H??y x??a ??i c??c d???u c??ch th???a v?? in ra h??? t??n ch??nh x??c.");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nh???p x??u");
					}
					Output.setText(input.replaceAll("  "," "));
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai2")) {
					DeBai.setText("Cho tr?????c x??u k?? t??? b???t k???. H??y ?????m xem trong x??u c?? bao nhi??u l???n xu???t hi???n x??u con ???abc???");
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
					Output.setText("S??? l???n xu???t hi???n k?? t??? abc l?? "+count);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai3")){
					DeBai.setText("Cho tr?????c 1 x??u k?? t??? l?? h??? t??n ng?????i ?????y ?????, h??y t??ch ra ph???n t??n c???a ng?????i n??y");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					input.lastIndexOf(" ");
					int b =input.lastIndexOf(" ");
					Output.setText("ph???n t??n l??: "+input.substring(b+1, input.length()));

				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai4")){
					DeBai.setText("Cho tr?????c 1 x??u k?? t??? l?? h??? t??n ng?????i ?????y ?????, h??y t??ch ra ph???n h??? c???a ng?????i n??y");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Input");
					}
					int b = input.indexOf(" ");
					Output.setText("Ph???n h??? l?? : "+ input.substring(0,b));
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai5")){
					DeBai.setText("B??i 05: Cho m???t x??u k?? t??? bao g???m to??n c??c k?? t??? 0,1. H??y bi???n ?????i x??u n??y theo c??ch 0????1, 1????0 v?? in ra k???t qu???.");
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
					DeBai.setText("Cho tr?????c x??u k?? t??? S, in ra x??u S1 ng?????c l???i x??u S.");
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
					DeBai.setText("Cho danh s??ch h??? t??n ?????y ????? h???c sinh. H??y ?????m xem c?? bao nhi??u b???n t??n ???An???.(h??? t??n c??ch nhau b???ng d???u ';')");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nh???p danh s??ch h???c sinh");
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
					Output.setText("S??? l?????ng b???n t??n An l?? "+count);
					
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai8")) {
					DeBai.setText("Cho danh s??ch h??? t??n ?????y ????? h???c sinh. H??y ?????m xem c?? bao nhi??u b???n c?? ph???n ?????m l?? ???Th??????.( h??? t??n c??ch nhau b???ng d???u '; '");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Danh s??ch h???c sinh");
					}
					String[] arr = input.split("; ");
					int count=0;
					for(int i=0;i<arr.length;i++) {
						int a= arr[i].indexOf(" ");
						int b =arr[i].lastIndexOf(" ");
						String x = "Th???";
						if(x.equalsIgnoreCase(arr[i].substring(a+1, b))) {
							count ++;
						}
					}
					Output.setText("S??? l?????ng b???n c?? ph???n ?????m l?? Th??? l?? "+count);
				}else if(choice.getSelectedItem().equalsIgnoreCase("Bai tap tuan 32") && choice_1.getSelectedItem().equalsIgnoreCase("bai9")) {
					DeBai.setText("Cho danh s??ch h??? t??n ?????y ????? h???c sinh. H??y ?????m xem c?? bao nhi??u b???n c?? t??n b???t ?????u b???ng ch??? ???H???.( h??? t??n c??ch nhau b???ng d???u '; '");
					String input = Input.getText();
					if(input.isEmpty()) {
						JOptionPane.showMessageDialog(frame,"Nhap Danh s??ch h???c sinh");
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
					Output.setText("S??? l?????ng b???n c?? t??n b???t ?????u b???ng H l?? "+count);
				    
				}
			}
		});
		button_1.setBounds(358, 410, 66, 21);
		frame.getContentPane().add(button_1);
		

	}

}

