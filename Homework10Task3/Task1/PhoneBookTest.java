package ua.goit.polymorpism.Module10.Streams.HomeworkGeneral.Homework10Task3.Task1;

import java.io.*;

public class PhoneBookTest {
    private static String FILE_PATH;
    public static void main(String[] args)  {

        File file = new File(FILE_PATH);

        System.out.println("Here is our phonebook :");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String text = bufferedReader.readLine();
            while (text!=null) {
              boolean result = defineIfValid(text);
                if(result==true){
                    System.out.println(text);
                }
                text = bufferedReader.readLine();
            }


        }catch (IOException e){
            System.err.println("ERROR"+e.getMessage());
        }
    }
    public static boolean defineIfValid(String text) {
        boolean isValid = text.matches("\\(\\d{3}\\) \\d{3}-\\d{4}") || text.matches("\\d{3}-\\d{3}-\\d{4}");
        return isValid;
    }
}
