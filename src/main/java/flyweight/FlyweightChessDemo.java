package flyweight;

public class FlyweightChessDemo {
    public static void main(String[] args) {
        ChessPieceFactory factory = new ChessPieceFactory();
        factory.getPiece("Pawn").display(1,2);
        factory.getPiece("Pawn").display(2,2);
        factory.getPiece("Rook").display(1,1);
    }
}
