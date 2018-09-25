package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside constructor using @autowired and " +
                "@ qualifier");
        this.fortuneService = fortuneService;
    }

    @PostConstruct
    public void startup() {
        System.out.println(">> FitnessCoach: inside of startup()");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println(">> FitnessCoach: inside of cleanup()");
    }

    /*
    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println(">> Tennis Coach: inside doSomeCrazyStuff() method");
        this.fortuneService = fortuneService;
    }
    */

    /*
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
