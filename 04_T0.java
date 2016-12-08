//04
// [準備]
//  $ cp 04_T0.java T.java
//
// <毎回Scannerを宣言して初期化するのは不毛>
//  - クラス変数にする
//
// [書き方 Scanner]
//  こうして、
//   static Scanner sc = new Scanner(in);
//  mainメソッドのScannerの宣言を消す
//
// <毎回"sc."と書くのは不毛>
//  - クラスメソッドにする
//
// [書き方 nextInt]
//  こうして、
//   static int _Int() { return sc.nextInt(); }
//  これを
//   sc.nextInt()
//  これに置き換える
//   _Int()
//
// [書き方 next]
//  こうして、
//   static String _Next() { return sc.next(); }
//  これを
//   sc.next()
//  これに置き換える
//   _Next()
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
