package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "player")
public class Player {
    @DatabaseField(id = true)
    public String id;

    @DatabaseField()
    public Integer nr;

    @DatabaseField()
    public String name;

    @DatabaseField()
    public String surname;

    @DatabaseField()
    public String role;

    @DatabaseField(foreign = true)
    public Team team;

    public Player() {
    }

    public Player(Integer nr, String name, String surname, String role, Team team) {
        this.nr = nr;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.team = team;
        this.id = team.id + "|" + name + "|" + surname;
    }
}
