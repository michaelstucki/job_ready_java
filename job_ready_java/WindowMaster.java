package job_ready_java;

import java.util.Scanner;

public class WindowMaster {

    static final double GLASS_COST_SQFT = 3.5;
    static final double TRIM_COST_LF = 2.25;

    static double getDimension(Scanner scanner, String dimension) {
        boolean isValid = false;
        double value = 0;
        do {
            System.out.print("Enter widow " + dimension + ": ");
            try {
                String valueStr = scanner.nextLine();
                value = Double.parseDouble(valueStr);
                isValid = true;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input!");
            }
        } while(!isValid);
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double windowHeight = getDimension(scanner, "height");
        double windowWidth = getDimension(scanner, "width");
        double windowArea = windowHeight * windowWidth;
        double windowPerimeter = (windowHeight + windowWidth) * 2;
        double windowCost = windowArea * GLASS_COST_SQFT + windowPerimeter * TRIM_COST_LF;
        System.out.println("Window Details");
        System.out.println("Height (ft): " + windowHeight);
        System.out.println("Width (ft): " + windowWidth);
        System.out.println("Area (sqft): " + windowArea);
        System.out.println("Perimeter (ft): " + windowPerimeter);
        System.out.println("Total cost: $" + windowCost);
        scanner.close();
    }
}
