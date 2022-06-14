package bai_tap_tuan_29;

import java.util.ArrayList;

public class in_ra_so_nguyen_to {
	public static boolean checkHopSo(int a) {
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0) {
				return true;
			}
		}
		return false;
	}
	public static void printSoNguyenTo(int a) {
		for(int i=2;i<=a;i++) {
			if(checkHopSo(i) == false) {
				System.out.print(i+" ");
			}
		}
	}
	public static void printSoNguyenTo(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(checkHopSo(i) == false) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		printSoNguyenTo(1000,2000);
	}
	public ArrayList<Integer> listSoNguyenTo(int a) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=2;i<=a;i++) {
			if(checkHopSo(i)== false) {
				arr.add(i);
			}
		}
		return arr;
	}
	public ArrayList<Integer> listSoNguyenTo(int a, int b) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=a;i<=b;i++) {
			if(checkHopSo(i)== false) {
				arr.add(i);
			}
		}
		return arr;
	}
}
