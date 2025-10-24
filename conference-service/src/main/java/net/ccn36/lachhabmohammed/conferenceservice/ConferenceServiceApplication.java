package net.ccn36.lachhabmohammed.conferenceservice;

import net.ccn36.lachhabmohammed.conferenceservice.entity.Conference;
import net.ccn36.lachhabmohammed.conferenceservice.entity.TYPECONF;
import net.ccn36.lachhabmohammed.conferenceservice.repository.ConfRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableFeignClients
public class ConferenceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConferenceServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ConfRepository confRepository) {
        return args -> {
            Conference conf1 = Conference.builder()
                    .title("Introduction à Spring Boot")
                    .type(TYPECONF.ACADEMIC)
                    .date(new Date())
                    .duration(120)
                    .nombreInscrits(150)
                    .score(4.5)
                    .build();
            confRepository.save(conf1);
        };
    }
}