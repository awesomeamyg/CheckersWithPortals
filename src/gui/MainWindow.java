package gui;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainWindow extends JFrame{

   private static MainWindow self;
   private DrawingPanel panel;
   
   private MainWindow(){
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      setSize(300, 300);
      
      panel = new DrawingPanel();
      add(panel);
      
      self = this;
   }
   
   public static MainWindow getInstance(){
      if (self == null){
         self = new MainWindow();
      }
      return self;
   }
   
   public void displayWelcomeScreen(){
      panel.displayWelcomeScreen();
   }
}
