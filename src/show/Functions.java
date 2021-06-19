package show;

public final class Functions {
    static <A> String show(A a, Show<A> sh) {
        return sh.show(a);
    }
}
