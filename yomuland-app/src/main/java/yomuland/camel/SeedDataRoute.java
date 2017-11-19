package yomuland.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SeedDataRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("file:src/main/resources/db/seeds?fileName=tag_types.csv&noop=true")
                .unmarshal().csv().split(body())
                .log("tagType: ===== tagType: ${body}")
                .bean(SeedBeanTransformer.class, "tagTypeMapper")
                .to("jpa:yomuland.domain.TagType")
        ;

        from("file:src/main/resources/db/seeds?fileName=tags_basic.csv&noop=true&initialDelay=2000")
                .unmarshal().csv().split(body())
                .to("log:afterSplit")
                .bean(SeedBeanTransformer.class, "tagMapper")
                .to("jpa:yomuland.domain.Tag")
        ;

        from("file:src/main/resources/db/seeds?fileName=tags_team.csv&noop=true&initialDelay=4000")
                .unmarshal().csv().split(body())
                .to("log:afterSplit")
                .bean(SeedBeanTransformer.class, "tagMapper")
                .to("jpa:yomuland.domain.Tag")
        ;

        from("file:src/main/resources/db/seeds?fileName=tags_security.csv&noop=true&initialDelay=6000")
                .unmarshal().csv().split(body())
                .to("log:afterSplit")
                .bean(SeedBeanTransformer.class, "tagSecurityMapper")
                .to("jpa:yomuland.domain.Tag")
        ;
        from("file:src/main/resources/db/seeds?fileName=tags_nyse.csv&noop=true&initialDelay=12000")
                .unmarshal().csv().split(body())
                .to("log:afterSplit")
                .bean(SeedBeanTransformer.class, "tagSecurityMapper")
                .to("jpa:yomuland.domain.Tag")
        ;



    }
}
