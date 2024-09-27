import java.awt.dnd.DropTarget;
import java.util.Scanner;

public class Medicine {
    private String medicineId;
    private String batchNumber;
    private String manufacturer;
    private Date expiryDate;
    private int quantity;
    private String name;
    private double price;
//    public int medicineCount = 0;



    public Medicine() {
    }

    public Medicine(String medicineId, String batchNumber, String manufacturer, Date expiryDate, int quantity, String name, double price) {
        this.medicineId = medicineId;
        this.batchNumber = batchNumber;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
//        medicineCount++;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInformation() {
        System.out.println("ID: "+ medicineId);
        System.out.println("Price: "+ price);
        System.out.println("Quantity: "+ quantity);
        System.out.println("Manufacturer: "+ manufacturer);
        System.out.println("Batch Number: "+ batchNumber);
        System.out.println("Expiry Date: "+ String.format("%s/%s/%s", expiryDate.getDay(), expiryDate.getMonth(), expiryDate.getYear()));
    }

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        medicineId = sc.next();
        price = sc.nextDouble();
        quantity = sc.nextInt();
        manufacturer = sc.next();
        batchNumber = sc.next();

    }

}
