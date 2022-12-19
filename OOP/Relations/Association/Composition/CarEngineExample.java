class Engine {
    public void work() {
        System.out.println("Engine of car has been started ");
    }
}

// Class 2
// Engine class
final class Car {
    // For a car to move, it needs to have an engine. (Composition)
    private final Engine engine;
    public  Car(Engine engine) {
        this.engine = engine;
    }
    // Car start moving by starting engine
    public void move(){
         if(engine != null) {
            // Calling method for working of engine
            engine.work();
            // Print statement
            System.out.println("Car is moving ");
        }
    }
}

public class Composition {

    public static void main(String[] args) {

        // Making an engine by creating an instance of Engine class.
        Engine engine = new Engine();
        Car car = new Car(engine); // " Engine of car has been started "
        engine.work(); // " Engine of car has been started "
        car.move(); // " Car is moving  "
    }
}
