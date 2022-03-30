import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 'access' to access your grades, Type 'modify' to modify your grades: ");
        String actions = scanner.nextLine();
        System.out.println("Type in the lesson you want to access or modify: ");
        System.out.println("Lessons available:\nENEN102\nCS102\nPHYS102\nBIO102\nGEN401\nMATH102\nTURK102\nPHYS102L\n**********************************");
        String lesson = scanner.nextLine();


        switch (actions) {
            case ("modify") -> modify(lesson);
            case ("access") -> access(lesson);
            default -> System.out.println("Error");
        }

        System.out.println("Press 'q' to quit, 'r' to run again");
        char press = scanner.next().charAt(0);

        if (press == 'r'){
            Grades.main(null);
        }
    }

    static void access(String lesson) {
        switch (lesson) {
            case ("ENEN102") -> System.out.println(ENEN102.Grades());
            case ("CS102") -> System.out.println(CS102.Grades());
            case ("PHYS102") -> System.out.println(PHYS102.Grades());
            case ("BIO102") -> System.out.println(BIO102.Grades());
            case ("GEN401") -> System.out.println(GEN401.Grades());
            case ("MATH102") -> System.out.println(MATH102.Grades());
            case ("TURK102") -> System.out.println(TURK102.Grades());
            case ("PHYS102L") -> System.out.println(PHYS102L.Grades());
            default -> System.out.println("Error");
        }
    }

    static void modify(String lesson){
        switch (lesson) {
            case ("ENEN102") -> ENEN102.ENEN102_Grades();
            case ("CS102") -> CS102.CS102_Grades();
            case ("PHYS102") -> PHYS102.PHYS102_Grades();
            case ("BIO102") -> BIO102.BIO102_Grades();
            case ("GEN401") -> GEN401.GEN401_Grades();
            case ("MATH102") -> MATH102.MATH102_Grades();
            case ("TURK102") -> TURK102.TURK102_Grades();
            case ("PHYS102L") -> PHYS102L.PHYS102L_Grades();
            default -> {
            }
        }
    }


}
