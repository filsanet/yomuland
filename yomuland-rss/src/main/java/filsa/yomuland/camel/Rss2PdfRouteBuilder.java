package filsa.yomuland.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;


public class Rss2PdfRouteBuilder extends RouteBuilder {

    private String nikkeiRSS = "https://asia.nikkei.com/rss/feed/nar"; // uses RDF
    private String diamondIntlRSS = "http://diamond.jp/list/rsssc?w=%E5%9B%BD%E9%9A%9B";
    private String nytimesBizRss = "http://rss.nytimes.com/services/xml/rss/nyt/Economy.xml";

    private String nytimesFile = "file:src/data/nytimes-tech.xml";
    private String asiaNikkeiFile = "file:src/data/asia-nikkei-rdf.xml";


    private Rss2PdfBean rss2PdfBean = new Rss2PdfBean();

    @Override
    public void configure() throws Exception {

        from("rss:" + nytimesFile + "?splitEntries=false&consumer.delay=1000")

                .log("Item: ${body.getClass}")
                .bean(rss2PdfBean, "printFeed")

                //.to("log:yomuland?showHeaders=false&showExchangePattern=false&showBodyType=false")
                //.to("pdf:create?fontSize=14")
                //.to("file:target/pdf?fileName=rss-${id}.pdf")
                ;

                 }



}
