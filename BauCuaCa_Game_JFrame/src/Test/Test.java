package Test;

import javax.swing.UIManager;

import View.BauCuaCaView;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		new BauCuaCaView();
		//Khi nhập sai , cho nhập lại
		// Không trượt cái nào nhưng vấn in tiền thua
	}
}
