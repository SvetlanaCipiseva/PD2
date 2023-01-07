package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "match_team_starting_player")
public class MatchTeamStartingPlayer {
    @DatabaseField(id = true)
    public String id;

    @DatabaseField(foreign = true)
    public Match match;

    @DatabaseField(foreign = true)
    public Team team;

    @DatabaseField(foreign = true)
    public Player player;

    public MatchTeamStartingPlayer() {

    }

    public MatchTeamStartingPlayer(Match match, Team team, Player player) {
        this.id = match.id + "|" + team.id + "|" + player.id;
        this.match = match;
        this.team = team;
        this.player = player;
    }
}
