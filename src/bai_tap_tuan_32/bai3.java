package bai_tap_tuan_32;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap chuoi ki tu  :");
		String a = sc.nextLine();
		System.out.println("Chuoi ban dau la: "+a);
		a.lastIndexOf(" ");
		int b =a.lastIndexOf(" ");
		System.out.println("Ten la: "+ a.substring(b+1, a.length()));	
	}

}
