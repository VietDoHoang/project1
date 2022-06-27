package bai_tap_tuan_32;

import java.util.Scanner;

public class bai7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("do dai danh sach la:");
		int n = sc.nextInt();
		String[] a = new String[n+1];
		System.out.println("Nhap ho va ten cua danh sach");
		for(int i=0;i<=n;i++) {
			a[i] = sc.nextLine();
		}
		int count =0;
		for(int i=0;i<=n;i++) {
			int b =a[i].lastIndexOf(" ");
			String x = "An";
			if(x.equalsIgnoreCase(a[i].substring(b+1, a[i].length()))) {
				count ++;
			}
		}
		System.out.println("So Luong ban ten An trong danh sach la "+count);
		String input = "Đỗ Hoàng Việt; Phạm Thái An; Trần Đức An";
		String[] arr = input.split("; ",10);
		int count1 =0;
		for(int i=0;i<arr.length;i++) {
			int b =arr[i].lastIndexOf(" ");
			String x = "An";
			System.out.println(arr[i]);
			if(x.equalsIgnoreCase(arr[i].substring(b+1, arr[i].length()))) {
				count1 ++;
			}
		}
		System.out.print("Số lượng bạn tên An là "+count1);

	}

}
