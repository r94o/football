package football;

public class League {
  private String leagueName;
  private Match[] matches;

  public String displayTable() {
    return "";
  }

  public String displayMatchInfo() {
    return "";
  }

  public Match getMatch() {
    return this.matches[0];
  }

  public String getLeagueName() {
    return this.leagueName;
  }

}