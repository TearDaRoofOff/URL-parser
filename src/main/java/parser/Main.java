package parser;

import parser.services.WordsCounter;

public class Main {
  public static void main(String[] args) {
    String url = "https://introcs.cs.princeton.edu/java/data/war+peace.txt";
    WordsCounter wordsCounter = new WordsCounter();
    wordsCounter
            .counter(url)
            .forEach((s, aLong) -> System.out.printf("\n %-40s %5d", s, aLong));
  }
}
