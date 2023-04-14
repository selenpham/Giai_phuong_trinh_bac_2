//1.2. Viết chương trình giải phương trình bậc 2 có dạng: ax2+ bx + c = 0
//   Với tham số a,b,c nhập từ bàn phím.
package LAB2;

import java.util.Scanner;

public class Thuchanh1_2_Giap_phuong_trinh_bac_2 {
	
	public static void main (String[]args) {
	
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap so a,b,c tuong ung");
		double a = scanner.nextDouble();	
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double Delta = b*b - 4*a*c;
		
		if (Delta <0) {
			System.out.println("Phuong trinh vo nghiem");
		}
		else if (Delta == 0) {
			double x=  (double) (-b/(2*a));
			System.out.println("Phuong trinh co 1 nghiem x= " +x);
			
		}
		else {
			double x1 =  (-b + Math.sqrt(Delta)) / (2 * a);
			double x2 =  (-b - Math.sqrt(Delta)) / (2 * a);
			System.out.println("Phuong trinh co 2 nghiem x1= "+x1 +", x2= " +x2);
		}
		
		
	}
}
