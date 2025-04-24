package org.example;

public class Main {
    public static void main(String[] args) {
Guitar guitar = new Guitar();
guitar.play();
Circle C= new Circle(11);
System.out.println("The Area of circle is "+C.area()+" Square per meter");
Developer developer = new Developer(1000000.0,30000.0);
System.out.println("The Salary of developer "+developer.name+" is "+developer.calculateSalary());
Bird bird = new Bird();
bird.fly();
Bird bird2 = new Penguin();
bird2.fly();
        InkjetPrinter inkjetPrinter = new InkjetPrinter();
        inkjetPrinter.print();
        LaserPrinter laserPrinter = new LaserPrinter();
        laserPrinter.print();
    }
}