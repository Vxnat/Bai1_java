package Bai3_2;

public class main {
	public static void main(String[] args) {
		//Tam Giác là Tác Giam ..... Thank You
		
		TAMGIAC tamgiac1 = new TAMGIAC(0,0);
		System.out.println("✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️");
		System.out.println("TAM GIÁC ▲ ");
		tamgiac1.NHAPTAMGIAC();
		tamgiac1.INTAMGIAC();
		System.out.println();
		System.out.println("---------------------");
		System.out.println("Kết Quả 👌 ");
		if(tamgiac1.KIEMTRA() == true) {
			System.out.println("~Có phải TAM GIÁC 👉 " + tamgiac1.KIEMTRA());
			System.out.println("~~Chu vi TAM GIÁC 👉 " + tamgiac1.Chuvi());
			System.out.println("~~~Diện tích TAM GIÁC 👉 " + tamgiac1.Dientich());
		}
		else System.out.println("~Có phải TAM GIÁC 👉 " + tamgiac1.KIEMTRA());
			System.out.println("---------------------");
		
		//Hình Tròn 
		System.out.println("Hình tròn ⚫ ");
		HINHTRON hinhtron1 = new HINHTRON(0, 0);
		hinhtron1.NhapDT();
		hinhtron1.InDT();
		System.out.println();
		System.out.println("Kết Quả 👌 ");
		System.out.println("*Chu vi HÌNH TRÒN 👉 " + hinhtron1.Chuvi());
		System.out.println("**Diện tích HÌNH TRÒN 👉 " + hinhtron1.DienTich());
		System.out.println("🥱🥱🥱🥱🥱🥱🥱🥱🥱🥱🥱🥱🥱🥱🥱🥱🥱🥱🥱");
	}
}
