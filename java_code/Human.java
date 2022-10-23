package java_code;

public class Human {
  public static void main(String[] args) {
    // Aクラスの人
    Humans Aclass = new Humans();
    System.out.println("\t");
    System.out.println("Aクラスの生徒");
    System.out.println(Aclass.Aname);
    Aclass.calculateAvg(80, 90);

    // Bクラスの人
    Humans Bclass = new Humans();
    System.out.println("\t");
    System.out.println("Bクラスの生徒");
    System.out.println(Bclass.Bname);
    Bclass.calculateAvg(70, 50);
  }
}

class Humans {
  String Aname = "miura";
  String Bname = "tarou";

  public void calculateAvg(int math, int english) {
    System.out.println((math + english) / 2);
  }
}
