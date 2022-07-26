package bai_tap_tuan_31;

import java.util.Arrays;

import bai_tap_tuan_29.in_ra_hop_so;


public class bai1 {
	public static void main(String[] args) {
		int arr[] = new int[] {2,3,4,5,6,7,8,9};
		Arrays.sort(arr);
		for(int i=(arr.length-1);i>=0;i--) {
			System.out.println("arr["+i+"]"+"="+ arr[i]+" ");
		}

		
	}
	
	public void sapXepNguoc(int[] x) {
		for(int i=0;i< x.length;i++) {
			int temp = x[i];
			for(int j=i+1;i<x.length;j++) {
				if(temp<=x[j]) {
					temp=x[j];
				}
			}
			x[i]=temp;
		}
	}

}
