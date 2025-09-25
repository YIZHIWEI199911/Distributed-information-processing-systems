//A fast food chain has these meals
//	Meal 		Price
//	Burger 		5$
//	Pizza 		3$
//	Hot Dog 	1,5$

//一家快餐连锁店提供以下餐点
//餐点价格
//汉堡 5 美元
//披萨 3 美元
//热狗 1.5 美元
//创建一个程序：

import java.util.Scanner;

public class thirteen {
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

