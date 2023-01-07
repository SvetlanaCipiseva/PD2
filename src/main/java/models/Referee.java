package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "referee")
public class Referee {
    @DatabaseField(id = true)
    public String id;
    @DatabaseField()
    public String name;

    @DatabaseField()
    public String surname;

    public Referee() {
    }

    public Referee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = name + "|" + surname;
    }
}
