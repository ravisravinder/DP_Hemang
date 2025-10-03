package BEHAVIORAL.observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard {
    private List<Fan> fanList = new ArrayList();
    private int score;
    private int wickets;
    private float overs;

    void addFan(Fan fan){
        fanList.add(fan);
    }

    void removeFan(Fan fan){
        fanList.remove(fan);
    }

    void updateMatch(int score,int wickets, float overs){
        this.score= score;
        this.wickets= wickets;
        this.overs=overs;
        notifyFans();
    }

    private void notifyFans(){
        for(Fan f: fanList){
            f.update(score,wickets,overs);
        }
    }
}
