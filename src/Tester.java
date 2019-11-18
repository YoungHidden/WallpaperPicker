import java.io.IOException;

import javax.swing.JOptionPane;

public class Tester {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		String input = JOptionPane.showInputDialog("Tipologia che si vuole cercare:");
		WallpaperPicker w = new WallpaperPicker(input);
		w.CercaImmagine();
		JOptionPane.showMessageDialog(null, "Operazione conclusa");
	}
}
