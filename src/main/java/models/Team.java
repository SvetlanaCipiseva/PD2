package models;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "team")
public class Team {
    @DatabaseField(id = true)
    public String id;

    @DatabaseField()
    public String name;

    @ForeignCollectionField(eager = true)
    ForeignCollection<Player> players;

    public Team() {
    }

    public Team(String name) {
        this.name = name;
        this.id = name;
    }

}
