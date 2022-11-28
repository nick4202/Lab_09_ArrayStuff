import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final int COUNT = 100;
        int[] dataPoints = new int[COUNT];
        Random r = new Random();
        for (int i = 0; i < COUNT; i++) {
            dataPoints[i] = 1 + r.nextInt(100);
        }

        for (int i = 0; i < COUNT; i++) {
            int currentDataPoint = dataPoints[i];
            System.out.print(currentDataPoint);
            if (i < COUNT - 1)
                System.out.print("|");
        }

        int sum = 0;
        for (int i = 0; i < COUNT; i++) {
            sum = sum + dataPoints[i];
        }

        double avg = (float) sum / COUNT;

        System.out.println("\nThe SUM of the random array dataPoints is: " + sum);
        System.out.println("The AVERAGE of the random array dataPoints is: " + avg);

        Scanner sc = new Scanner(System.in);
        int input = -1;

        do {
            System.out.println("Input an int value from 1 to 100:");
            input = sc.nextInt();
            if (input >= 1 || input <= 100) {
                break;
            }
            System.out.println("The input is not valid.Try aagin!");
        }
        while (true);

        int matchCount = 0;
        for (int i : dataPoints) {
            if (i == input)
                matchCount++;
        }

        System.out.println("INPUT " + input + " is found " + matchCount + " times in the dataPoints array.");

        input = -1;


        do {
            System.out.println("Input another int value from 1 to 100:");
            input = sc.nextInt();
            if (input >= 1 || input <= 100) {
                break;
            }
            System.out.println("The input is not valid.Try again!");
        }
        while (true);

        int firstMatchingIndex = -1;
        for (int i = 0; i < COUNT; i++) {
            if (dataPoints[i] == input) {
                firstMatchingIndex = i;
                break;
            }
        }
        if (firstMatchingIndex == -1) {
            System.out.println("The value " + input + " was NOT FOUND at dataPoints array.");
        } else {
            System.out.println("The value " + input + " was found at array index " + firstMatchingIndex);
        }


        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < COUNT; i++) {
            int currentData = dataPoints[i];
            if (currentData > max)
                max = currentData;
            if (currentData < min)
                min = currentData;
        }

        System.out.println("Minimum Value in the dataPoints = " + min);
        System.out.println("Maximum Value in the dataPoints = " + max);

        double[] dataPointsDouble = {5.75, 25.55, 57.65, 112.04, 225.08, 7.68};


        System.out.println("Average of dataPoints (double) is: " + getAverage(dataPointsDouble));

    }
        public static double getAverage (double[] values)
        {
            double sum = 0;
            double avg = 0;
            if (values != null && values.length != 0) {
                for (double d : values) {
                    sum = sum + d;
                }
                avg = sum / values.length;
            }
            return avg;
        }
}