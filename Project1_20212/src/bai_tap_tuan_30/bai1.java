package bai_tap_tuan_30;

public class bai1 {
	public float tinhBai1(int n) {
		float sum=0,t=0;
		if(n<=0) {
			System.out.println("nhap lai n");
			return sum;
		}
		for(int i=1;i<=n;i++) {
			t+=i;
			sum+=(float)1/t;
		}
		return sum;
		
	}

}
