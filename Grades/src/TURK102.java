import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TURK102 {

    static Scanner scanner = new Scanner(System.in);

    static double Midterm;
    static double Final;
    static double Average;


    TURK102(double Midterm, double Final){

        this.Midterm = Midterm;
        this.Final = Final;

    }

    public static void TURK102_Grades(){
        System.out.println("What's your Midterm Grade ?");
        Midterm = scanner.nextDouble();
        System.out.println("What's your Final Grade ?");
        Final = scanner.nextDouble();

        Average =(Midterm*0.4) + (Final*0.6) ;

        try {
            FileWriter myWriter = new FileWriter("TURK102.txt");
            myWriter.write("TURK102 GRADES:"+ "\nMidterm Grade : "+ Midterm + "\nFinal Grade : "+ Final + "\nAverage Grade : " + Average);
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
            File grade = new File("TURK102.txt");
            Scanner myReader = new Scanner(grade);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (Grades.que){
                    System.out.println(data);
                    if (i == 3){
                        System.out.println("**********************************************");
                        System.out.println();
                    }
                }
                i++;
                if (i == 4){
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




