import java.util.*;
public class RandomStringChooser
{
  private final ArrayList<String> words = new ArrayList<>();

  public RandomStringChooser(String[] sa) {
    for (String s : sa) {
      words.add(s);
    }
  }

  public String getNext() {
    if (words.size() == 0) {
      return "NONE";
    }
    return words.remove((int) (Math.random() * words.size()));
  }
}
