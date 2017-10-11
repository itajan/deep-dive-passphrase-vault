package edu.cnm.deepdive.passphrase;

import edu.cnm.deepdive.passphrase.util.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RandomPassphraseGenerator extends RandomArtifactGenerator {

  private char delimiter = Constants.DEFAULT_DELIMITER;
  public RandomPassphraseGenerator () {
    setLength(Constants.DEFAULT_PASSPHRASE_LENGTH);
  }
  // uses an array to store items, which we then check for repeated words.

  // String builder
  public String generate() {
    List<String> words = new ArrayList<>();


    while (words.size() < getLength()) {
      String word = WordList.getRandom(getRng());
      if (isRepeatedAllowed() || !words.contains(word)) {
        words.add(word);
      }
    }
    return words.stream().collect(Collectors.joining(Character.toString(delimiter)));
  }

  public char getDelimiter() {
    return delimiter;
  }

  public void setDelimiter(char delimiter) {
    this.delimiter = delimiter;
  }

}
