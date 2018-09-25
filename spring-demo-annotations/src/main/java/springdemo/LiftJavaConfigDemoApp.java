package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LiftJavaConfigDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(LiftingConfig.class);

        LiftingCoach theCoach = context.getBean("liftingCoach", LiftingCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println("Email: " + theCoach.getEmail());
        System.out.println("Team: " + theCoach.getTeam());

        context.close();


    }
}
