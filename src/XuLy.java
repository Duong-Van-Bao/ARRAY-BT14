import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = nhapN(scan);
     int a[] = nhapMang(scan, n);
     xuatMang(a);
     boolean doiXung = ktDoiXung(a);
     if(doiXung) {
    	 System.out.println("Mảng đối xứng");
     } else {
    	 System.out.println("Mảng không đối xứng");
     }
     a = xoayTrai(a, scan);
     xuatMang(a);
	}

	public static int[] nhapMang(Scanner scan, int n) {
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}	
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập n > 0");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 0);
		return n;
	}
	
	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}
	
	public static boolean ktDoiXung(int a[]) {
		for(int i = 0; i < a.length/2; i++) {
			if(a[i] != a[a.length - 1 - i]) {
				return false;
			} 
		}
		return true;
	}
	
	public static int[] xoayTrai(int a[], Scanner scan) {
		int k;
		int tam;
		do {
			System.out.println("Vui lòng nhập k > 0");
			k = Integer.parseInt(scan.nextLine());
		} while(k < 0);
		
		k  %= a.length;
		for(int i = 0; i < k; i++) {
		   //Tạo biến tạm lưu trữ a[0]
			tam = a[0];
			//Duyệt và chép đè phần tử thứ a[i+1] lên a[i]
			for(int j = 0; j < a.length -1; j++) {
				a[j] = a[j+1];
			}
			a[a.length-1] = tam;
		}
		return a;
	}
}
