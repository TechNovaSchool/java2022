package Review;

import java.util.Arrays;

public class University {


    String [] studentName;

    public University(String ... args){
        this.studentName = args;
    }

    public String[] getStudentName() {

        String [] result = {};
        for (int i = 0; i<=studentName.length; i++){
            result[i] += studentName[i];
        }
        return result;
    }

    public static void main(String[] args) {

        University ui = new University("John");
        System.out.println(ui.studentName[0]);

        University uw = new University("John", "Bob");
        System.out.println(uw.getStudentName());
    }

}
