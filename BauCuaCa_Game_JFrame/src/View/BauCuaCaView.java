package View;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.BauCuaModel;
import javax.swing.border.TitledBorder;

import Controller.BauCuaCaController;

import javax.swing.JButton;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Color;

public class BauCuaCaView extends JFrame {

	private JPanel contentPane;
	private BauCuaModel bauCuaModel;
	private JLabel jlabel_TienCuocBau;
	private JLabel jlabel_TienCuocCua;
	private JLabel jlabel_TienCuocTom;
	private JLabel jlabel_TienCuocCa;
	private JLabel jlabel_TienCuocGa;
	private JLabel jlabel_TienCuocNai;
	private JButton button_Bau;
	private int tongTienThang ;
	private int tongTienThua ;
	private JLabel jlabel_TaiKhoanNguoiChoi;
	private int soTien;
	private int soLanDatCuoc= 0;
	private int soLanXocDia = 0;
	private AmThanhGame amThanhGame = new AmThanhGame();
	private BauCuaCaController bauCuaCaController;
	private ArrayList<Integer> listDatCuoc = new ArrayList<>();
	
	Locale lc = new Locale("vi","VN");
	NumberFormat numd = NumberFormat.getCurrencyInstance(lc);//Đơn vị tiền tệ hiện tại
	public BauCuaCaView() {
		this.bauCuaModel = new BauCuaModel();
		this.bauCuaCaController = new BauCuaCaController();
		this.setTitle("Bầu Cua Cá");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.ORANGE);
		
