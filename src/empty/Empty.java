package empty;

public interface Empty<A> {

    A empty(); // 1st: define an interface

    static Empty<Integer> emptyInt() {
        return new EmptyImpl().new EmptyInt(); // 2.5nd: define a static factory method in type class
    }

    /* If Empty is an Functional Interface ...
    * ... we can use anonymous impl, and not create EmptyImpl file:
    *
    * static Empty<Integer> emptyInt(){
    *     return () -> 0;
    * }*/

    static Empty<String> emptyString() {
        return new EmptyImpl().new EmptyString();
    }
}
