package yomuland.camel;


import org.springframework.beans.factory.annotation.Autowired;
import yomuland.domain.Tag;
import yomuland.domain.TagType;
import yomuland.repository.TagTypeRepository;

import java.util.List;

public class SeedBeanTransformer {

    @Autowired
    TagTypeRepository tagTypeRepo;

    public TagType tagTypeMapper (List<String> row) {

        TagType tagType = new TagType();

        tagType.setNameEn(row.get(0));
        tagType.setNameJa(row.get(1));
        tagType.setRefTypeId(Long.valueOf(row.get(2).trim()));

        return tagType;

    }

    public Tag tagMapper (List<String> row) {

        Tag tag = new Tag();

        tag.setNameEn(row.get(1));
        tag.setNameJa(row.get(2));
        tag.setTagType(tagTypeRepo.getOne(Long.valueOf(row.get(0).trim()).longValue()));

        return tag;

    }

    public Tag tagSecurityMapper(List<String> row) {

        Tag tag = new Tag();

        tag.setTagType(tagTypeRepo.getOne(Long.valueOf(row.get(0).trim()).longValue()));
        tag.setNameEn(row.get(1));
        tag.setNameJa(row.get(2));
        tag.setRefKey(row.get(3));
        tag.setRefCode(row.get(4));
        return tag;

    }



}
