class B {
    int a = 50;
    public B(){
        System.out.println("B constructor()");
    }
    public void show(){
        System.out.println("B show() ");
    }
    public void display(){
        System.out.println("B display() ");
    }
}
class D extends B {
    int a = 20;
    public D(){
        System.out.println("D constructor()");
    }
    public void show(){
        System.out.println("D show() ");
    }
    public void display(){
        System.out.println("D display() ");
    }
}
class E extends D {
    public E(){
        System.out.println("E constructor()");
    }
    public void show(){
        super.show();
        System.out.println("E show() ");
    }
    public void display(){
        System.out.println("D display() ");
    }
}

public class Main {
    public static void DoPrint(B o){
        o.show();
    }
   public static void main(String[] args) {
        B x = new B(); // B constructor()
        B y = new D(); // B constructor() , D constructor()
        D z = new D(); // B constructor() , D constructor()
        E w = new E();// B constructor() , D constructor() , E constructor()
        DoPrint(x); // B show()
        DoPrint(y); // D show()
        DoPrint(z); // D show()
        DoPrint(w); // D show() , E show()
        y.display(); // D display()
        System.out.println(x.a); // 50
        System.out.println(y.a); // 50 because
        System.out.println(z.a); // 20
        System.out.println(w.a); // 20
    }
}
