package bai_tap_tuan_32;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap chuoi ki tu  :");
		String a = sc.nextLine();
		System.out.println("Chuoi ban dau la: "+a);
		int count =0;
		for(int i=0;i<a.length()-2;i++) {
			String b = a.substring(i, i+3);
			if(b.contains("abc")) {
				count ++;
			}
		}
		System.out.println("So Lan xuat hien cua ky tu 'abc' la "+count);
		
	}

}
