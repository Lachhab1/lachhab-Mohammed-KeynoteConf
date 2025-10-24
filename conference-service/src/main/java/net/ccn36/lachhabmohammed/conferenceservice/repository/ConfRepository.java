package net.ccn36.lachhabmohammed.conferenceservice.repository;

import net.ccn36.lachhabmohammed.conferenceservice.entity.Conference;
import net.ccn36.lachhabmohammed.conferenceservice.entity.TYPECONF;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ConfRepository extends JpaRepository<Conference, Long> {
    List<Conference> findByType(TYPECONF type);
}
