package Bai3_2;

public class TAMGIAC extends DIEM {

	TAMGIAC(int x, int y) {
		super(x, y);
	}
	
	public DIEM A , B ,C ;
	
	public void NHAPTAMGIAC() {
		A = new DIEM(x, y);
		B = new DIEM(x, y);
		C = new DIEM(x, y);
		System.out.println("~Điểm A ⇩");
		A.NHAPDIEM();
		System.out.println("~~Điểm B ⇩");
		B.NHAPDIEM();
		System.out.println("~~~Điểm C ⇩");
		C.NHAPDIEM();
	}
	
	public void INTAMGIAC() {
		System.out.print("~Điểm A :");
			A.INDIEM();
		System.out.println();
		System.out.print("~~Điểm B :");
			B.INDIEM();
		System.out.println();
		System.out.print("~~~Điểm C :");
			C.INDIEM();
	}
	
	public boolean KIEMTRA() {
		double AB = Math.sqrt(Math.pow(B.x-A.x, 2)+Math.pow(B.y-A.y, 2));
		double AC = Math.sqrt(Math.pow(C.x-A.x, 2)+Math.pow(C.y-A.y, 2));
		double BC = Math.sqrt(Math.pow(C.x-B.x, 2)+Math.pow(C.y-B.y, 2));
		
		return AB + AC > BC && AC + BC > AB && AB + BC > AC;
		}
	
		public double Chuvi() {
			double AB = Math.sqrt(Math.pow(B.x-A.x, 2)+Math.pow(B.y-A.y, 2));
			double AC = Math.sqrt(Math.pow(C.x-A.x, 2)+Math.pow(C.y-A.y, 2));
			double BC = Math.sqrt(Math.pow(C.x-B.x, 2)+Math.pow(C.y-B.y, 2));
			return AB + AC + BC;
		}
		
		public double Dientich() {
			double AB = Math.sqrt(Math.pow(B.x-A.x, 2)+Math.pow(B.y-A.y, 2));
			double AC = Math.sqrt(Math.pow(C.x-A.x, 2)+Math.pow(C.y-A.y, 2));
			return 0.5 * Math.abs(AB*AC);
		}
	}

	

