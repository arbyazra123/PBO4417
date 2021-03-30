
public class TestGame {
    public static void main(String[] args){

        GamePlayer p2 = new GamePlayer();
        p2.setDimension(12, 32);
        p2.setPosition(10, 10);

        GamePlayer p1 = new GamePlayer();
        p1.setDimension(12, 12);
        p1.setPosition(10, 220);
        System.out.println("Player Position: "+p1.getX()+","+p1.getY());
        p1.Run(12);
        System.out.println("Player Position: "+p1.getX()+","+p1.getY());

        
        GameEnemy enemy = new GameEnemy();
        enemy.setDimension(12, 32);
        enemy.setPosition(10, 10);      
        
        GameEnvironment scene = new GameEnvironment();
        scene.addPlayer(p1);
        scene.addPlayer(p1);
        scene.addPlayer(p2);
        scene.getAllPlayer();
        scene.removePlayer(p1);
        scene.getAllEnemies();
        scene.addEnemy(enemy);
        scene.Interaction();
    }
}
