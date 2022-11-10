import java.util.ArrayList;

public class StudentPicker {
    public static void main(String[] args) {

        // creating a basic String Array
        String[] myStrings = new String[] {"Student1", "Student2", "Student3", "Student4"};

        // Putting each string into an ArrayList
        ArrayList<String> students = new ArrayList<String>();
        for (int i = 0; i < myStrings.length; i++) {
            students.add(myStrings[i]);
        }

        // picks a random student from the ArrayList
        int r = (int)(Math.random()*4);
        System.out.println("Random student picked is: " + students.get(r));
    }
}
