package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "match")
public class Match {
    @DatabaseField(id = true)
    public String id;

    @DatabaseField()
    public String date;

    @DatabaseField()
    public int viewers;

    @DatabaseField()
    public String location;


    public Match() {
    }

    public Match(String date, String location, String homeTeam, String awayTeam) {
        this.date = date;
        this.location = location;
        this.id = date + "|" + location + "|" + homeTeam + "|" + awayTeam;
    }
}
