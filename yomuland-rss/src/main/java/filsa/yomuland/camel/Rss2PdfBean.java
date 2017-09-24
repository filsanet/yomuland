package filsa.yomuland.camel;


import com.rometools.rome.feed.synd.SyndFeedImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  Handle the SyndFeed (ROME) for RSS
 */
public class Rss2PdfBean {

    private static Logger logger = LoggerFactory.getLogger(Rss2PdfBean.class);

    public static void printFeed (SyndFeedImpl feed) {

        logger.info("Date:" + feed.getPublishedDate());
        logger.info("Title:" + feed.getTitle());
        logger.info("Link:" + feed.getLink());
    }


}
