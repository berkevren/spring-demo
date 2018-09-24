package springdemo;

import java.lang.reflect.Array;

public class HappyFortuneService implements FortuneService {

    private String[] fortunesArray;

    public HappyFortuneService() {
        fortunesArray = new String[]{"Today is your lucky day!",
        "Go for it!", "This day is a blessing"};
    }

    @Override
    public String getFortune() {
        int randomNumber = (int)( Math.random()*3);
        return fortunesArray[randomNumber];
    }
}
