package game;

import gui.MainWindow;

public class Main {
   public static void main (String[] args) {
      MainWindow window = MainWindow.getInstance();

      window.displayWelcomeScreen();
   }
}
