package empty;

import io.vavr.Tuple;
import io.vavr.Tuple2;

public final class Functions { // 3rd: final class contains ALL static methods (HOF) using type classes instance
    public static <T> Tuple2<T, T> twoEntities (Empty<T> empty) {
        return Tuple.of(empty.empty(), empty.empty());
    }

    public static <T, U> Tuple2<T, U> twoEntitiesDifferent (Empty<T> empty1, Empty<U> empty2) {
        return Tuple.of(empty1.empty(), empty2.empty());
    }
}
