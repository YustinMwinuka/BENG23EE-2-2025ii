//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // InventoryItem.java
    public class InventoryItem {
        private String itemCode;
        private String itemName;
        private int quantity;
        private String category;
        private String location;

        public InventoryItem(String itemCode, String itemName, int quantity, String category, String location) {
            this.itemCode = itemCode;
            this.itemName = itemName;
            this.quantity = quantity;
            this.category = category;
            this.location = location;
        }

        public void displayInfo() {
            System.out.println("Item Code: " + itemCode);
            System.out.println("Item Name: " +

                    itemName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Category: " + category);
            System.out.println("Location: " + location);
            System.out.println("----------------------------");
        }
    }
// InventoryTest.java (Main Program)
import java.util.ArrayList;

    public class InventoryTest {
        public static void main(String[] args) {
            ArrayList<InventoryItem> items = new ArrayList<>();

            // Sample data (You can change or input via UI later)
            InventoryItem item1 = new InventoryItem("EQ001", "Transformer", 10, "Electrical Equipment", "Warehouse A");
            InventoryItem item2 = new InventoryItem("SP005", "Circuit Breaker", 50, "Spare Part", "Warehouse B");

            items.add(item1);
            items.add(item2);

            // Display all items
            for (InventoryItem item : items) {
                item.displayInfo();
            }
        }
    }


