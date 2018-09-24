package springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {

    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    public void beanStartup() {
        System.out.println("TrackCoach: inside method beanStartup");
    }

    public void beanCleanup() {
        System.out.println("TrackCoach: inside method beanCleanup");
    }

}
