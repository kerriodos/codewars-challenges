public class Chocolate{
  public static int breakChocolate(int n, int m) {
    int breaks = 0;
    if(n > 0&&m >0) {
      int first = Math.max(n, m);
      int second = Math.min(n, m);
      breaks = first - 1;
      breaks = breaks + ((second - 1) * first);
    }
    return breaks;
  }
}