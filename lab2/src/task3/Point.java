package task3;

public class Point {
    float x;
    float y;
    Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    void ChangeCoords(float x, float y){
        this.x = x;
        this.y = y;
    }
    void PrintCoords(){
        System.out.println("("+x+","+y+")");
    }
}
