import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try 
				{
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
					window.frame.setTitle("WallpaperPicker");
					window.frame.setResizable(false);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 260, 240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JFormattedTextField TextBox = new JFormattedTextField();
		TextBox.setText("");
		TextBox.setBounds(47, 90, 147, 20);
		frame.getContentPane().add(TextBox);
		
		JLabel Label = new JLabel("Inserisci cosa cercare");
		Label.setBounds(67, 49, 177, 14);
		frame.getContentPane().add(Label);
		
		JButton Button = new JButton("Imposta");
		Button.setBounds(78, 127, 89, 23);
		frame.getContentPane().add(Button);
		Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String cerca = TextBox.getText();
				try 
				{
					WallpaperPicker w = new WallpaperPicker(cerca);
					w.CercaImmagine();
				} 
				catch (InterruptedException e1) 
				{
					e1.printStackTrace();
				} 
				catch (IOException e1)
				{
					
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "Operazione conclusa");
				
			}
		});
	}
}
