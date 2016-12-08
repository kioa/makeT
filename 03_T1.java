//03
// [準備]
//  $ cp 03_T0.java T.java
//
// <out.printlnでも長い>
//  static importしてもout.と書くのが面倒くさい
//
// <自分でメソッド書けばよいのでは？>
//  - うん
//
// [書き方]
//  こうすると、
//   static void println(Object o) { out.println(o); }
//  こう書ける
//   println(s);
//  ので、やってみる
import java.util.*;
import static java.lang.System.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int n = sc.nextInt();
    for (int i=0; i<n; i++) {
      String s = sc.next();
      println(s);
    }
  }
  static void println(Object o) { out.println(o); }
}
