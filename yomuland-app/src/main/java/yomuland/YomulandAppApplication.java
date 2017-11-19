package yomuland;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import yomuland.domain.LanguageEnum;
import yomuland.domain.Publication;
import yomuland.domain.StatusTypeEnum;
import yomuland.repository.PublicationRepository;

import java.util.Date;

@SpringBootApplication
public class YomulandAppApplication {


	@Bean
	InitializingBean saveData(PublicationRepository repo) {
		return () -> {
			repo.save(new Publication("Hello World", new Date(), "JE", LanguageEnum.ENGLISH, StatusTypeEnum.PUBLISHED, "InitBean"));
			repo.save(new Publication("日本の未来", new Date(), "JE", LanguageEnum.JAPANESE, StatusTypeEnum.PUBLISHED, "InitBean"));
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(YomulandAppApplication.class, args);
	}

}
