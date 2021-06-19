package show;

import empty.Empty;
import io.vavr.Tuple2;

public class Main {
    public static void main(String[] args) {
        var xAndY = empty.Functions.twoEntities(Empty.emptyInt());
        System.out.println(Functions.show(xAndY, Show.showTuple()));
        System.out.println(Functions.show(xAndY, Tuple2::toString));
    }
}
