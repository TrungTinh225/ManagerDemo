import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<String> productList = new ArrayList<>();
    Scanner inputNumber = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("=========== My store ==========");
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Remove");
            System.out.println("4. Show All");
            System.out.println("5. Search");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice: ");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    showProductList();
                    break;
                case 0:
                    System.out.println("Good Bye!");
            }
        } while (choice != 0);
    }

    public void addProduct() {
        System.out.println("===== Add Menu =====");
        System.out.println("Enter product name: ");
        String productName = inputString.nextLine();
        productList.add(productName);
        System.out.println("Add complete");
    }

    public void showProductList() {
        int index = 1;
        System.out.println("======== Products List ========");
        for (String productName : productList) {
            System.out.println(index+ ". " +productName);
            index++;
        }
    }

    public void updateProduct() {
        System.out.println("===== Edit Menu ======");
        System.out.println("Enter product name: ");
        String productName = inputString.nextLine();
        int updateIndex = productList.indexOf(productName);
        if (updateIndex == -1) {
            System.out.println("Product doesn't exist!");
        }
        else {
            System.out.println("Enter new product name: ");
            String newProductName = inputString.nextLine();
            productList.set(updateIndex, newProductName);
        }
        System.out.println("Update complete");

    }

    public void removeProduct() {
        System.out.println("===== Remove Menu ======");
        System.out.println("Enter product name: ");
        String productName = inputString.nextLine();
        int removeIndex = productList.indexOf(productName);
        if (removeIndex == -1) {
            System.out.println("Product doesn't exist!");
        }else {
            productList.remove(removeIndex);
        }
        System.out.println("Remove completed");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showMainMenu();
    }
}
