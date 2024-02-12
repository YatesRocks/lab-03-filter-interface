package lab.three;

public class ShortWordFilter implements Filter {
    public boolean accept(Object o) {
        return o.toString().length() < 5;
    }

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
