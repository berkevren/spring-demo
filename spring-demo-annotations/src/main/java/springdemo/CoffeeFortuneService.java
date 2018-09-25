package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

@Component
public class CoffeeFortuneService implements FortuneService {

    @Value("${sports.fortuneAddress}")
    private String coffeeFortunesAddress;
    private String[] allFortunesInTextFile;
    private boolean didDrinkCoffee;
    private Random random;

    @Autowired
    public CoffeeFortuneService() {
        didDrinkCoffee = false;
        random = new Random();
    }

    //@PostContruct doesn't work
    @PostConstruct
    private void drinkCoffee(String coffeeFortunesAddress) {

        allFortunesInTextFile = new String[5];
        int index = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(coffeeFortunesAddress))) {
            while (br.readLine() != null) {
                allFortunesInTextFile[index] = br.readLine();
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        if (!didDrinkCoffee)
            drinkCoffee(coffeeFortunesAddress);

        int index = random.nextInt(allFortunesInTextFile.length);
        return "Coffee Fortune: " + allFortunesInTextFile[index];
    }
}
