package az.ingress.lesson15;

public class Tree {

    public String type;
    public float height;

    public Tree(String newType, float newHeight) {
        type = newType;
        height = newHeight;
    }

    public Tree(String newType) {
        this(newType, 1.0F);
    }

    public Tree(float newHeight) {
        this("Pine", newHeight);
        System.out.println(height);
    }

    public Tree() {
        this("Pine", 1.0F);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "type='" + type + '\'' +
                ", height=" + height +
                '}';
    }

}
