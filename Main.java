package f2.spw;
import java.awt.*;
import javax.swing.*;

public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("Space War");
		GamePanel gp = new GamePanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 650);
		frame.getContentPane().setLayout(new BorderLayout());
		gp.setBackground(Color.BLACK);
		frame.add(gp);
		frame.setVisible(true);
	}
}
