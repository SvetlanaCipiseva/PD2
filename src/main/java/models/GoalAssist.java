package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable()
public class GoalAssist {
    @DatabaseField(id = true)
    public String id;

    @DatabaseField(foreign = true)
    public Goal goal;

    @DatabaseField(foreign = true)
    public Player assistingPlayer;

    public GoalAssist() {
    }

    public GoalAssist(Goal goal, Player assistingPlayer) {
        this.goal = goal;
        this.assistingPlayer = assistingPlayer;
        this.id = goal.id + "|" + assistingPlayer.id;
    }
}
