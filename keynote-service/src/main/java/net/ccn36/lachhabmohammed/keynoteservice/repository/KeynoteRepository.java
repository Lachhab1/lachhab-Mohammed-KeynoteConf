package net.ccn36.lachhabmohammed.keynoteservice.repository;

import net.ccn36.lachhabmohammed.keynoteservice.entity.Keynote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface KeynoteRepository extends JpaRepository<Keynote, Long> {
}
