package bai_tap_tuan_32;

public class class9 {
	public static void main(String[] args) {
		String[] arr = {"Do Hoang Viet","Tran Duc Viet","Vu Thi Lan", "Le Thi Hn","Pham Thai Hung"};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int b =arr[i].lastIndexOf(" ");
			Character x= 'H';
			if(x.equals(arr[i].charAt(b+1))) {
				count++;
			}
			
		}
		System.out.println("So nguoi co ten bat dau bang van 'H' la "+ count);
	}

}
