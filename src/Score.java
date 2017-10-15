import javax.swing.*;
import java.awt.*;

public class Score{
 
	public static void main(String[] args){
		
	// just testing changes in Git
		
	  JFrame frame = new JFrame("Snooker Score");
	  frame.setResizable(false);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  JTabbedPane tab = new JTabbedPane();
	  frame.add(tab, BorderLayout.CENTER);
	  
	  tab.add("Player 1", tab1.setButtons());
	  tab.add("Player 2", tab2.setButtons());
	   
	  frame.setSize(720/3,1280/3);
	  frame.setVisible(true);
	  
	  tab1.updateScore();
	  tab2.updateScore();
  }
}