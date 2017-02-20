package ejerciciopoo;
import ch.aplu.turtle.Turtle;

/**
 * Created by lotalorafox on 2/20/2017.
 */
public class figure {
    private  Turtle tortuga;

    public figure(){
        tortuga =  new Turtle();
    }

    public void square(double a, double b, int c, int d){
        tortuga.setX(a);
        tortuga.setY(b);
        for(int i=0 ;i<2;i++){
            tortuga.right(90);
            tortuga.fd(c);
            tortuga.right(90);
            tortuga.fd(d);
        }
    }

    public void triangle(double a, double b,int c){
        tortuga.setX(a);
        tortuga.setY(b);
        //triangle
        tortuga.right(30);
        tortuga.fd(c);
        tortuga.right(120);
        tortuga.fd(c);
        tortuga.right(120);
        tortuga.fd(c);
    }

    public void circle(double a, double b,double c){
        tortuga.setX(a);
        tortuga.setY(b);
        for(int i=0;i<360;i++){
            tortuga.right(1);
            tortuga.fd(c);
        }
    }
}
