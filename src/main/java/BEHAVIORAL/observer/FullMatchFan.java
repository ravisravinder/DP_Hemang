package BEHAVIORAL.observer;

public class FullMatchFan implements Fan {
    private String name;

    FullMatchFan(String name) {
        this.name = name;
    }

    @Override
    public void update(int score, int wickets, float overs) {
        System.out.println(name + " got full update: Score=" + score + "/" + wickets + " in " + overs + " overs");
    }
}
