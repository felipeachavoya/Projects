package CSCMatch2020;

import java.util.LinkedList;
import java.util.Scanner;
// I have no idea what Serializable does
import java.io.Serializable;

public class Interest extends Member implements Serializable {
    private String topic;
    private int level;

    public void Interest(String topic, int level) {
        Scanner in = new Scanner(System.in);

        System.out.print("Topic: ");
        this.topic = in.nextLine();

        System.out.println("Level (1 - 10): ");
        this.level = in.nextInt();

        in.close();
    }

    public void setTopic(String newTopic) {
        Scanner in = new Scanner(System.in);

        System.out.print("New Topic: ");
        newTopic = in.nextLine();
        this.topic = newTopic;

        in.close();
    }

    public void setLevel(int newLevel) {
        Scanner in = new Scanner(System.in);

        System.out.print("New Level (0 - 10): ");
        newLevel = in.nextInt();
        this.level = newLevel;

        in.close();
    }

    public String getTopic() {
        return topic;
    }

    public int getLevel() {
        return level;
    }

    public String toString() {
        return topic + ": " + level;
    }
}
