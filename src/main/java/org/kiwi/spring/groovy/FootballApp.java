package org.kiwi.spring.groovy;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class FootballApp {
    public static void main(String[] args) {
        System.out.println("THIS IS XML CONFIGURATION");
        xmlConfig();
        System.out.println("THIS IS JAVA CONFIGURATION");
        javaConfig();
        System.out.println("THIS IS GROOVY CONFIGURATION");
        groovyConfig();
    }

    private static void groovyConfig() {
        final GenericGroovyApplicationContext context = new GenericGroovyApplicationContext("FootballMatchConfig.groovy");
        final FootballMatch footballMatch = (FootballMatch) context.getBean("footballMatch");

        System.out.println(footballMatch.display());
    }

    private static void javaConfig() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("football-match-java-config.xml");
        final FootballMatch footballMatch = (FootballMatch) context.getBean("footballMatch");

        System.out.println(footballMatch.display());
    }

    private static void xmlConfig() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("football-match-config.xml");
        final FootballMatch footballMatch = (FootballMatch) context.getBean("footballMatch");

        System.out.println(footballMatch.display());
    }
}
