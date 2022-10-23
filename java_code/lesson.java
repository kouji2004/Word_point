package java_code;

class Car {
  public int air = 10;// 変数airに10を代入
  public int gus; // 変数gusを宣言

  public void engine() { // メソッドengineを宣言
    System.out.println("車はガソリンで動く。");// メソッドの処理
  }
}

public class lesson { // Mainクラスを宣言
  public static void main(String[] args) { // mainメソッドを宣言
    Car car = new Car();// インスタンス化でインスタンス生成
    car.gus = 5;// 変数
    car.engine();
    System.out.println(car.air);// 変数airを出力
    System.out.println(car.gus);// 変数gusを出力
  }
}