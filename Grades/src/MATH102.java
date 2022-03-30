import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MATH102 {

    static Scanner scanner = new Scanner(System.in);

    static double Quiz_Homework;
    static double Midterm;
    static double Final;
    static double Average;


    MATH102(double Midterm,double Homework, double Final){

        this.Midterm = Midterm;
        this.Quiz_Homework = Quiz_Homework;
        this.Final = Final;

    }

    public static void MATH102_Grades(){
        System.out.println("What's your Midterm Grade ?");
        Midterm = scanner.nextDouble();
        System.out.println("What's your Quiz_Homework Grade ?");
        Quiz_Homework = scanner.nextDouble();
        System.out.println("What's your Final Grade ?");
        Final = scanner.nextDouble();

        Average =(Midterm*0.3) + (Quiz_Homework*0.2) + (Final*0.4) ;

        try {
            FileWriter myWriter = new FileWriter("MATH102.txt");
            myWriter.write("MATH102 GRADES:"+ "\nMidterm Grade : "+ Midterm + "\nQuiz_Homework Grade :" + Quiz_Homework + "\nFinal Grade : "+ Final + "\nAverage Grade : " + Average);
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
            File grade = new File("MATH102.txt");
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




