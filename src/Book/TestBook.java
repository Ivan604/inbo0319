package Book;

import java.lang.*;
public class TestBook{
    public static void main (String [] args) {
        Book d1 = new Book ("Drama", 288);
        Book d2 = new Book ("Horror",747);
        Book d3 = new Book ("Comedy");
        d3.setPages(288);
        System.out.println(d1);
        d1.Out();
        d2.Out();
        d3.Out();
    }
}
