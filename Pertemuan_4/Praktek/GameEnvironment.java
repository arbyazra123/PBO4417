import java.util.ArrayList;

public class GameEnvironment {
    // field
    private double width;
    private double height;
    private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>();
    private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>(); 
    
// cnstktr
    GameEnvironment(){
    }
    public GameEnvironment(double newWidth, double newHight){
        this.width = newWidth;
        this.height = newHight;
    }
    
    // method Player
    public void addPlayer(GamePlayer player){
        arrPlayer.add(player);
    }
    public void removePlayer(GamePlayer player){
        arrPlayer.remove(player);
    }
    public void getAllPlayer(){
        for (int i=0; i < arrPlayer.size(); i++){
            System.out.println("All Player : "+arrPlayer);
        }
    }
    
    // method Player
    public void addEnemy(GameEnemy enemy){
        arrEnemy.add(enemy);
    }
    public void removeEnemy(GameEnemy enemy){
        arrEnemy.remove(enemy);
    }
    public void getAllEnemies(){
        for(int j=0; j < arrEnemy.size(); j++){
            System.out.println("All Enemy : "+arrEnemy.get(j));
        }
    }
    public void Interaction(){
        if(arrPlayer == null || arrEnemy == null){
            System.out.println("Player or Enemy not sets");
        }
        for(int i=0; i < arrPlayer.size(); i++){
            for(int j=0; j<arrEnemy.size(); j++){
                if(arrPlayer.get(i).getY() != arrEnemy.get(j).getY()){
                    System.out.println("Player : " + arrPlayer.get(i) + " and Enemy : "+ arrPlayer.get(j) +" not in the same Y position");
                }
                if(EuclideanDistance(arrPlayer.get(i).getX(),arrPlayer.get(i).getY(),arrEnemy.get(j).getX(),arrEnemy.get(j).getY()) <2){
                    System.out.println("Player : "+ arrPlayer.get(i)+ " Attacked");
                    System.out.println("Enemy  : "+ arrEnemy.get(j)+ " Loses");
                    removeEnemy(arrEnemy.get(j));
                }
                else{
                    System.out.println("=> Player "+ arrPlayer.get(i));
                    arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
                    System.out.println("Current x position = "+ arrPlayer.get(i).getX() + " <==");
                }
            }
        }
    }

    public static int EuclideanDistance(int x1, int y1, int x2, int y2) {
        int result = (int) Math.sqrt((y1 - x2) * 2 + (y2 - x2) * 2);
        return result;
    }
   
    
    
    
    
    
    
    
}
