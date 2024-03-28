import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        // Dosya okuma
        try (BufferedReader myBfReader = new BufferedReader(new FileReader("C:\\Users\\Userr\\IdeaProjects\\readNumbers\\src\\myFile.txt"))) {
       //String tipinde yeni değişken tanımlanıp her okunan satır bu değişkene atanır.
            String line;
            while((line = myBfReader.readLine()) != null){
                int intLine = Integer.parseInt(line);
                sum += intLine;
            }
            myBfReader.close();
            System.out.println("Dosyadan okunan sayıların toplamı: " + sum);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}