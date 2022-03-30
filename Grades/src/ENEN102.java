import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class ENEN102 {

    static Scanner scanner = new Scanner(System.in);

    static double Midterm;
    static double Assignment;
    static double Participation;
    static double Final;
    static double Average;

    ENEN102(double Midterm,double Assignment,double Participation, double Final){

        this.Midterm = Midterm;
        this.Assignment = Assignment;
        this.Participation = Participation;
        this.Final = Final;
    }

    public static void ENEN102_Grades(){
        System.out.println("What's your Midterm Grade ?");
        Midterm = scanner.nextDouble();
        System.out.println("What's your Assignment Grade ?");
        Assignment  = scanner.nextDouble();
        System.out.println("What's your Participation Grade ?");
        Participation = scanner.nextDouble();
        System.out.println("What's your Final Grade ?");
        Final = scanner.nextDouble();

        Average =(Midterm*0.3) + (Participation*0.15) + (Assignment*0.15) + (Final*0.4) ;


        try {
            FileWriter myWriter = new FileWriter("ENEN102.txt");
            myWriter.write("ENEN102 GRADES:"+ "\nMidterm Grade : "+ Midterm + "\nAssignment Grade: " + Assignment + "\nParticipation Grade :" + Participation + "\nFinal Grade : "+ Final + "\nAverage Grade : " + Average);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static String Grades(){
        int i = 0;
        try {
            File grade = new File("ENEN102.txt");
            Scanner myReader = new Scanner(grade);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (Grades.que){
                    System.out.println(data);
                    if (i == 5){
                        System.out.println("**********************************************");
                        System.out.println();
                    }
                }
                i++;
                if (i == 6){
                    Average = GPA.string_stripper(data);
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }return "\nComeback Later";

    }

}


