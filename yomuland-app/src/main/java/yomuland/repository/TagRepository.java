package yomuland.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yomuland.domain.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
