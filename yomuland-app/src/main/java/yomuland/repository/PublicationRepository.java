package yomuland.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yomuland.domain.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Long> {
}
