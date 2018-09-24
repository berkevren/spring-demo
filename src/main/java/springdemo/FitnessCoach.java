package springdemo;

public class FitnessCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public FitnessCoach() {
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Give me 3 sets of 5 on the bench press";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
