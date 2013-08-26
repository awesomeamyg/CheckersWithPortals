package gui;

import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawingPanel extends JPanel{
   private final int WELCOMESTATE = 1;
   
   private int state;
   
   public DrawingPanel(){}
   
   public void displayWelcomeScreen() {
      state = WELCOMESTATE;
      repaint();
   }

   public void paint (Graphics g){
      if (state == WELCOMESTATE){
         g.drawString("Welcome", 20, 20);
      }
   }
}
