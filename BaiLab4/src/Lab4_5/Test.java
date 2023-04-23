package Lab4_5;

public class Test {
	public static void main(String[] args) {

		GVThinhGiang gvtg1 = new GVThinhGiang(null, null, null, 0, 0);
		System.out.println("----------------");
		System.out.println("*** Giảng Viên Thỉnh Giảng *** ");
		gvtg1.Nhap();
		System.out.println("---------------------");
		System.out.println("*** Kết quả *** ");
		gvtg1.In();

		GVCoHuu gvch1 = new GVCoHuu(null, null, null, 0, 0, 0);
		System.out.println("----------------");
		System.out.println("*** Giảng Viên Cố Hữu *** ");
		gvch1.Nhap();
		System.out.println("---------------------");
		System.out.println("*** Kết quả *** ");
		gvch1.In();
		
		System.out.println();
		System.out.println("-------- OUT ----------");
		
	}
}
