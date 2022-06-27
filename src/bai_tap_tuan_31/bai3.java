package bai_tap_tuan_31;

public class bai3 {
	public int timMin(int[] arr) {
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<=temp) {
				temp=arr[i];
			}
		}
		return temp;
		
	}

}
