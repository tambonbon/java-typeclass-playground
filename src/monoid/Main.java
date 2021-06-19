package monoid;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var ints = List.of(1,2,3);
        System.out.println(Functions.combineAll(ints, Monoid.intAdditionMonoid()));

        var strings = List.of("hello", " hi there", " call me Tammy");
        System.out.println(Functions.concatStrings(strings));
    }
}
