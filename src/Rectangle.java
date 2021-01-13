import java.util.Scanner;

public class Rectangle {
    double width,height;
    public Rectangle(){};
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    Scanner scanner=new Scanner(System.in);
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public void setWidth(){
        System.out.println("width");
       this.width=scanner.nextDouble() ;

    }
    public void setHeight(){
        System.out.println("height");
    this.height= scanner.nextDouble();

    }
}


