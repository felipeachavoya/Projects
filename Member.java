package CSCMatch2020;

import java.util.LinkedList;
import java.util.Scanner;
// I have no idea what Serializable does
import java.io.Serializable;

public class Member extends Membership implements Serializable {
    private String name;
    private int year;
    private LinkedList<Interest> topics = new LinkedList<Interest>();

    // Runs when a member is created.
    public void Member()   {
        Scanner in = new Scanner(System.in);
        // Initial name --- MUST BE UNIQUE
        System.out.print("Name: ");
        this.name = in.nextLine();
        // Initial year
        System.out.print("Year: ");
        this.year = in.nextInt();
        in.close();
    }

    // Modifies name String --- MUST BE UNIQUE
    public void setName(String newName) {

        Scanner in = new Scanner(System.in);

        System.out.print("Name: ");
        newName = in.nextLine();
        this.name = newName;

        in.close();
    }

    // Modifies year int
    public void setYear(int newYear) {

        Scanner in = new Scanner(System.in);

        System.out.println("Year (1 - 5): ");
        newYear = in.nextInt();
        this.year = newYear;

        in.close();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return year + " - " + name;
    }

    public void addInterest(Interest interest) {
        interest = new Interest();
        interest = interest.Interest();
        topics.add(interest);
    }
}
