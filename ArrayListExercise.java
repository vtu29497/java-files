import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int n = scan.nextInt();

        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = scan.nextInt(); 
            ArrayList<Integer> row = new ArrayList<>();
            
            for (int j = 0; j < d; j++) {
                row.add(scan.nextInt());
            }
            lines.add(row); 
        }

        System.out.print("Enter number of queries: ");
        int q = scan.nextInt();

        System.out.println("\n--- Results ---");
       
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt(); 
            int y = scan.nextInt(); 

            int lineIndex = x - 1;
            int posIndex = y - 1;

            if (lineIndex >= 0 && lineIndex < lines.size() && 
                posIndex >= 0 && posIndex < lines.get(lineIndex).size()) {
                
                System.out.println(lines.get(lineIndex).get(posIndex));
            } else {
                System.out.println("ERROR!");
            }
        }

        scan.close();
    }
}
