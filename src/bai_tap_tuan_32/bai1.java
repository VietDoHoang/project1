package bai_tap_tuan_32;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap Ho Ten Day du :");
		String a = sc.nextLine();
		System.out.println("Chuoi ban dau la: "+a);
		a=a.replaceAll(" ","");
		System.out.println("Chuoi sau khi xoa khoang trang la "+a);
	}

}
