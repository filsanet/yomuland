package filsa.yomuland.camel;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRssRouteBuilder extends RouteBuilder {

    String nikkeiRSS = "https://asia.nikkei.com/rss/feed/nar"; // uses RDF
    String diamondIntlRSS = "http://diamond.jp/list/rsssc?w=%E5%9B%BD%E9%9A%9B";
    String nytimesBizRss = "http://rss.nytimes.com/services/xml/rss/nyt/Economy.xml";

    String nytimesFile = "file:src/data/nytimes-economy.xml";

    @Override
    public void configure() throws Exception {
        from("rss:" + nytimesFile + "?splitEntries=false&consumer.delay=1000")
                .marshal().rss()
                .setBody(xpath("/rss/channel/item/title/text()"))
                .transform(body().prepend("Nikkei: "))
                .to("log:yomuland?showHeaders=false&showExchangePattern=false&showBodyType=false")
                .to("pdf:create?fontSize=14")
                .to("file:target/pdf?fileName=rss-${id}.pdf");
    }
}
