//00
// [準備]
//  $ cp 00_Main0.java Main.java
//
// <本日の話題>
//  - プロコンの問題を早く解きたい
//  - Javaで解きたい
//
// <手段>
//  - テンプレートを使う
//
// <テンプレート>
//  - 毎度同じフレーズを打ちたくない(public static void main ...)
//  - プロコン問題を解く前にあらかじめコードを用意しておく
//  - 問題を開くたびに、コピーして使う
//
// [本日の問題]
//  1行目でnを読み込んで、
//  続くn行の文字列を読み込んで、そのまま出力する
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i=0; i<n; i++) {
      String s = sc.next();
      System.out.println(s);
    }
  }
}
