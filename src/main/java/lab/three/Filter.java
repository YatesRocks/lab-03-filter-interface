package lab.three;

public interface Filter {
    boolean accept(Object x);

    Object[] collectAll(Object[] arr);
}
