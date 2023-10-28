import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Car car1 = new Car("Lada","Lenovo","green","2002",1000,10);
        System.out.println(car1);
        car1.sell();
        car1.getModel();
        car1.getBrand();
        car1.getYear();
        car1.getPrice();
        car1.getColor();
        car1.getQuantity();

        car1.setColor();
        car1.setPrice();
        System.out.println(car1);
    }
}
class Car{
    Scanner scanner = new Scanner(System.in);
    private String model;
    private String brand;
    private String color;
    private String year;
    private int price;
    private int quantity;

    public Car(String model, String brand, String color, String year, int price, int quantity){
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }
    public void setModel(){
        System.out.println("Enter model please:");
        this.model = scanner.nextLine();
    }
    public void getModel(){

        System.out.printf("Model of the car is: %s %n",this.model);
    }

    public void setBrand(){
        System.out.println("Enter brand please:");
        this.brand = scanner.nextLine();
    }
    public void getBrand(){
        System.out.printf("Brand of the car is: %s %n",this.brand);
    }

    public void setColor(){
        System.out.println("Enter color please: ");
        this.color = scanner.nextLine();
    }
    public void getColor(){
        System.out.printf("Color of the car is: %s %n",this.brand);
    }

    public void setYear(){
        System.out.println("Enter year please: ");
        this.year = scanner.nextLine();
    }
    public void getYear(){
        System.out.printf("Year of the car is: %s %n",this.year);
    }

    public void setPrice(){
        System.out.println("Enter price please:");
        this.price = Integer.parseInt(scanner.nextLine());
    }
    public void getPrice(){
        System.out.printf("Price of the car is: %s %n",this.price);
    }

    public void setQuantity(){
        System.out.println("Enter quantity please:");
        this.quantity = Integer.parseInt(scanner.nextLine());
    }
    public void getQuantity(){
        System.out.printf("Quantity of the car is: %s %n",this.quantity);
    }
    public void delivery(){
        this.quantity++;
        System.out.println("Simulating car delivery.");
    }
    public void sell(){
        this.quantity--;
        System.out.println("Successfully sold");
        System.out.printf("Current quantity is %d %n",this.quantity);
    }
    public String toString(){
        return "Model:"+model+"; brand:"+brand+"; year:"+year+"; price:"+price+"; color:"+color+"; quantity:"+quantity;
    }
}
