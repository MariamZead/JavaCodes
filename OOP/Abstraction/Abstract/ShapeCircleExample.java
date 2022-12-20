abstract class Shapes {
    String color;
    public Shapes(){
        System.out.println("Shapes no arg Constructor()");
    }

    public Shapes(String color) {
        this.color = color;
    }

    public abstract double area();

    @Override
    public String toString() {
        return "Shapes{" +
                "color='" + color + '\'' +
                '}';
    }
}

class Circles extends Shapes {
    double radius;
    Circles(){
        System.out.println("Circle no arg Constructor()");
    }

    public Circles(double radius) {
        this.radius = radius;
    }
    public Circles(double radius, String color){
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circles{" + super.toString()+
                "radius=" + radius +
                '}';
    }
}

public class Test {

    public static void main(String[] args) {
        Circles c1 = new Circles(5,"Blue");
        System.out.println(c1);
        Shapes c2 = new Circles(2,"Red");
        System.out.println(c2);
        Circles c3 = new Circles(); // printing Shape and Circle constructor()
        Shapes c4 = new Circles(); // printing Shape and Circle constructor()
    }
}
