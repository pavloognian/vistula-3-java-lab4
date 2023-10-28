import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        RectangleArea rec1 = new RectangleArea();
    }
}
class RectangleArea{
    private int firstSide;
    private int secondSide;
    private int Area;

    public RectangleArea(){
        getData();
        computeField();
        fieldDisplay();
    }
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second side:");
        int b = Integer.parseInt(scanner.nextLine());
        this.firstSide=a;
        this.secondSide=b;
    }
    public void computeField(){
        this.Area = this.firstSide*this.secondSide;
    }
    public void fieldDisplay(){
        System.out.printf("Area of rectangle with ( a:%d; b:%d; ): %d",this.firstSide,this.secondSide,this.Area);
    }
}
