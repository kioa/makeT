//07
// [準備]
//  $ cp 07_T0.java T.java
//
// <for文が長い>
//  - だいたい0からn-1までループを回すだけ
//  - 高機能すぎるので、バグの元
//  - iを1文字、nを1文字、残り数単語、それ以外の余計なことを書きたくない
//
// <rangeに対してfor-eachっぽいことをしたい>
//  - rangeっぽい機能がJava8にしかない
//
// [StreamAPIでやってみる]
//  importして
//   import static java.uti.stream.IntStream.*;
//  rangeに対してforEachする
//   range(0, n).forEach( i -> {
//     String s = _Next();
//     println(s);
//   });
//
// [実質的finalの呪い]
//  でもこれだと、ループ外の変数を書き変えられない
//   int cnt = 0;
//   range(0, n).forEach( i -> {
//     cnt++;
//     String s = _Next();
//     println(s);
//   });
//  => 困る
//
// [拡張for文で頑張ろうとする]
//  Streamに対して拡張forを適用
//   for (int i : range(0, n)) {
//     String s = _Next();
//     println(s);
//   }
//  => コンパイルエラー!
//
// [拡張for文で頑張る]
//  配列に変換すればOK
//   for (int i : range(0, n).toArray()) {
//     String s = _Next();
//     println(s);
//   }
//
// <長いのでメソッド化する>
//  これぐらいあれば十分
//  - until(n)   ... [0,n)の整数列
//  - until(i,n) ... [i,n)の整数列
//  - to(i,n)    ... [i,n]の整数列
//
// [until, toを作る]
//  これらをつくって
//   int[] until(int i, int n) { return range(i,n).toArray(); }
//   int[] until(int n) { return until(0,n); }
//   int[] to(int i, int n) { return until(i,n+1); }
//  こう変える
//   for (int i : until(n)) {
import java.util.*;
import static java.lang.System.*;
class Main extends Lib {
  void solve() {
    int n = _Int();
    for (int i=0; i<n; i++) {
      String s = _Next();
      println(s);
    }
  }
}
class Lib {
  public static void main(String[] args) { new Main().solve(); }
  void println(Object o) { out.println(o); }
  Scanner sc = new Scanner(in);
  int _Int() { return sc.nextInt(); }
  String _Next() { return sc.next(); }
}
