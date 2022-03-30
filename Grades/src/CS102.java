import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CS102 {
    static Scanner scanner = new Scanner(System.in);

    static double LabWorks;
    static double Quiz;
    static double Midterm;
    static double Final;
    static double Average;


    CS102(double Midterm,double Quiz,double LabWorks, double Final){

        this.Midterm = Midterm;
        this.Quiz = Quiz;
        this.LabWorks = LabWorks;
        this.Final = Final;

    }

    public static void CS102_Grades(){
        System.out.println("What's your Midterm Grade ?");
        Midterm = scanner.nextDouble();
        System.out.println("What's your LabWorks Grade ?");
        LabWorks  = scanner.nextDouble();
        System.out.println("What's your Quiz Grade ?");
        Quiz = scanner.nextDouble();
        System.out.println("What's your Final Grade ?");
        Final = scanner.nextDouble();

        Average =(Midterm*0.3) + (Quiz*0.1) + (LabWorks*0.15) + (Final*0.45) ;


        try {
            FileWriter myWriter = new FileWriter("CS102.txt");
            myWriter.write("CS102 GRADES:"+ "\nMidterm Grade : "+ Midterm + "\nQuiz Grade: " + Quiz + "\nLabWorks Grade :" + LabWorks + "\nFinal Grade : "+ Final + "\nAverage Grade : " + Average);
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
            File grade = new File("CS102.txt");
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

