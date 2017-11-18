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
                .to("log:tagTypeMapper")
                .to("jpa:yomuland.domain.TagType")
        ;

        from("file:src/main/resources/db/seeds?fileName=tags.csv&noop=true&initialDelay=2000")
                .unmarshal().csv().split(body())
                .to("log:afterSplit")
                .bean(SeedBeanTransformer.class, "tagMapper")
                .to("log:postMap")
                .to("jpa:yomuland.domain.Tag")
        ;


    }
}
