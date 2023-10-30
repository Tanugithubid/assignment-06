import java.io.*;
import java.util.Scanner;

abstract class Indore {
    abstract void area(String file_path);
}

//using costructor to initialize the variables use in the main method
class Tourism {

    //declaration of variables

    String file_path;
    String file_path1;
    long desiredPosition;
    long currentPosition;
    long desiredPosition1;
    long currentPosition1;

    //constructor

    Tourism(String file_path, String file_path1, long desiredPosition, long currentPosition, long desiredPosition1, long currentPosition1) {
        this.file_path = file_path;
        this.file_path1 = file_path1;
        this.desiredPosition = desiredPosition;
        this.currentPosition = currentPosition;
        this.desiredPosition1 = desiredPosition1;
        this.currentPosition1 = currentPosition1;
    }


    //method in the class to read the files and print data in the file according to the requirement

    public void area() {
        try {
            // Open the files for reading
            RandomAccessFile reader1 = new RandomAccessFile(file_path, "r");
            RandomAccessFile reader2 = new RandomAccessFile(file_path1, "r");

            // Read and print content up to the desired position
            String line1=null;
            String line2=null;

            while ((currentPosition < desiredPosition || currentPosition1 < desiredPosition1) &&
                    ((line1 = reader1.readLine()) != null || (line2 = reader2.readLine()) != null)) {
                if (line1 != null) {
                    System.out.println("File 1: " + line1);
                    currentPosition += line1.length() + 1; // Add 1 for newline character
                }
                if (line2 != null) {
                    System.out.println("File 2: " + line2);
                    currentPosition1 += line2.length() + 1;
                }
            }

            // Close the file1
            // Close the file2
            reader1.close();
            reader2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Mainproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your category: (purpose/purpose+area /area)");
        String known_category = sc.next();
        String file_path = "";
        String file_path1 = "";
        long desiredPosition = 0;
        long desiredPosition1 = 0;
        long currentPosition = 0;
        long currentPosition1 = 0;

    //varios cases include in the code that is you know purpose why you came to any city,
     //you knw only area nwme of city indore in which you want to roam ,
    //you  know both purpose  and area about that city
        if (known_category.equals("purpose")) {
            System.out.println("Enter purpose (shopping_area/hotels/food_hubs/education): ");
            String purpose = sc.next();
            if (purpose.equals("shopping_area")) {
                file_path = "D:\\project\\1. sardar vallabh bhai.txt";
                desiredPosition = 42;
                currentPosition = 22;
                file_path1 = "D:\\project\\1. maharaj chhatrasa.txt";
                desiredPosition1 = 6;
                currentPosition1 = 00;
            } else if (purpose.equals("hotels")) {
                file_path = "D:\\project\\1. sardar vallabh bhai.txt";
                desiredPosition = 10;
                currentPosition = 5;
                file_path1 =  "D:\\project\\1. maharaj chhatrasa.txt";
                desiredPosition1 = 10;
                currentPosition1 = 4;
            } else if (purpose.equals("food_hubs")) {
                file_path = "D:\\project\\1. sardar vallabh bhai.txt";
                desiredPosition = 10;
                currentPosition = 4;
                file_path1 =  "D:\\project\\1. maharaj chhatrasa.txt";
                desiredPosition1 = 10;
                currentPosition1 = 6;
            } else if (purpose.equals("education")) {
                file_path = "D:\\project\\1. sardar vallabh bhai.txt";
                desiredPosition = 10;
                currentPosition = 2;
                file_path1 =  "D:\\project\\1. maharaj chhatrasa.txt";
                desiredPosition1 = 10;
                currentPosition1 = 2;
            }
        } else if (known_category.equals("purpose+area")) {
            System.out.println("Enter area name: (sardar_vallabh_bhai/maharaj_chhatrasa) ");
            String cityName = sc.next();
            System.out.println("Enter purpose (shopping_area/hotels/food_hubs/education): ");
            String purpose = sc.next();
            if (cityName.equals("sardar_vallabh_bhai")) {
                if (purpose.equals("shopping_area")) {
                    file_path = "D:\\project\\1. sardar vallabh bhai.txt";
                    desiredPosition = 22;
                    currentPosition = 01;
                    file_path1="D:\\project\\blankfile.txt";
                desiredPosition1 = 20;
                currentPosition1 = 0;
                } else if (purpose.equals("hotels")) {
                    file_path = "D:\\project\\1. sardar vallabh bhai.txt";
                    desiredPosition = 10;
                    currentPosition = 3;
                    file_path1="D:\\project\\blankfile.txt";
                desiredPosition1 = 20;
                currentPosition1 = 0;
                } else if (purpose.equals("food_hubs")) {
                    file_path = "D:\\project\\1. sardar vallabh bhai.txt";
                    desiredPosition = 10;
                    currentPosition = 2;
                    file_path1="D:\\project\\blankfile.txt";
                desiredPosition1 = 20;
                currentPosition1 = 0;
                } else if (purpose.equals("education")) {
                    file_path = "D:\\project\\1. sardar vallabh bhai.txt";
                    desiredPosition = 10;
                    currentPosition = 4;
                    file_path1="D:\\project\\blankfile.txt";
                desiredPosition1 = 20;
                currentPosition1 = 0;
                }
            } else if (cityName.equals("maharaj_chhatrasa")) {
                if (purpose.equals("shopping_area")) {
                    file_path = "D:\\project\\1. maharaj chhatrasa.txt";
                    desiredPosition = 10;
                    currentPosition = 3;
                    file_path1="D:\\project\\blankfile.txt";
                desiredPosition1 = 10;
                currentPosition1 = 0;
                } else if (purpose.equals("hotels")) {
                    file_path = "D:\\project\\1. maharaj chhatrasa.txt";
                    desiredPosition = 10;
                    currentPosition = 4;
                    file_path1="D:\\project\\blankfile.txt";
                desiredPosition1 = 10;
                currentPosition1 = 0;
                } else if (purpose.equals("food_hubs")) {
                    file_path = "D:\\project\\1. maharaj chhatrasa.txt";
                    desiredPosition = 10;
                    currentPosition = 5;
                    file_path1="D:\\project\\blankfile.txt";
                desiredPosition1 = 10;
                currentPosition1 = 0;
                } else if (purpose.equals("education")) {
                    file_path = "D:\\project\\1. maharaj chhatrasa.txt";
                    desiredPosition = 10;
                    currentPosition = 5;
                    file_path1="D:\\project\\blankfile.txt";
                desiredPosition1 = 20;
                currentPosition1 = 0;
                }
            }
        } else if (known_category.equals("area")) {
            System.out.println("Enter city name: (sardar_vallabh_bhai/maharaj_chhatrasa)");
            String cityName = sc.next();
            if (cityName.equals("sardar_vallabh_bhai")) {
                file_path = "D:\\project\\1. sardar vallabh bhai.txt";
                desiredPosition = 400;
                currentPosition = 0;
                file_path1="D:\\project\\blankfile.txt";
                desiredPosition1= 40;
                currentPosition1 = 0;

            } else if (cityName.equals("maharaj_chhatrasa")) {
                file_path = "D:\\project\\1. maharaj chhatrasa.txt";
                desiredPosition = 400;
                currentPosition = 0;
                file_path1="D:\\project\\blankfile.txt";
                desiredPosition1 = 40;
                currentPosition1 = 0;
            }
        }

        Tourism obj1 = new Tourism(file_path, file_path1, desiredPosition, currentPosition, desiredPosition1, currentPosition1);
        obj1.area();
    }
}
