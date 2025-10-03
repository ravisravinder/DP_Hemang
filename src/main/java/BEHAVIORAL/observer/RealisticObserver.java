package BEHAVIORAL.observer;

public class RealisticObserver {
    public static void main(String[] args) {
        ScoreBoard board = new ScoreBoard();

        Fan f1 = new ScoreFan("Ravi");
        Fan f2 = new WicketFan("Sita");
        Fan f3 = new FullMatchFan("Arjun");

        board.addFan(f1);
        board.addFan(f2);
        board.addFan(f3);

        // Match updates
        board.updateMatch(45, 1, 6.2f);
        board.updateMatch(120, 3, 20.0f);
    }
}
