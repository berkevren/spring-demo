package springdemo;

public class FitnessCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;
    private String dailyFortune;

    public FitnessCoach() {
    }

    public FitnessCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        this.dailyFortune = fortuneService.getFortune();
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
        return dailyFortune;
    }
}
