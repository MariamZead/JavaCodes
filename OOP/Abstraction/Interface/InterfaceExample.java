interface printable{  
void print();  
}  
class Display implements printable{  
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
Display obj = new Display();  
obj.print();  
 }  
}  
