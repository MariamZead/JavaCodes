import java.util.HashMap;

public class Set {
    public static void main(String[] args) {
        HashMap <String,Integer> marks = new HashMap<>();
        marks.put("251",10);
        marks.put("252",70);
        marks.put("253",90);
        marks.put("254",55);

        double sum = 0;
        double counter = 0;
      
        for (String ID : marks.keySet()){
            if (marks.get(ID) >= 50){
                sum += marks.get(ID);
                counter++;
            }
        }
        System.out.printf("The average marks of the students is : %.2f" , (sum/counter));
    }
}
