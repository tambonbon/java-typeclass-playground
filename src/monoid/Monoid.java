package monoid;

import empty.Empty;
import empty.EmptyImpl;

public interface Monoid<A> extends Empty<A> {

    A combine(A x, A y);

    static Monoid<Integer> intAdditionMonoid() {
        return new Monoid<Integer>() {
            @Override
            public Integer combine(Integer x, Integer y) {
                return x + y;
            }

            @Override
            public Integer empty() {
                return Empty.emptyInt().empty();
            }
        };
    }

    static Monoid<String> stringAdditionMonoid() {
        return new Monoid<String>() {
            @Override
            public String combine(String x, String y) {
                return x + y;
            }

            @Override
            public String empty() {
                return Empty.emptyString().empty();
            }
        };
    }
}
