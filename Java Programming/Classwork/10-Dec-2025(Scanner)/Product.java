import java.util.Scanner;

class Product
{
    int PId;
    String PName;
    int quantity;

    Product()
    {
        this.PId = 123;
        this.PName = "Honda";
        this.quantity = 45;

        System.out.println("default constructor get call" + "\n");
    }

    Product(int pi, String name, int q)
    {
        this.PId = pi;
        this.PName = name;
        this.quantity = q;

        System.out.println("\nparameterized constructor get call");
    }

    void setPId(int p) { this.PId = p; }
    void setPName(String p) { this.PName = p; }
    void setQuantity(int p) { this.quantity = p; }

    int getPId() { return this.PId; }
    String getPName() { return this.PName; }
    int getQuantity() { return this.quantity; }
}

class TestProduct
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Product P1 = new Product();
        P1.setPId(78);
        P1.setPName("Bajaj");
        P1.setQuantity(785);

        System.out.println("Product Id: " + P1.getPId());
        System.out.println("Product Name: " + P1.getPName());
        System.out.println("Product Quantity: " + P1.getQuantity());

        Product P2 = new Product(15, "Hero", 76);

        System.out.println("Product Id: " + P2.getPId());
        System.out.println("Product Name: " + P2.getPName());
        System.out.println("Product Quantity: " + P2.getQuantity());

        Product P3 = new Product();
        System.out.println("\nEnter details for 3rd Product:");

        System.out.print("Enter Product Id: ");
        P3.setPId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        P3.setPName(sc.nextLine());

        System.out.print("Enter Product Quantity: ");
        P3.setQuantity(sc.nextInt());

        System.out.println("\nProduct Id: " + P3.getPId());
        System.out.println("Product Name: " + P3.getPName());
        System.out.println("Product Quantity: " + P3.getQuantity());

        sc.close();
    }
}
