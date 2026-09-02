import java.util.Scanner;

class DayOfYear {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        int totalDays = day;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonths[i];
        }
        
        if (month > 2 && isLeap) {
            totalDays++;
        }
        
        return totalDays;
    }
    public static void main(String[] args) {
        DayOfYear solver = new DayOfYear();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date in YYYY-MM-DD format (e.g., 2024-03-01): ");
        String inputDate = scanner.next();

        int result = solver.dayOfYear(inputDate);
        System.out.println("Day of the year: " + result);

        scanner.close();
    }
}
