package bai_tap_tuan_30;

public class bai3 {
	public float tinhTong3(int n) {
		if(n<=0) {
			System.out.println("nhap lai n");
			return -1;
		}
		float sum=0, t=0, x=1;
		for(int i=1;i<=n;i++) {
			x*=i;
			t+=x;
			sum += 1/t;
			
		}
		return sum;
	}

}
