import java.util.Scanner;

class Date
{
    int day, month, year;
    String dow;

    Date()
    {
        this.day = 16;
        this.month = 11;
        this.year = 2016;
        this.dow = "Tuesday";

        System.out.println("\ndefault constructor get call");
    }

    Date(int d, int m, int y, String str)
    {
        this.day = d;
        this.month = m;
        this.year = y;
        this.dow = str;

        System.out.println("parameterized constructor get call");
    }

    void setDay(int d) { this.day = d; }
    void setMonth(int m) { this.month = m; }
    void setYear(int y) { this.year = y; }
    void setDow(String str) { this.dow = str; }

    int getDay() { return this.day; }
    int getMonth() { return this.month; }
    int getYear() { return this.year; }
    String getDow() { return this.dow; }

    void display()
    {
        System.out.println("\n" + day + "/" + month + "/" + year + "\nDay is: " + dow);
    }
}

class TestDate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Date D1 = new Date();
        D1.setDay(4);
        D1.setMonth(11);
        D1.setYear(2023);
        D1.setDow("Tuesday");

        D1.display();

        Date D2 = new Date(1, 1, 2025, "Wednesday");
        D2.display();

        Date D3 = new Date();
        System.out.println("\nEnter details for 3rd Date:");

        System.out.print("Enter Day: ");
        D3.setDay(sc.nextInt());

        System.out.print("Enter Month: ");
        D3.setMonth(sc.nextInt());

        System.out.print("Enter Year: ");
        D3.setYear(sc.nextInt());
        sc.nextLine(); // consume newline

        System.out.print("Enter Day of Week: ");
        D3.setDow(sc.nextLine());

        D3.display();

        sc.close();
    }
}
