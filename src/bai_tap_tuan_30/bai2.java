package bai_tap_tuan_30;

public class bai2 {
	public float tinhTong2(int n) {
		if(n<=0) {
			System.out.println("nhap lai n");
			return -1;
		}
		float sum=0, t=0, x=1;
		for(int i=1;i<=n;i++) {
			x*=i;
			sum += 1/x;
			
		}
		return sum;
	}

}
