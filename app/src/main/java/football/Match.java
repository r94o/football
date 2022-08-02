package football;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Hashtable;

public class Match {
  private String homeTeam;
  private String awayTeam;
  private LocalDateTime datetime;
  private ArrayList<Player> homeTeamLineUp;
  private ArrayList<Player> awayTeamLineUp;
  private ArrayList<Event> goals;
  private ArrayList<Event> cards;
  private boolean hasCompleted;

  public boolean hasCompleted() {
    return this.hasCompleted;
  }

  public LocalDateTime getDatetime() {
    return this.datetime;
  }

  public ArrayList<Player> getHomeTeamLineUp() {
    return this.homeTeamLineUp;
  }

  public ArrayList<Player> getAwayTeamLineUp() {
    return this.awayTeamLineUp;
  }

  public void setHomeTeamLineUp(ArrayList<Player> players) {
    this.homeTeamLineUp = players;
  }

  public void setAwayTeamLineUp(ArrayList<Player> players) {
    this.awayTeamLineUp = players;
  }

  public void addEvent(Event event) {

  }

  public Hashtable getScore() {
    return new Hashtable();

  }

  public ArrayList<Event> getGoals() {
    return this.goals;
  }

  public ArrayList<Event> getCards() {
    return this.cards;
  }

}