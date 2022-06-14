package bai_tap_tuan_29;

import java.util.ArrayList;

public class InRaSoHoanHao {
	public void inRaSoHoanHao(int a) {
		int count=0;
		for(int i=2;i<=1000;i++) {
			in_ra_hop_so c= new in_ra_hop_so();
			if(c.checkHopSo(i)== false && i!= 11) {
				long x = (long) (Math.pow(2,i-1)*((Math.pow(2, i)-1))); 
				System.out.println(x);
				count ++;
			}
			if(count == a) break;
		}
	}
	public ArrayList<Long> arrayListInRaSoHoanHao(int a) {
		ArrayList<Long> arr= new ArrayList<>();
		int count=0;
		for(int i=2;i<=1000;i++) {
			in_ra_hop_so c= new in_ra_hop_so();
			if(c.checkHopSo(i)== false && i!= 11) {
				long x = (long) (Math.pow(2,i-1)*((Math.pow(2, i)-1))); 
				arr.add(x);
				count ++;
			}
			if(count == a) break;
		}
		return arr;
	}

}
