package bai_tap_tuan_29;

import java.util.ArrayList;

public class InRaSoChiaHet3Va5Va7 {
	public boolean checkChiaHet3Va5Va7(int a){
		if(a%105 ==0) {
			return true;
		}else {
			return false;
		}
	}
	public void InRaSoChiaHet3Va5Va7(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(checkChiaHet3Va5Va7(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public ArrayList<Integer> arrayListInRaSoChiaHet3Va5Va7(int a,int b) {
		ArrayList<Integer> arr= new ArrayList<>();
		for(int i=a;i<=b;i++) {
			if(checkChiaHet3Va5Va7(i)) {
				arr.add(i);
			}
		}
		return arr;
	}

}
