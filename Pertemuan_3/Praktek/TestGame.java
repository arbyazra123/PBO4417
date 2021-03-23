
public class TestGame {
    public static void main(String[] args){
        GamePlayer player = new GamePlayer(15,15,0,0);
        GameEnemy enemy = new GameEnemy(15,15,100,0);

        player.Run();
        player.Run(10);
        enemy.Run();
        player.Run(40);
    }
}
