import java.util.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String set = Integer.toString(num);
    ArrayList<String> list = new ArrayList<String>();
    for(int i = 0; i < set.length(); i++) {
      char phc = set.charAt(i);
      String phs = Character.toString(phc);
      list.add(phs);
    }
    Collections.sort(list);
    Collections.reverse(list);
    set = String.join(",",list);
    int sorted = Integer.parseInt(set.replaceAll(",",""));
    return sorted;
  }
}