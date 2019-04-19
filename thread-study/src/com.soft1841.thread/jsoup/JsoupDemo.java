package com.soft1841.thread.jsoup;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 * 爬取网络上面的某些文字
 * Created by 田震 on 2019/4/18 00:11
 */
public class JsoupDemo {
    public static void main (String[] args) throws Exception{
        String url="http://www.importnew.com/all-posts";
        Connection connection= Jsoup.connect(url);
        Document document=connection.get();
        Elements elements=document.getElementsByClass("post-meta");
        System.out.println(elements.size());
        for (Element  element:elements
             ) {
            Element link=element.child(0).child(0);
            String titleString=link.text();
            System.out.println(titleString);
        }
    }
}
