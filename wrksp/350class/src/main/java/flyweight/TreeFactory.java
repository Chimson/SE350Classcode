package flyweight;
import java.util.Map;
import java.util.HashMap;

// manages shared flyweights
public class TreeFactory {
  private static final Map<Character, ITreeType> cache = new HashMap<>();

  static ITreeType get(Character key) {
    if (cache.containsKey(key)) {
      return cache.get(key);
    }
    else {
      TreeType ttype = new TreeType(key);
      cache.put(key, ttype);
      return ttype;
    }
  }
}

