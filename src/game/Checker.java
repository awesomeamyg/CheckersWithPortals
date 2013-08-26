package game;

public class Checker extends GamePiece{
   public boolean is_alive;
   public Player owner;

   public Checker(Player p){
      is_alive = true;
      owner = p;
   }
   
   public void kill (){
      is_alive = false;
   }
   
   public Player getPlayer(){
      return owner;
   }
   
   public boolean isAlive(){
      return is_alive;
   }
}
