package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("omarIsuf")
public class FitnessCoach implements Coach {

    @Autowired
    @Qualifier("coffeeFortuneService")
    private FortuneService fortuneService;

    @Value("${sports.email}")
    private String email;

    @Value("${sports.team}")
    private String team;

    @Autowired
    public FitnessCoach() {
        System.out.println(">> FitnessCoach: inside default constructor");
        System.out.println(">> FitnessCoach's email: " + email);
        System.out.println(">> FitnessCoach's team: " + team);
    }

    @PostConstruct
    public void startup() {
        System.out.println(">> FitnessCoach: inside of startup()");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println(">> FitnessCoach: inside of cleanup()");
    }

    @Override
    public String getDailyWorkout() {
        System.out.println(">> FitnessCoach's email: " + email);
        System.out.println(">> FitnessCoach's team: " + team);
        return "Give me 3 sets of 5 on the squat";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
