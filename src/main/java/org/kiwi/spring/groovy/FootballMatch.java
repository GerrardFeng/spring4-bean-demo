package org.kiwi.spring.groovy;

public class FootballMatch {
    private FootballTeam homeTeam;
    private FootballTeam awayTeam;
    private int homeScore;
    private int awayScore;

    public FootballMatch(FootballTeam homeTeam, FootballTeam awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public String display() {
        return String.format("home: %s, away: %s. Score: %s-%s",
                homeTeam.getName(), awayTeam.getName(), homeScore, awayScore);
    }
}
