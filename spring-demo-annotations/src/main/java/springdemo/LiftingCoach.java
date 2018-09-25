package springdemo;

import org.springframework.beans.factory.annotation.Value;

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
