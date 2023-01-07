import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class MainForm extends JFrame {

    private JMenuBar menuBar;
    private JTabbedPane tabbedPane1;
    private JPanel rootPanel;
    private JTextArea textAreaLog;
    ActionListener addFileMenuItemClicked = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textAreaLog.append("Database > Add file menu clicked");
        }
    };
    private JTable tableResults;

    public static void main(String[] args) throws SQLException {
        DatabaseAdapter dbAdapter = new DatabaseAdapter();
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        menuBar = new JMenuBar();
        JMenu databaseMenu = new JMenu();
        databaseMenu.setText("Database");

        JMenuItem addFileMenuItem = new JMenuItem(new AddFileAction(this));
        addFileMenuItem.setText("Add file");
        addFileMenuItem.addActionListener(addFileMenuItemClicked);
        databaseMenu.add(addFileMenuItem);
        JMenuItem addFolderMenuItem = new JMenuItem();
        addFolderMenuItem.addActionListener(addFileMenuItemClicked);
        addFolderMenuItem.setText("Add folder");
        databaseMenu.add(addFolderMenuItem);
        JMenuItem clearDatabaseMenuItem = new JMenuItem();
        clearDatabaseMenuItem.setText("Clear database");
        databaseMenu.add(clearDatabaseMenuItem);

        JMenu statisticsMenu = new JMenu();
        statisticsMenu.setText("Statistics");

        JMenuItem championshipTable = new JMenuItem();
        championshipTable.setText("Championship table");
        statisticsMenu.add(championshipTable);

        JMenuItem bestAttackers = new JMenuItem();
        bestAttackers.setText("Best attackers");
        statisticsMenu.add(bestAttackers);

        JMenuItem mostCards = new JMenuItem();
        mostCards.setText("Players with most yellow/red cards");
        statisticsMenu.add(mostCards);

        JMenuItem bestGoalkeepers = new JMenuItem();
        bestGoalkeepers.setText("Best goalkeepers");
        statisticsMenu.add(bestGoalkeepers);

        menuBar.add(databaseMenu);
        menuBar.add(statisticsMenu);
    }
}
