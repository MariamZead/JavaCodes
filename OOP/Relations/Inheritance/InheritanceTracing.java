public class Set {
    public static void main(String[] args) {
        B b = new B();
        B x = new D(); // can see all data of the parent "including static methods" , can only see overriden methods in the child "not including static method"
        D d = new D();
        E e = new E();
        doPrint(b); // B show()
        doPrint(x); // D show()
        doPrint(d); // D show()
        doPrint(e); // D show() \n E show()
        x.display(); // D display()
        System.out.println(b.a); // 50
        System.out.println(x.a); // 50 (el main = parent)
        System.out.println(d.a); // 20
        System.out.println(e.a); // 20
    }
    public static void doPrint(B o){
        o.show();
    }
}

class B {
    int a = 50;
    public void show(){
        System.out.println("B show()");
    }
    public void display(){
        System.out.println("B display()");
    }
}
class D extends B {
    int a = 20;
    public void show(){
        System.out.println("D show()");
    }
    public void display(){
        System.out.println("D display()");
    }
}
class E extends D{
    public void show(){
        super.show();
        System.out.println("E show()");
    }
}
