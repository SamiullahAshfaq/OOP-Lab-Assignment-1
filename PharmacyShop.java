import java.util.*;
public class PharmacyShop {
    private Address address;
    private Medicine[] medicines = new Medicine[2];
    private Person owner;

    public PharmacyShop() {
    }

    {
        medicines[0] =  new Medicine("M001", "B123", "PharmaCorp", new Date(15, 8, 2025), 100, "Paracetamol", 50.0);
        medicines[1] = new Medicine("M002", "B124", "HealthMed", new Date(10, 12, 2024), 80, "Ibuprofen", 75.0);
    }

    public PharmacyShop(Address address, int medicineCount, Person owner) {
        this.address = address;
        this.medicines = medicines;
        this.owner = owner;
    }

    public int searchMedicineById(String medicineId) {
        boolean found = false;
        int index = -1;
        for (int i = 0; i < medicines.length; i++) {
            if (medicineId.equals(medicines[i].getMedicineId())) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
        return index;
    }

    public void updateMedicine(String medicineId) {
        int found = searchMedicineById(medicineId);
        if (found != -1) {
            medicines[found] = new Medicine();
        }

    }

    public void searchMedicineByName(String name) {
        boolean found = false;
        for (int i = 0; i < medicines.length; i++) {
            if (name.equals(medicines[i].getName())) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Medicine Found");
        } else {
            System.out.println("Medicine Not found");
        }
    }
    public void printTotalRevenue() {

    }

    public void findExpiredMedicines(Date date) {

    }

    public void removeMedicine(String medicineId) {

    }

    public void sellMedicine(String medicineId, int quantity) {

    }
    public void addMedicine(Medicine medicine) {

    }
    public void displayMedicines() {
        for (int i = 0; i < medicines.length; i++) {
            System.out.println();
            medicines[i].displayInformation();
        }
    }


}
