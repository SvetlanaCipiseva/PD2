package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "penalty_card")
public class PenaltyCard {
    @DatabaseField(id = true)
    public String id;

    @DatabaseField(foreign = true)
    public Match match;

    @DatabaseField(foreign = true)
    public Team team;

    @DatabaseField(foreign = true)
    public Player player;

    @DatabaseField()
    public String time;

    public PenaltyCard() {
    }

    public PenaltyCard(Match match, Team team, Player player, String time) {
        this.match = match;
        this.team = team;
        this.player = player;
        this.time = time;
        this.id = match.id + "|" + player.id + "|" + time;
    }
}
