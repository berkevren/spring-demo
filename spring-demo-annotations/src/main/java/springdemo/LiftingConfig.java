package springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports.properties")
public class LiftingConfig {

    @Bean
    public LiftingFortuneService liftingFortuneService() {
        return new LiftingFortuneService();
    }

    @Bean
    public LiftingCoach liftingCoach() {
        return new LiftingCoach(liftingFortuneService());
    }
}
