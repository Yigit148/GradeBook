import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PHYS102L {

    static Scanner scanner = new Scanner(System.in);

    static double Quiz;
    static double Performance;
    static double Report;
    static double Average;


    PHYS102L(double Performance,double Quiz, double Report){

        this.Performance = Performance;
        this.Quiz = Quiz;
        this.Report = Report;


    }

    public static void PHYS102L_Grades(){
        System.out.println("What's your Performance Grade ?");
        Performance = scanner.nextDouble();
        System.out.println("What's your Quiz Grade ?");
        Quiz = scanner.nextDouble();
        System.out.println("What's your Report Grade ?");
        Report = scanner.nextDouble();

        Average =(Report*0.5) + (Quiz*0.3) + (Performance*0.2) ;

        try {
            FileWriter myWriter = new FileWriter("PHYS102L.txt");
            myWriter.write("PHYS102L GRADES:"+ "\nPerformance Grade : "+ Performance + "\nQuiz Grade :" + Quiz + "\nReport Grade : "+ Report + "\nAverage Grade : " + Average);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



    }

    public static String Grades(){
        try {
            int i = 0;
            File grade = new File("PHYS102L.txt");
            Scanner myReader = new Scanner(grade);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (Grades.que){
                    System.out.println(data);
                    if (i == 4){
                        System.out.println("**********************************************");
                        System.out.println();
                    }
                }
                i++;
                if (i == 5){
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




