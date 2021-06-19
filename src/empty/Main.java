package empty;

public class Main {
    public static void main(String[] args) {
        var xAndY = Functions.twoEntities(Empty.emptyInt());
        System.out.println("{" + xAndY._1 + ", " + xAndY._2 + "}");

        var intString = Functions.twoEntitiesDifferent(Empty.emptyInt(), Empty.emptyString());
        System.out.println("{" + intString._1 + ", " + intString._2 + "}");

    }
}
