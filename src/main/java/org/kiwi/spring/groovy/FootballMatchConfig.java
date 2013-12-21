package org.kiwi.spring.groovy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FootballMatchConfig {
    @Bean
    public FootballMatch footballMatch() {
        final FootballMatch footballMatch = new FootballMatch(homeTeam(), awayTeam());
        footballMatch.setHomeScore(3);
        footballMatch.setAwayScore(1);
        return footballMatch;
    }

    @Bean
    public FootballTeam homeTeam() {
        return new FootballTeam("Manchester United");
    }

    @Bean
    public FootballTeam awayTeam() {
        return new FootballTeam("AC Milan");
    }
}
