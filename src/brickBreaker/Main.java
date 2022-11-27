package brickBreaker;

import java.awt.Color;

import javax.swing.JFrame;

//main Jframe code to open game window.. means game starts here.

public class Main {
	public static void main(String[] args) {
		JFrame obj=new JFrame();
		GamePlay gamePlay = new GamePlay();
		
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Master");		
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
                obj.setVisible(true);
		
	}

}
