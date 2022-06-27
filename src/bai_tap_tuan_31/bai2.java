package bai_tap_tuan_31;

import bai_tap_tuan_29.in_ra_hop_so;

public class bai2 {
	public static void main(String[] args) {
		int arr[] = new int[] {2,3,4,5,6,7,8,9,10,11};
		in_ra_hop_so a = new in_ra_hop_so();
		for(int i=0;i< arr.length;i++) {
			if(a.checkHopSo(arr[i])== false){
				System.out.println(arr[i]+" ");
			}
		}
	}

}
