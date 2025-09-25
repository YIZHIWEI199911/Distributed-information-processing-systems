
//Create a program that:
//    Reads the meal the customer wants
//    Prints the cost of the meal
//    Input example: "Hot Dog"
//    Output: "Hot Dog 1,50$"
//
//
//Create a program tha
//读取顾客想要的餐点
//打印餐费
//输入示例：“热狗”
//输出：“热狗 1.5 美元”
//
//创建一个程序
import java.util.Scanner;

public class fourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read the meal input from the customer
            System.out.print("Enter the meal you want: ");
            String meal = scanner.nextLine().trim(); // Remove extra spaces

            // Define meal prices
            double price = 0.0;
            boolean isValidMeal = true;

            // Determine price based on meal
            switch (meal) {
                case "Burger":
                    price = 5.00;
                    break;
                case "Pizza":
                    price = 3.00;
                    break;
                case "Hot Dog":
                    price = 1.50;
                    break;
                default:
                    isValidMeal = false;
                    break;
            }

            // Display result or error message
            if (isValidMeal) {
                // Format price with 2 decimal places and replace . with ,
                String formattedPrice = String.format("%.2f", price).replace('.', ',');
                System.out.printf("\"%s %s$\"%n", meal, formattedPrice);
            } else {
                System.out.println("\"Invalid meal. Available meals: Burger, Pizza, Hot Dog\"");
            }

        } catch (Exception e) {
            System.out.println("\"Error: Please enter a valid meal name\"");
        } finally {
            scanner.close();
        }
    }
}
