import java.util.Scanner;

class DayOfWeek { 
    public String dayOfTheWeek(int day, int month, int year) { 
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}; 
        
        if (month < 3) { 
            month += 12; 
            year -= 1; 
        } 
        
        int K = year % 100; 
        int J = year / 100; 
        int h = (day + 13 * (month + 1) / 5 + K + K / 4 + J / 4 + 5 * J) % 7; 
        int index = (h + 6) % 7; 
        
        return week[index]; 
    } 

    public static void main(String[] args) {
        DayOfWeek solver = new DayOfWeek();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        String result = solver.dayOfTheWeek(day, month, year);
        System.out.println("The day of the week is: " + result);

        scanner.close();
    }
}
