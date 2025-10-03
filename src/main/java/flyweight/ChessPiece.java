package flyweight;

public class ChessPiece {
    private String type;
    public ChessPiece(String type) { this.type = type; }
    public void display(int x, int y) {
        System.out.println(type + " at (" + x + "," + y + ")");
    }
}
