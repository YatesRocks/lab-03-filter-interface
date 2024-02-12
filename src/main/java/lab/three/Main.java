package lab.three;

import java.awt.*;
import java.io.IOException;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        /* Part One
        try {
            ShortLister.run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */
        Vector<Rectangle> vec = new Vector<>();
        for (int i = 0; i < 10; i++)
            vec.add(new Rectangle(i, 1));
        BigRectLister filter = new BigRectLister();
        vec.stream().filter(filter::accept).toList().forEach(System.out::println);
    }
}