package BEHAVIORAL.observer;

public class WicketFan implements Fan {
    private String name;

    WicketFan(String name) {
        this.name = name;
    }

    @Override
    public void update(int score, int wickets, float overs) {
        System.out.println(name + " got update: Wickets = " + wickets);
    }
}
