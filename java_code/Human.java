package java_code;

public class Human {
  public static void main(String[] args) {
    Humans sas = new Humans();
    sas.name = "miura";
    System.out.println(sas.name);
  }
}

class Humans {
  String name = "miura";

  public void calculateAvg(int math, int english) {
    System.out.println((math + english) / 2);
  }
}
