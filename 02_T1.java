//02
// [準備]
//  $ cp 02_T0.java T.java
//
// <System.out.printlnが長い>
//  - 標準出力するメソッド
//  - 長い・・・
//  - 補完を使うにしても、'.'で区切られるので、3ステップ必要
//
// <static importで工夫>
//  - static importを使うと、
//  - あるクラスのクラス変数/メソッドを直接呼べるようになる
//  - System.を省略できそう
//
// [書き方]
//  こうすると、
//   import static java.lang.System.*;
//  こうできる
//   out.println("hoge");
//  ので、やってみる
//
// [ついでに]
//  これも省略できて
//   new Scanner(System.in);
//  こうなる
//   new Scanner(in);
import java.util.*;
import static java.lang.System.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int n = sc.nextInt();
    for (int i=0; i<n; i++) {
      String s = sc.next();
      out.println(s);
    }
  }
}
