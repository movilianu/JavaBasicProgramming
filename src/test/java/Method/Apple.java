package Method;

public class Apple {
    private String colour;

    public String rot(int rotTime, String rotColour) {
        while (rotTime > 0) {
            System.out.println("se strică...");
            --rotTime;
        }
        colour = rotColour;
        return "Mărul este stricat.";
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        String result = apple.rot(5, "maro");
        System.out.println(result);
    }
}
