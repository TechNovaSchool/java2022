package pckg01.com;

public class PrintNumber implements ITwo {


    public static void main(String[] args) {
        PrintNumber number = new PrintNumber();
        number.printNumber(10);
        System.out.println(" ");
        number.printNumber(50, 80);
        System.out.println(" ");
        number.printNumber(10, "*");
        number.printNumber();

    }


    @Override
    public void printNumber(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.print(i+ ", ");
        }
    }

    @Override
    public void printNumber(int numberFrom, int numberTo) {
      for(int i = numberFrom; i <= numberTo; i++){
          System.out.print(i+ ", ");
      }
    }

    @Override
    public void printNumber(int number, String star) {
        for (int i = 0; i<= number; i++){
            System.out.print(star);
        }
    }

    @Override
    public void printNumber() {
        System.out.println(10);
    }
}
