package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "match_referee")
public class MatchReferee {
    @DatabaseField(id = true)
    public String id;

    @DatabaseField()
    public String referee_type;

    @DatabaseField(foreign = true)
    public Match match;

    @DatabaseField(foreign = true)
    public Referee referee;

    public MatchReferee() {
    }

    public MatchReferee(Match match, Referee referee, String referee_type) {
        this.match = match;
        this.referee = referee;
        this.referee_type = referee_type;
        this.id = match.id + "|" + referee.id + "|" + referee_type;
    }
}
