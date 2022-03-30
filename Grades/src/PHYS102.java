import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PHYS102 {
    static Scanner scanner = new Scanner(System.in);

    static double Midterm;
    static double Final;
    static double Attendance;
    static double Homework;
    static double Average;


    PHYS102(double Midterm,double Attendance,double Homework, double Final){

        this.Midterm = Midterm;
        this.Attendance = Attendance;
        this.Homework = Homework;
        this.Final = Final;

    }

    public static void PHYS102_Grades(){
        System.out.println("What's your Midterm Grade ?");
        Midterm = scanner.nextDouble();
        System.out.println("What's your Attendance Grade ?");
        Attendance  = scanner.nextDouble();
        System.out.println("What's your Homework Grade ?");
        Homework = scanner.nextDouble();
        System.out.println("What's your Final Grade ?");
        Final = scanner.nextDouble();

        Average =(Midterm*0.4) + (Attendance*0.05) + (Homework*0.05) + (Final*0.5) ;

        try {
            FileWriter myWriter = new FileWriter("PHYS102.txt");
            myWriter.write("PHYS102 GRADES:"+ "\nMidterm Grade : "+ Midterm + "\nAttendance Grade: " + Attendance + "\nHomework Grade :" + Homework + "\nFinal Grade : "+ Final + "\nAverage Grade : " + Average);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



    }

    public static String Grades(){
        String all = "";
        try {
            File grade = new File("PHYS102.txt");
            Scanner myReader = new Scanner(grade);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }return "\nComeback Later";

    }

}


