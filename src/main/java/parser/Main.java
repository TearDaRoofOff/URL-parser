package parser;

import parser.services.WordsCounter;

public class Main {
  public static void main(String[] args) {
    String url = "https://www.simbirsoft.com/";
    WordsCounter wordsCounter = new WordsCounter();
    wordsCounter
            .counter(url)
            .forEach((s, aLong) -> System.out.printf("\n %-40s %3d", s, aLong));
  }
}
