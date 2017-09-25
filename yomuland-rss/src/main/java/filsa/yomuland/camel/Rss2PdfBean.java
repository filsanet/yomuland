package filsa.yomuland.camel;


import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeedImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 *  Handle the SyndFeed (ROME) for RSS
 */
public class Rss2PdfBean {

    private static Logger logger = LoggerFactory.getLogger(Rss2PdfBean.class);

    public static void logFeed(SyndFeedImpl feed) {

       logger.info(String.format(">>>>>> Feed Info: %s (%s)",  feed.getPublishedDate(), feed.getEntries().size()));

       List<SyndEntry> entries = feed.getEntries();

       entries.forEach (entry -> {
          logger.info(String.format("%s, by: %s (%s) %s", entry.getTitle(), entry.getAuthor(), entry.getPublishedDate(), entry.getLink()));
       });

    }


}
