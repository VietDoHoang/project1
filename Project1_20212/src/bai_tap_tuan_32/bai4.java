package bai_tap_tuan_32;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap Ho va Ten  :");
		String a = sc.nextLine();
		System.out.println("Ho Ten la: "+a);
		int b = a.indexOf(" ");
		System.out.println("Ho la: "+ a.substring(0,b));
	}

}
