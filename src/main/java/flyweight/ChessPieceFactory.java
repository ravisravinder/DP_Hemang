package flyweight;

import java.util.HashMap;

public class ChessPieceFactory {
    private HashMap<String,ChessPiece> pieces = new HashMap<>();
    public ChessPiece getPiece(String type){
        pieces.putIfAbsent(type,new ChessPiece(type));
        return pieces.get(type);
    }
}
