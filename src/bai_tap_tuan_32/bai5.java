package bai_tap_tuan_32;

import java.util.ArrayList;
import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap chuoi ki tu  :");
		String a = sc.nextLine();
		System.out.println("Chuoi ban dau la: "+a);
		char[] ch = a.toCharArray();
		System.out.print("Chuoi ki tu sau khi thay doi la ");
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='1') {
				System.out.print('0');
			}else {
				System.out.print('1');
			}
		}
		String xxx = " 111222";
		String[] arr = xxx.split("");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
} 
