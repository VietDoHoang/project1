package bai_tap_tuan_31;

import bai_tap_tuan_29.in_ra_hop_so;

public class bai5 {
	public static void main(String[] args) {
		int[] a= new int [] {2,5,12,8,4,8,3,12};
		int count=0;
		in_ra_hop_so x = new in_ra_hop_so();
		for(int i=0;i<a.length;i++) {
			if(x.checkHopSo(a[i])) {
				count++;
			}
		}
		System.out.println("So hop so trong day so la: "+count);
		System.out.println("So so nguyen to trong day la: "+(a.length-count));
		
	}
}
