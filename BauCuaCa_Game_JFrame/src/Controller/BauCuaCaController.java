package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import View.BauCuaCaView;

public class BauCuaCaController implements ActionListener {
	private BauCuaCaView bauCuaCaView;
	private boolean BAUButtonClicked = false;
	private boolean CUAButtonClicked = false;
	private boolean TOMButtonClicked = false;
	private boolean CAButtonClicked = false;
	private boolean GAButtonClicked = false;
	private boolean NAIButtonClicked = false;
	//private Map<String, Boolean> listDatCuoc = new HashMap<>();
	//boolean values = false;
	
	public BauCuaCaController() {
		
	}
	
	public BauCuaCaController (BauCuaCaView bauCuaCaView) {
		this.bauCuaCaView = bauCuaCaView;
		/*
		listDatCuoc.put("BẦU", BAUButtonClicked);
		listDatCuoc.put("CUA", CUAButtonClicked);
		listDatCuoc.put("TÔM", TOMButtonClicked);
		listDatCuoc.put("CÁ", CAButtonClicked);
		listDatCuoc.put("GÀ", GAButtonClicked);
		listDatCuoc.put("NAI", NAIButtonClicked);
		*/

	}
	

	public void actionPerformed(ActionEvent e) {
		
		String src = e.getActionCommand();	
		/*
		boolean value = listDatCuoc.get(src);
		if (value != true && !value) { // Kiểm tra giá trị và trạng thái đã nhấn của nút
	        this.bauCuaCaView.datCuoc(src);
	        listDatCuoc.put(src, true); // Cập nhật trạng thái đã nhấn của nút
	    }
		else {
			JOptionPane.showMessageDialog(bauCuaCaView, "Bạn Đã Cược Rồi", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
		}
		*/
		
		
            // Trả về chuỗi văn bản hiển thị trên nút button
            if (src.equals("BẦU")) {
            	if(!BAUButtonClicked) {
            		this.bauCuaCaView.datCuoc(src);
            		BAUButtonClicked = true;
            	}
            	else 
            	JOptionPane.showMessageDialog(bauCuaCaView, "Bạn Đã Cược Rồi", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                
            } else if (src.equals("CUA")) {
            	if(!CUAButtonClicked) {
            		this.bauCuaCaView.datCuoc(src);
            		CUAButtonClicked = true;
            	}
            	else 
            	JOptionPane.showMessageDialog(bauCuaCaView, "Bạn Đã Cược Rồi", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
            else if (src.equals("TÔM")) {
            	if(!TOMButtonClicked) {
            		this.bauCuaCaView.datCuoc(src);
            		TOMButtonClicked = true;
            	}
            	else 
            	JOptionPane.showMessageDialog(bauCuaCaView, "Bạn Đã Cược Rồi", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
            else if (src.equals("CÁ")) {
            	if(!CAButtonClicked) {
            		this.bauCuaCaView.datCuoc(src);
            		CAButtonClicked = true;
            	}
            	else 
            	JOptionPane.showMessageDialog(bauCuaCaView, "Bạn Đã Cược Rồi", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
            else if (src.equals("GÀ")) {
            	if(!GAButtonClicked) {
            		this.bauCuaCaView.datCuoc(src);
            		GAButtonClicked = true;
            	}
            	else 
            	JOptionPane.showMessageDialog(bauCuaCaView, "Bạn Đã Cược Rồi", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
            else if (src.equals("NAI")) {
            	if(!NAIButtonClicked) {
            		this.bauCuaCaView.datCuoc(src);
            		NAIButtonClicked = true;
            	}
            	else 
            	JOptionPane.showMessageDialog(bauCuaCaView, "Bạn Đã Cược Rồi", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
            
           if(src.equals("XÓC ĐĨA")) {
            	this.bauCuaCaView.xocDia();
            	this.bauCuaCaView.lamMoi();
            	this.lamMoiButton();
            }
            else if(src.equals("Làm Mới")) {
            	this.bauCuaCaView.lamMoi();
            	lamMoiButton();
            }
     
        }
		public void lamMoiButton() {
			BAUButtonClicked = false;
        	CUAButtonClicked = false;
        	TOMButtonClicked = false;
        	CAButtonClicked = false;
        	GAButtonClicked = false;
        	NAIButtonClicked = false;
		}
	
	}


	

	
	
	