		BauCuaCaController ac = new BauCuaCaController(this);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(99, 124, 621, 345);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.pink);
		
		ImageIcon iconBau = new ImageIcon(getClass().getResource("Bau.png"));
		button_Bau = new JButton("BẦU");
		button_Bau.setIcon(iconBau);
		button_Bau.setForeground(new Color(255, 255, 255));
		button_Bau.setFont(button_Bau.getFont().deriveFont(0f));
		button_Bau.setBounds(57, 47, 112, 66);
		panel.add(button_Bau);
		button_Bau.addActionListener(ac);
		
		ImageIcon iconCua = new ImageIcon(getClass().getResource("Cua.png"));
		JButton button_Cua = new JButton("CUA");
		button_Cua.setIcon(iconCua);
		button_Cua.setForeground(Color.WHITE);
		button_Cua.setFont(button_Cua.getFont().deriveFont(0f));
		button_Cua.setBounds(260, 47, 112, 66);
		panel.add(button_Cua);
		button_Cua.addActionListener(ac);
		
		ImageIcon iconTom = new ImageIcon(getClass().getResource("Tom.png"));
		JButton button_Tom = new JButton("TÔM");
		button_Tom.setIcon(iconTom);
		button_Tom.setForeground(Color.WHITE);
		button_Tom.setFont(new Font("Arial", Font.PLAIN, 0));
		button_Tom.setBounds(457, 47, 112, 66);
		panel.add(button_Tom);
		button_Tom.addActionListener(ac);
		
		ImageIcon iconCa = new ImageIcon(getClass().getResource("Ca.png"));
		JButton button_Ca = new JButton("CÁ");
		button_Ca.setIcon(iconCa);
		button_Ca.setForeground(Color.WHITE);
		button_Ca.setFont(new Font("Tahoma", Font.PLAIN, 0));
		button_Ca.setBounds(57, 195, 112, 66);
		panel.add(button_Ca);
		button_Ca.addActionListener(ac);
		
		ImageIcon iconGa = new ImageIcon(getClass().getResource("Ga.png"));
		JButton button_Ga = new JButton("GÀ");
		button_Ga.setIcon(iconGa);
		button_Ga.setForeground(Color.WHITE);
		button_Ga.setFont(button_Ga.getFont().deriveFont(0f));
		button_Ga.setBounds(260, 195, 112, 66);
		panel.add(button_Ga);
		button_Ga.addActionListener(ac);
		
		ImageIcon iconNai = new ImageIcon(getClass().getResource("Nai.png"));
		JButton button_Nai = new JButton("NAI");
		button_Nai.setIcon(iconNai);
		button_Nai.setForeground(Color.WHITE);
		button_Nai.setFont(new Font("Tahoma", Font.PLAIN, 0));
		button_Nai.setBounds(457, 195, 112, 66);
		panel.add(button_Nai);
		button_Nai.addActionListener(ac);
		
		jlabel_TienCuocBau = new JLabel("");
		jlabel_TienCuocBau.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jlabel_TienCuocBau.setBounds(57, 124, 112, 14);
		panel.add(jlabel_TienCuocBau);
		
		jlabel_TienCuocCua = new JLabel("");
		jlabel_TienCuocCua.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jlabel_TienCuocCua.setBounds(260, 125, 112, 14);
		panel.add(jlabel_TienCuocCua);
		
		jlabel_TienCuocTom = new JLabel("");
		jlabel_TienCuocTom.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jlabel_TienCuocTom.setBounds(457, 124, 112, 14);
		panel.add(jlabel_TienCuocTom);
		
		jlabel_TienCuocCa = new JLabel("");
		jlabel_TienCuocCa.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jlabel_TienCuocCa.setBounds(57, 280, 112, 14);
		panel.add(jlabel_TienCuocCa);
		
		jlabel_TienCuocGa = new JLabel("");
		jlabel_TienCuocGa.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jlabel_TienCuocGa.setBounds(260, 281, 112, 14);
		panel.add(jlabel_TienCuocGa);
		
		jlabel_TienCuocNai = new JLabel("");
		jlabel_TienCuocNai.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jlabel_TienCuocNai.setBounds(457, 281, 112, 14);
		panel.add(jlabel_TienCuocNai);
		
		Icon iconXocDia = new ImageIcon("C:\\FileHinhAnh\\XocDia.PNG");
		JButton button_XocDia = new JButton("XÓC ĐĨA");
		button_XocDia.setIcon(iconXocDia);
		button_XocDia.setForeground(Color.WHITE);
		button_XocDia.setFont(button_XocDia.getFont().deriveFont(0f));
		button_XocDia.setBounds(362, 480, 112, 70);
		contentPane.add(button_XocDia);
		button_XocDia.addActionListener(ac);
		
		JLabel label_TaiKhoanNguoiChoi = new JLabel("Tài Khoản Người Chơi");
		label_TaiKhoanNguoiChoi.setForeground(new Color(0, 128, 0));
		label_TaiKhoanNguoiChoi.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_TaiKhoanNguoiChoi.setBounds(425, 39, 195, 32);
		contentPane.add(label_TaiKhoanNguoiChoi);
		
		jlabel_TaiKhoanNguoiChoi = new JLabel("");
		jlabel_TaiKhoanNguoiChoi.setFont(new Font("Times New Roman", Font.BOLD, 18));
		jlabel_TaiKhoanNguoiChoi.setBounds(630, 30, 131, 50);
		contentPane.add(jlabel_TaiKhoanNguoiChoi);
		jlabel_TaiKhoanNguoiChoi.setText(numd.format(bauCuaModel.getTienCuoc()));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 51, 22);
		contentPane.add(menuBar);
		
		JMenu jMenu = new JMenu("Menu");
		jMenu.setForeground(new Color(0, 0, 0));
		jMenu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		menuBar.add(jMenu);
		
		JMenuItem menuItem_LamMoi = new JMenuItem("Làm Mới");
		menuItem_LamMoi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		menuItem_LamMoi.setForeground(new Color(0, 0, 0));
		jMenu.add(menuItem_LamMoi);
		
		JMenuItem menuItem_CongTien = new JMenuItem("Cộng Tiền");
		menuItem_CongTien.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jMenu.add(menuItem_CongTien);
		
		JLabel jlabel_ChuY = new JLabel("LƯU Ý : MỖI CỬA CHỈ ĐẶT CƯỢC 1 LẦN");
		jlabel_ChuY.setForeground(Color.RED);
		jlabel_ChuY.setFont(new Font("Times New Roman", Font.BOLD, 20));
		jlabel_ChuY.setBounds(99, 81, 398, 32);
		contentPane.add(jlabel_ChuY);
		
		Icon iconRefresh = new ImageIcon("C:\\FileHinhAnh\\Refresh.PNG");
		JButton button_LamMoi = new JButton("Làm Mới");
		button_LamMoi.setIcon(iconRefresh);
		button_LamMoi.setFont(button_LamMoi.getFont().deriveFont(0f));
		button_LamMoi.setBounds(99, 11, 118, 58);
		contentPane.add(button_LamMoi);
		button_LamMoi.addActionListener(ac);
		
		
		this.setVisible(true);
	}
	
	public void datCuoc(String xucXacChon) {
		 String tienCuoc = (String) JOptionPane.showInputDialog(this, "Nhập Số Tiền", "Đặt Cược", JOptionPane.PLAIN_MESSAGE);
		    soTien = 0;
		    try {
		        soTien = Integer.valueOf(tienCuoc);
		        if (soTien > bauCuaModel.getTienCuoc() || soTien <= 0) {
		            JOptionPane.showMessageDialog(this, "Nhập Sai Số Tiền", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		        	listDatCuoc.add(soTien);
		        	soLanDatCuoc++;
		            JOptionPane.showMessageDialog(this, "Bạn Vừa Đặt Cược: " + numd.format(soTien), "Đặt Cược", JOptionPane.INFORMATION_MESSAGE);
		            switch (xucXacChon) {
		                case "BẦU":
		                    jlabel_TienCuocBau.setText(numd.format(soTien));
		                    break;
		                case "CUA":
		                    jlabel_TienCuocCua.setText(numd.format(soTien));
		                    break;
		                case "TÔM":
		                    jlabel_TienCuocTom.setText(numd.format(soTien));
		                    break;
		                case "CÁ":
		                    jlabel_TienCuocCa.setText(numd.format(soTien));
		                    break;
		                case "GÀ":
		                    jlabel_TienCuocGa.setText(numd.format(soTien));
		                    break;
		                case "NAI":
		                    jlabel_TienCuocNai.setText(numd.format(soTien));
		                    break;
		            }
		            this.bauCuaModel.truTien(soTien);
		            this.jlabel_TaiKhoanNguoiChoi.setText(numd.format(bauCuaModel.getTienCuoc()));
		            this.bauCuaModel.xucXacChon(xucXacChon);
		        }
		    } catch (Exception e) {
		        JOptionPane.showMessageDialog(this, "Nhập Sai Số Tiền", "Error", JOptionPane.ERROR_MESSAGE);
		    }
	}
	
	
	public void xocDia() {
		if(soLanDatCuoc == 0) {
			JOptionPane.showMessageDialog(this, "Bạn Chưa Đặt Cược", "Thông Báo", JOptionPane.WARNING_MESSAGE);
		}
		else {
		amThanhGame.amThanhXocDia();
		String xucXac1 = this.bauCuaModel.ketquaXucXac1();
		String xucXac2 = this.bauCuaModel.ketquaXucXac2();
		String xucXac3 = this.bauCuaModel.ketquaXucXac3();
		for (String listXucXacChon1 : this.bauCuaModel.listXucXacChon) {
			if(xucXac1.equals(listXucXacChon1)) {
				this.bauCuaModel.congTien(soTien);
				amThanhGame.amThanhTien();
				tongTienThang += soTien*2;
				this.jlabel_TaiKhoanNguoiChoi.setText(numd.format(bauCuaModel.getTienCuoc()));
			}
		  }
			for (String listXucXacChon2 : this.bauCuaModel.listXucXacChon) {
			if(xucXac2.equals(listXucXacChon2)) {
				this.bauCuaModel.congTien(soTien);
				amThanhGame.amThanhTien();
				tongTienThang += soTien*2;
				this.jlabel_TaiKhoanNguoiChoi.setText(numd.format(bauCuaModel.getTienCuoc()));
			}
		  }
			for (String listXucXacChon3 : this.bauCuaModel.listXucXacChon) {
			if(xucXac3.equals(listXucXacChon3)) {
				this.bauCuaModel.congTien(soTien);
				amThanhGame.amThanhTien();
				tongTienThang += soTien*2;
				this.jlabel_TaiKhoanNguoiChoi.setText(numd.format(bauCuaModel.getTienCuoc()));
			}
			}
			for (String listXucXacChon : this.bauCuaModel.listXucXacChon) {
			if(!xucXac1.equals(listXucXacChon)
					&&!xucXac2.equals(listXucXacChon)
					&&!xucXac3.equals(listXucXacChon)) 
			{
				tongTienThua += soTien;
				amThanhGame.amThanhThua();
				this.jlabel_TaiKhoanNguoiChoi.setText(numd.format(bauCuaModel.getTienCuoc()));
			}
		}
		String a = numd.format(tongTienThang);
		String b = numd.format(tongTienThua);
		tongTienThang = 0;
		tongTienThua = 0;
		this.bauCuaModel.xucXacChonDelete();
		
		JOptionPane.showMessageDialog(this,"                          "+xucXac1+" "+ xucXac2+" "+xucXac3+"\n"
		+"Tiền Thắng: " + a +"\n"+"Tiền Thua: " + b, "KẾT QUẢ", JOptionPane.PLAIN_MESSAGE);
		
		}
		listDatCuoc.clear();
	}
	
	public void lamMoi() {
		this.jlabel_TienCuocBau.setText("");
		this.jlabel_TienCuocCua.setText("");
		this.jlabel_TienCuocTom.setText("");
		this.jlabel_TienCuocCa.setText("");
		this.jlabel_TienCuocGa.setText("");
		this.jlabel_TienCuocNai.setText("");
		for (Integer soTienHoanTra : listDatCuoc) {
			this.bauCuaModel.congTienKhiLamMoi(soTienHoanTra);
		}
		this.jlabel_TaiKhoanNguoiChoi.setText(numd.format(bauCuaModel.getTienCuoc()));
		soLanDatCuoc = 0;
	}
}

