//01
// [準備]
//  $ cp 01_Main0.java Main.java
//
// [Javaのコンパイルと実行]
//  $ javac Main.java
//  $ ls
//  Main.class  <-  これが実行バイナリ
//  $ java Main
//  2
//  hoge
//  hoge
//  fuga
//  fuga
//
// <ファイル名/クラス名の不自由>
//  - 多くのオンラインジャッジでは、上のような方法で実行
//  - クラス名をMainで強制される
//  - 同フォルダにあるテンプレートをコピーしてすぐ使いたい・・・
//
// [強制される例]
//  $ rm *.class
//  $ cp Main.java T.java
//  $ javac T.java    <-   コンパイルエラー
//  $ java Main       <-   実行できない
//
// <自由なファイル名をつけるには>
//  => "クラスのpublic修飾子を消せばよい"
//   - publicクラスはファイルに高々1つ
//   - publicでないクラスはいくつでも作れる
//   - Mainクラスがmainメソッドを実装してれば、オンラインジャッジで実行される
//
// [public修飾子を消してみる]
//  - コンパイル・実行できるはず
//  - 以後"T.java"をテンプレートとして使っていく
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
