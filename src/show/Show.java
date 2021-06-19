package show;

import io.vavr.Tuple2;

public interface Show<A> {
    String show(A a);

    static <X, Y> Show<Tuple2<X, Y>> showTuple() {
        return tuple -> "{" + tuple._1 + ", " + tuple._2 + "}";
    }
}
