package bai_tap_tuan_29;

import java.util.ArrayList;

public class InRaSoChiaHet3Va7 {
	public boolean checkChiaHet3Va7(int a){
		if(a%21==0) {
			return true;
		}else {
			return false;
		}
	}
	public void InRaSoChiaHet3Va7(int a) {
		for(int i=1;i<=a;i++) {
			if(checkChiaHet3Va7(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public ArrayList<Integer> arrayListInRaSoChiaHet3Va7(int a) {
		ArrayList<Integer> arr= new ArrayList<>();
		for(int i=1;i<=a;i++) {
			if(checkChiaHet3Va7(i)) {
				arr.add(i);
			}
		}
		return arr;
	}

}
