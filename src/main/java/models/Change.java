package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "change")
public class Change {
    @DatabaseField(id = true)
    public String id;

    @DatabaseField(foreign = true)
    public Match match;

    @DatabaseField(foreign = true)
    public Team team;

    @DatabaseField(foreign = true)
    public Player outgoingPlayer;

    @DatabaseField(foreign = true)
    public Player incomingPlayer;

    @DatabaseField()
    public String time;

    public Change() {
    }

    public Change(Match match, Team team, String time, Player outgoing, Player incoming) {
        this.match = match;
        this.team = team;
        this.time = time;
        this.incomingPlayer = incoming;
        this.outgoingPlayer = outgoing;
        this.id = match.id + "|" + team.id + "|" + time + "|" + outgoing.id + "|" + incoming.id;
    }
}
