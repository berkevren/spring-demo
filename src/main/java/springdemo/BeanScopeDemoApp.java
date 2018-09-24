package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", FitnessCoach.class);
        Coach alphaCoach = context.getBean("myCoach", FitnessCoach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        System.out.println("\nCoach 1's Fortune: " + theCoach.getDailyFortune());
        System.out.println("\nCoach 2's Fortune: " + alphaCoach.getDailyFortune());

        context.close();
    }
}
