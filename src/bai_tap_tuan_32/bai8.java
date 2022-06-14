package bai_tap_tuan_32;

import java.util.Scanner;

public class bai8 {
	public static void main(String[] args) {
		String[] arr = {"Do Hoang Viet","Tran Duc Viet","Vu Thi Lan", "Le Thi An","Pham Thai An"};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int a= arr[i].indexOf(" ");
			int b =arr[i].lastIndexOf(" ");
			String x = "Thi";
			if(x.equalsIgnoreCase(arr[i].substring(a+1, b))) {
				count ++;
			}
		}
		System.out.println("So Nguoi co ten Dem'Thi' trong danh sach la "+ count);
	}

}
