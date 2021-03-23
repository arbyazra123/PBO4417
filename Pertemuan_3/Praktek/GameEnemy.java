public class GameEnemy {
    private double width;
    private double height;
    private int positionX;
    private int positionY;

    GameEnemy(){};
    GameEnemy(double width, double height){
        this.width = width;
        this.height = height;
    };
    GameEnemy(double width, double height,int positionX,int positionY){
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    };

    public void setDimension(double width,double height){
        this.width = width;
        this.height = height;
    };

    public void setPosition(int positionX,int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    };

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public double getX(){
        return this.positionX;
    }
    
    public double getY(){
        return this.positionY;
    }

    public void Run(){
        System.out.println("Enemy is running, chochoo!");
    };
}
