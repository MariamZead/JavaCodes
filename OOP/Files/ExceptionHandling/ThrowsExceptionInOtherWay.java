public class Throwss {
    public static void main(String[] args) throws InvalidAgeException {
        Throwss obj = new Throwss();
        obj.ageCheck(12);
    }
    public void ageCheck (int age) throws InvalidAgeException{
        if (age < 18) {
            throw new InvalidAgeException("Age Unacceptable You must be 18 years old or more");
        }
        else
            System.out.println("Age Acceptable");
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException (String s){
        super(s);
    }
}
