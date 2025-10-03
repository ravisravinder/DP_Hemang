package BEHAVIORAL.observer;

public class ScoreFan implements Fan{
    private String name;
    ScoreFan(String name){
        this.name = name;
    }

    @Override
    public void update(int score, int wickets, float overs) {
        System.out.println(name +" got update: score = "+score);
    }
}
