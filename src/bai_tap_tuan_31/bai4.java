package bai_tap_tuan_31;

public class bai4 {
	public static int timMax(int[] arr) {
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>=temp) {
				temp=arr[i];
			}
		}
		return temp;
		
	}
	public static void main(String[] args) {
		int[] a= new int [] {-5,2,5,12,-7,-10,8,4,-10,8,3,12};
		System.out.println("gia tri lon nhat cua day so la: "+ timMax(a));
		System.out.print("Vi Tri trog mang la: ");
		for(int i=0;i<a.length;i++) {
			if(timMax(a)==a[i]) {
				System.out.print(i+" ");
			}
		}

	}

}
