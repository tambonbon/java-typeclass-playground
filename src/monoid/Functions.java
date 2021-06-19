package monoid;

import java.util.List;

public final class Functions {

    public static int sumInts(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }

    public static String concatStrings(List<String> string) {
        return string.stream().reduce("", String::concat);
    }

    // keep in mind that Monoid type class extends Empty type class && adds combine()
    public static <T> T combineAll(List<T> list, Monoid<T> monoid) {
        return list.stream().reduce(monoid.empty(), monoid::combine);
    }
}
