package yomuland.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yomuland.domain.TagType;

public interface TagTypeRepository extends JpaRepository<TagType, Long> {
}
