package springdemo;

public class LiftingFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is the day for that sweet PR!";
    }
}
