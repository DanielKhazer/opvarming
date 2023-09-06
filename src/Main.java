import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        System.out.println("Hej med dig");
        Scanner tal = new Scanner(System.in);

        System.out.println("Indtast tal");

        String input = tal.next();

        list.add(Double.parseDouble(input));
        while (true){


        System.out.println("Indtast endnu et tal");

        input = tal.next();

        list.add(Double.parseDouble(input));

        Double udregnet = calculateSum(list);
        System.out.println("summen blev udregnet til " + udregnet);

        Double gennemsnit = udregnet / list.size();
        System.out.println("Gennemsnittet blev udregnet til " + gennemsnit);
        }
    }
    public static Double calculateSum(ArrayList<Double> list){
        Double sum = 0.0;
        for (int i = 0; i < list.size(); i++) {
        //kode her
            sum += list.get(i);
        }
        return sum;
    }
}
