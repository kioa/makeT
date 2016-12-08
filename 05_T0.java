//05
// [準備]
//  $ cp 05_T0.java T.java
//
// <staticがいっぱいあって見通しが悪い>
//  - staticを消す!
//  - mainメソッドから、インスタンスメソッドのsolveを呼ぶ
//  - main以外のメソッドのstaticを消す
//
// [書き方 solve]
//  このメソッドを作って
//   void solve() { ... }
//  中にmainメソッドの内容をコピーする
//  で、こうする
//   public static void main(String[] args) { new Main().solve(); }
//
// [書き方 static除去]
//  main以外のstaticを消す
import java.util.*;
import static java.lang.System.*;
class Main {
  public static void main(String[] args) {
    int n = _Int();
    for (int i=0; i<n; i++) {
      String s = _Next();
      println(s);
    }
  }
  static void println(Object o) { out.println(o); }
  static Scanner sc = new Scanner(in);
  static int _Int() { return sc.nextInt(); }
  static String _Next() { return sc.next(); }
}
