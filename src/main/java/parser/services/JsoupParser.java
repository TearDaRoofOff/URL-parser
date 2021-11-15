package parser.services;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupParser implements Parser{

  @Override
  public String parsWords(String url) {
    String text = null;

    try {
      Document document = Jsoup.connect(url).get();
      text = document.body().text();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return text;
  }
}
