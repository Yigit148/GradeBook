public class GPA {
    static double string_stripper(String str){
        String new_str = str.replaceAll("[^\\d-]", "");
        double new_double =Double.parseDouble(new_str);
        return new_double/10;
    }
}

