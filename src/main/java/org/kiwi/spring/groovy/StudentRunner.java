package org.kiwi.spring.groovy;

import org.springframework.context.support.GenericGroovyApplicationContext;

public class StudentRunner {
    public static void main(String[] args) {
        final GenericGroovyApplicationContext context = new GenericGroovyApplicationContext("FootballMatchConfig.groovy");

//        final Student student = (Student) context.getBean("student");
//        System.out.println(student.display());
    }
}
