package lab.three;

import java.awt.*;

public class BigRectLister implements Filter {
    @Override
    public boolean accept(Object x) {
        Rectangle rect = (Rectangle) x;
        return Math.pow((rect.width + rect.height), 2.) > 10;
    }

    @Override
    public Object[] collectAll(Object[] os) {
        // yada yada memory issues yada yada oh well
        Object[] res = new Object[os.length];
        int i = 0;
        for (Object o : os) {
            if (accept(o))
                res[i] = o;
            i++;
        }
        return res;
    }
}
