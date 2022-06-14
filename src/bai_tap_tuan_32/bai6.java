package bai_tap_tuan_32;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap chuoi ki tu  :");
		String a = sc.nextLine();
		System.out.println("Chuoi ban dau la: "+a);
		char[] ch = a.toCharArray();
		System.out.print("Chuoi ki tu s1 la ");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}


}
