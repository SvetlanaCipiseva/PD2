package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "goal")
public class Goal {
    @DatabaseField(id = true)
    public String id;

    @DatabaseField(foreign = true)
    public Match match;

    @DatabaseField(foreign = true)
    public Team team;

    @DatabaseField(foreign = true)
    public Player scorer;

    @DatabaseField()
    public String time;

    @DatabaseField()
    public String goalType;

    public Goal() {
    }

    public Goal(Match match, Team team, Player scorer, String time, String goalType) {
        this.match = match;
        this.team = team;
        this.scorer = scorer;
        this.time = time;
        this.goalType = goalType;
    }
}
