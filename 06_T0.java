//06
// [準備]
//  $ cp 06_T0.java T.java
//
// <テンプレートのメソッドが邪魔>
//  - 無駄に視界に入る
//  - 問題の解答に直接関係ない
//
// <いらないものは別クラスに分ける>
//  - 他クラスへ移動
//  - 移動先のクラスを継承
//
// [書き方 他クラスへ移動]
//  こんなクラスを作って
//   calss Lib { ... }
//  solve以外の邪魔なものを全部突っ込む
//
// [書き方 継承]
//  こうする
//   class Main extends Lib {
import java.util.*;
import static java.lang.System.*;
class Main {
  void solve() {
    int n = _Int();
    for (int i=0; i<n; i++) {
      String s = _Next();
      println(s);
    }
  }
  public static void main(String[] args) { new Main().solve(); }
  void println(Object o) { out.println(o); }
  Scanner sc = new Scanner(in);
  int _Int() { return sc.nextInt(); }
  String _Next() { return sc.next(); }
}
