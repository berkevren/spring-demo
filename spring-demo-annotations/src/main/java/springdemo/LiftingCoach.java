package springdemo;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LiftingCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${sports.liftingEmail}")
    private String email;
    @Value("${sports.liftingTeam}")
    private String team;

    public LiftingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Go for a PR on the bench today!";
    }

    @PostConstruct
    public void startup() {
        System.out.println(">> LiftingCoach: inside of startup()");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println(">> LiftingCoach: inside of cleanup()");
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getTeam() {
        return team;
    }

    public String getEmail() {
        return email;
    }
}
