import org.kiwi.spring.groovy.FootballMatch
import org.kiwi.spring.groovy.FootballTeam

beans {
    homeTeam(FootballTeam, "Manchester United")
    awayTeam(FootballTeam, "AC Milan")

    footballMatch(FootballMatch, homeTeam, awayTeam) {
        homeScore = 3
        awayScore = 1
    }
}
