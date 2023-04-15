package BaiLab3_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<HangHoa> dsHH = new ArrayList<HangHoa>();
		int luaChon =0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("🎊-----------------------🎊");
			System.out.println("🌟WELCOME TO MY OBJECT. WHAT WILL YOU DISCOVER TODAY?🌟");
			System.out.println("👨🏻‍💻👩🏻‍💻 👨🏻‍💻👩🏻‍💻 👨🏻‍💻👩🏻‍💻 👨🏻‍💻👩🏻‍💻 ");
			System.out.println(
					  "1.Nhập Hàng Điện Máy 💻  \n"
					+ "2.Nhập Hàng Sành Sứ 🍽 \n"
					+ "3.Nhập Hàng Thực Phẩm 🍕 \n"
					+ "4.In Ra Tất Cả 🖨\n"
					+ "5.Làm Rỗng Danh Sách 🚫 \n"
					+ "6.Kiểm Tra Số Lượng 💾 \n"
					+ "0.Thoát ⚠ \n");
			System.out.println("🤔 Lựa Chọn Của Bạn 	: ");
			luaChon = sc.nextInt();
			sc.nextLine();
			switch (luaChon) {
			case 1: {
				HangDienMay hdm1 = new HangDienMay(null, null, null, luaChon, null, luaChon, luaChon);
                hdm1.Nhap();
                dsHH.add(hdm1);
                break;
			}
			case 2: {
				HangSanhSu hss1 = new HangSanhSu(null, null, null, 0, null);
				hss1.Nhap();
				dsHH.add(hss1);
				break;
			}
			case 3: {
				HangThucPham htp1 = new HangThucPham(null, null, null, 0, null, null);
				htp1.Nhap();
				dsHH.add(htp1);
				break;
			}
			case 4: {
				if(dsHH.size() == 0) {
					System.out.println("Danh Sách Rỗng 🚫");
				}
				else {
					 for (HangHoa hangHoa : dsHH) {
							System.out.println(hangHoa);
							System.out.println();
						}
				}
				break;
			}
				
			case 5:{	
					dsHH.removeAll(dsHH);
					System.out.println("Đã làm rỗng 🚫");
					break;
			}
			case 6:{
				System.out.println("🔢 Số Lượng Trong Danh Sách : " + dsHH.size());
				break;
			}
			default:
				System.out.println("GOODBYE FOR NOW ! BUT NOT FOREVER 🐶 ");
				break;
			}
		
		}while(luaChon !=0);
		
		
}
}
