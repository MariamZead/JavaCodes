import java.util.HashMap;

public class AverageMarks {
    public static void main(String []args){
        HashMap <String,Integer> studentsMarks = new HashMap<>();
        studentsMarks.put("251",55);
        studentsMarks.put("642",15);
        studentsMarks.put("942",60);
        studentsMarks.put("546",70);
        averageMarks(studentsMarks);
    }
    // method for calculating the average marks
    public static void averageMarks(HashMap<String,Integer>marks){
        double sumOfMarks = 0;
        double counter = 0;
        double average;
        for (String x : marks.keySet()){
            if (marks.get(x) >= 50){
              // .get() will return the specific value of the key
                sumOfMarks += marks.get(x);
                counter++;
            }
        }
        average = sumOfMarks / counter;
        System.out.printf("The average marks is %.2f", average);
    }
}
