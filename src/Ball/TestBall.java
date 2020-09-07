package Ball;

import java.lang.*;
public class TestBall {
    public static void main (String [] args) {
        Ball d1 = new Ball ("Red", 288);
        Ball d2 = new Ball ("White",747);
        Ball d3 = new Ball ("Blue");
        d3.setSize(1);
//System.out.println(d1);
        d1.Out();
        d2.Out();
        d3.Out();
    }
}