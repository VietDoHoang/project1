package bai_tap_tuan_29;
import java.lang.Math;
import java.util.ArrayList;
public class in_ra_hop_so {
	public boolean checkHopSo(int a) {
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0) {
				return true;
			}
		}
		return false;
	}
	public ArrayList<Integer> printHopSo(int a) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0;i<=a;i++) {
			if(checkHopSo(i)) {
				arr.add(i);
			}
		}
		return arr;
	}
}
