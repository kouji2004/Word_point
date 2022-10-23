package java_code;

public class lesson2 {
  public static void main(String[] ages) {
    Car car = new Car();

    car.engine();
    System.out.println(car.air);
    System.out.println(car.gus);
  }
}

class Car {
  public int air = 10;
  public int gus = 5;

  public void engine() {
    System.out.println("車はガソリンで動く");
  }
}
