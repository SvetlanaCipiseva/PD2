import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import models.*;

import java.sql.SQLException;

public class DatabaseAdapter {
    private final String driverName = "org.sqlite.JDBC";
    private final String connectionString = "jdbc:sqlite:sample.db";
    private ConnectionSource connectionSource;

    private Dao<Change, String> changeDao;
    private Dao<Goal, String> goalDao;
    private Dao<GoalAssist, String> goalAssistDao;
    private Dao<Match, String> matchDao;
    private Dao<MatchReferee, String> matchRefereeDao;
    private Dao<MatchTeamStartingPlayer, String> matchTeamStartingPlayerDao;
    private Dao<PenaltyCard, String> penaltyCardDao;
    private Dao<Player, String> playerDao;
    private Dao<Referee, String> refereeDao;
    private Dao<Team, String> teamDao;

    public DatabaseAdapter() throws SQLException {
        this.connectionSource = new JdbcConnectionSource(this.connectionString);
        createDaos();
        createSchema();
    }

    public void createSchema() throws SQLException {
        TableUtils.createTableIfNotExists(connectionSource, Player.class);
        TableUtils.createTableIfNotExists(connectionSource, Team.class);
        TableUtils.createTableIfNotExists(connectionSource, Referee.class);
        TableUtils.createTableIfNotExists(connectionSource, Match.class);
        TableUtils.createTableIfNotExists(connectionSource, MatchReferee.class);
        TableUtils.createTableIfNotExists(connectionSource, MatchTeamStartingPlayer.class);
        TableUtils.createTableIfNotExists(connectionSource, Change.class);
        TableUtils.createTableIfNotExists(connectionSource, Goal.class);
        TableUtils.createTableIfNotExists(connectionSource, GoalAssist.class);
        TableUtils.createTableIfNotExists(connectionSource, PenaltyCard.class);
    }

    private void createDaos() throws SQLException {
        this.changeDao = DaoManager.createDao(connectionSource, Change.class);
        this.goalDao = DaoManager.createDao(connectionSource, Goal.class);
        this.goalAssistDao = DaoManager.createDao(connectionSource, GoalAssist.class);
        this.matchDao = DaoManager.createDao(connectionSource, Match.class);
        this.matchRefereeDao = DaoManager.createDao(connectionSource, MatchReferee.class);
        this.matchTeamStartingPlayerDao = DaoManager.createDao(connectionSource, MatchTeamStartingPlayer.class);
        this.penaltyCardDao = DaoManager.createDao(connectionSource, PenaltyCard.class);
        this.playerDao = DaoManager.createDao(connectionSource, Player.class);
        this.refereeDao = DaoManager.createDao(connectionSource, Referee.class);
        this.teamDao = DaoManager.createDao(connectionSource, Team.class);
    }

    public void clearDatabase() throws SQLException {
        TableUtils.clearTable(connectionSource, PenaltyCard.class);
        TableUtils.clearTable(connectionSource, GoalAssist.class);
        TableUtils.clearTable(connectionSource, Goal.class);
        TableUtils.clearTable(connectionSource, Change.class);
        TableUtils.clearTable(connectionSource, MatchTeamStartingPlayer.class);
        TableUtils.clearTable(connectionSource, MatchReferee.class);
        TableUtils.clearTable(connectionSource, Match.class);
        TableUtils.clearTable(connectionSource, Referee.class);
        TableUtils.clearTable(connectionSource, Team.class);
        TableUtils.clearTable(connectionSource, Player.class);
    }

}
