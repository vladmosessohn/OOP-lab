package task3;

public class Polygon {
    Point[] varfuri;
    Polygon(int n){
       varfuri = new Point[n];
    }
    Polygon(float[] v){
        this(v.length/2);

        for(int i = 0; i < varfuri.length; i = i + 2){
            Point punct = new Point(v[i],v[i+1]);
            varfuri[i/2] = punct;
        }
    }
    void ShowPoligon(){
        for(int i = 0; i < varfuri.length; i++)
            System.out.println("("+varfuri[i].x+","+varfuri[i].y+")");
    }
}
