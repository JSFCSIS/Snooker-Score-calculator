import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class tab2 {
	
	private static JTextArea score;

	public static Component setButtons(){
		score = new JTextArea();
		GridLayout grid = new GridLayout(3, 3);
		Font font = new Font("Verdena", Font.BOLD, 9);
		score.setFont(font);
		
		JButton red = new JButton("Red");
		red.setBackground(Color.red);
		JButton yellow = new JButton("Yellow");
		yellow.setBackground(Color.yellow);
		JButton green = new JButton("Green");
		green.setBackground(Color.green);
		JButton brown = new JButton("Brown");
		brown.setBackground(Color.orange);
		JButton blue = new JButton("Blue");
		blue.setBackground(Color.blue);
		JButton pink = new JButton("Pink");
		pink.setBackground(Color.pink);
		JButton black = new JButton("Black");
		black.setBackground(Color.black);
		JButton reset = new JButton("Reset");
		
		red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				player2.addRed();
				updateScore();
				tab1.updateScore();
			}
			
		});
		
		yellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				player2.addYellow();
				updateScore();
			}
			
		});
		
		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				player2.addGreen();
				updateScore();
			}
			
		});
		
		brown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				player2.addBrown();
				updateScore();
			}
			
		});
		
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				player2.addBlue();
				updateScore();
			}
			
		});
		
		pink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				player2.addPink();
				updateScore();
			}
			
		});
		
		black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				player2.addBlack();
				updateScore();
			}
			
		});
		
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				if (player1.getScore() > player2.getScore()) JOptionPane.showMessageDialog(null, "Winner is player 1!");
				else if(player1.getScore() < player2.getScore()) JOptionPane.showMessageDialog(null, "Winner is player 2!");
				else JOptionPane.showMessageDialog(null, "Tie game!");
				player1.resetScore();
				player2.resetScore();
				updateScore();
				tab1.updateScore();
			}
			
		});

		
		JPanel panel = new JPanel();
		panel.add(score);
		panel.add(red);
		panel.add(yellow);
		panel.add(green);
		panel.add(brown);
		panel.add(blue);
		panel.add(pink);
		panel.add(black);
		panel.add(reset);
		panel.setLayout(grid);
		return panel;
		
	
	}
	
	public static void updateScore(){
		int max = ((15 - (player1.getRed() + player2.getRed())) * 8 + 27);
		
		score.setText("Score: " + player2.getScore() + player2.getColors()
				+ "\nMax: " + max);

	}

}
