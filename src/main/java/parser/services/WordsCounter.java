package parser.services;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordsCounter {
   private final Parser parser = new JsoupParser();

   private List<String> getWords(String url) {
     return List.of(parser.parsWords(url).split("[ ,.!?\";:\\[\\]()\\n\\r\\t]+"));
   }

   public Map<String, Long> counter(String url) {
     return getWords(url).stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
   }
}
