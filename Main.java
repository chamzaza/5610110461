package f2.spw;
import java.awt.*;
import javax.swing.*;

public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("Space War");
		GamePanel gp = new GamePanel();
		SpaceShip v = new SpaceShip(180, 550, 20, 20);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 650);
		frame.getContentPane().setLayout(new BorderLayout());
		GameEngine engine = new GameEngine(gp, v);
		engine.start();
		frame.add(gp);
		frame.setVisible(true);
	}
}
