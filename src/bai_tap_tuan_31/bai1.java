package bai_tap_tuan_31;

import java.util.Arrays;

public class bai1 {
	public static void main(String[] args) {
		int arr[] = new int[] {3,2,6,4,9,1,3};
		Arrays.sort(arr);
		for(int i=(arr.length-1);i>=0;i--) {
			System.out.println("arr["+i+"]"+"="+ arr[i]+" ");
		}
		
		String a="1 2 3 4 5 6";
		String b[]= a.split(" ");
		int[] values = Arrays.stream(b)
                .mapToInt(Integer::parseInt)
                .toArray();
		for(int i : values) {
			System.out.println(i);
		}
	}

}
