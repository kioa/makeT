import java.util.*; import static java.lang.System.*; import static java.util.stream.IntStream.*;
class Main extends Lib {
  void solve() {
  }
}
class Lib {
  public static void main(String[] args) { new Main().solve(); }
  void println(Object o) { out.println(o); }
  Scanner sc = new Scanner(in);
  int _Int() { return sc.nextInt(); }
  String _Next() { return sc.next(); }
  int[] until(int i, int n) { return range(i,n).toArray(); }
  int[] until(int n) { return until(0,n); }
  int[] to(int i, int n) { return until(i,n+1); }
}
