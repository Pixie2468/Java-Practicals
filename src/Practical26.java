class Vehicle {
    int NoOfWheels;

    public Vehicle(int NoOfWheels) {
        this.NoOfWheels = NoOfWheels;
    }
}

class TwoWheeler extends Vehicle {
    String VehicleNo;
    String brand;

    public TwoWheeler(int NoOfWheels, String VehicleNo, String brand) {
        super(NoOfWheels);
        this.VehicleNo = VehicleNo;
        this.brand = brand;
    }
}

class Bike extends TwoWheeler {
    String model;
    int mileage;
    int cc;

    public Bike(int NoOfWheels, String VehicleNo, String brand, String model, int mileage, int cc) {
        super(NoOfWheels, VehicleNo, brand);
        this.model = model;
        this.mileage = mileage;
        this.cc = cc;
    }

    public void display() {
        System.out.println("Number of Wheels: " + NoOfWheels);
        System.out.println("Vehicle Number: " + VehicleNo);
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Model: " + model);
        System.out.println("Mileage per Km: " + mileage);
        System.out.println("Vehicle CC: " + cc);
    }
}

class Scooty extends TwoWheeler {
    String model;
    String iselectric;
    int cc;

    public Scooty(int NoOfWheels, String VehicleNo, String brand, String model, String iselectric, int cc) {
        super(NoOfWheels, VehicleNo, brand);
        this.model = model;
        this.iselectric = iselectric;
        this.cc = cc;
    }

    public void display() {
        System.out.println("\nNumber of Wheels: " + NoOfWheels);
        System.out.println("Vehicle Number: " + VehicleNo);
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Model: " + model);
        System.out.println("Is Electric [Yes/No]: " + iselectric);
        System.out.println("Vehicle CC: " + cc);
    }
}

class FourWheeler extends Vehicle {
    String VehicleNo;
    String brand;

    public FourWheeler(int NoOfWheels, String VehicleNo, String brand) {
        super(NoOfWheels);
        this.VehicleNo = VehicleNo;
        this.brand = brand;
    }
}

class electricfw extends FourWheeler {
    String model;
    int mileage;
    int airbags;

    public electricfw(int NoOfWheels, String VehicleNo, String brand, String model, int mileage, int airbags) {
        super(NoOfWheels, VehicleNo, brand);
        this.model = model;
        this.mileage = mileage;
        this.airbags = airbags;
    }

    public void display() {
        System.out.println("\nNumber of Wheels: " + NoOfWheels);
        System.out.println("Vehicle Number: " + VehicleNo);
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Model: " + model);
        System.out.println("Mileage per Charge: " + mileage);
        System.out.println("Number of Airbags: " + airbags);
    }
}

class nonelectricfw extends FourWheeler {
    String model;
    String fueltype;
    int airbags;

    public nonelectricfw(int NoOfWheels, String VehicleNo, String brand, String model, String fueltype, int airbags) {
        super(NoOfWheels, VehicleNo, brand);
        this.model = model;
        this.fueltype = fueltype;
        this.airbags = airbags;
    }

    public void display() {
        System.out.println("\nNumber of Wheels: " + NoOfWheels);
        System.out.println("Vehicle Number: " + VehicleNo);
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Model: " + model);
        System.out.println("Fuel Type: " + fueltype);
        System.out.println("Number of Airbags: " + airbags);
    }
}

public class Practical26 {
    public static void main(String[] args) {
        Bike v1 = new Bike(2, "GJ06AB1111", "Yamaha", "YZF R15 V4", 80, 250);
        v1.display();
        Scooty v2 = new Scooty(2, "GJ06CD2222", "Honda", "Activa 5G", "No", 150);
        v2.display();
        electricfw v3 = new electricfw(4, "GJ06KH3333", "Maruti Suzuki", "DZire", 50, 4);
        v3.display();
        nonelectricfw v4 = new nonelectricfw(4, "GJ06RT5555", "Mahindra", "XUV700", "Petrol", 4);
        v4.display();
    }
}
