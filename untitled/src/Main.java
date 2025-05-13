// Parent class
class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

// Child class 1
class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

// Child class 2
class ICICI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

// Child class 3
class AXIS extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

// Main class
class Test2 {
    public static void main(String[] args) {
        Bank b;  // Bank reference

        b = new SBI();  // points to SBI object
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());

        b = new ICICI();  // points to ICICI object
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());

        b = new AXIS();  // points to AXIS object
        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
}
}