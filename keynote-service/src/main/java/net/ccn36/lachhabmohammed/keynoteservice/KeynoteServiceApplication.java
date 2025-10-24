package net.ccn36.lachhabmohammed.keynoteservice;

import net.ccn36.lachhabmohammed.keynoteservice.entity.Keynote;
import net.ccn36.lachhabmohammed.keynoteservice.repository.KeynoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KeynoteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeynoteServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(KeynoteRepository keynoteRepository) {
        return args -> {

            keynoteRepository.save(
                    Keynote.builder()
                    .firstname("Mohammed")
                    .lastname("Lachhab")
                    .fonction("Host")
                    .build()
            );
            keynoteRepository.save(Keynote.builder()
                    .firstname("Zakaria")
                    .lastname("Mourid")
                    .fonction("Animateur")
                    .build());
            keynoteRepository.save(Keynote.builder()
                    .firstname("Yassine")
                    .lastname("Tai")
                    .fonction("Expert It")
                    .build());

        };
    }
}
