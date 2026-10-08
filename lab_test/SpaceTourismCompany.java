public class SpaceTourismCompany {

    String companyName;
    String establishmentDate;
    boolean hasLaunchLicense;
    int availableSeats;
    double ticketPrice;
    int totalFlights;
    String[] recentDestinations;

    public SpaceTourismCompany(String companyName, String establishmentDate,
                               boolean hasLaunchLicense, int availableSeats,
                               double ticketPrice, int totalFlights,
                               String[] recentDestinations) {

        this.companyName = companyName;
        this.establishmentDate = establishmentDate;
        this.hasLaunchLicense = hasLaunchLicense;
        this.availableSeats = availableSeats;
        this.ticketPrice = ticketPrice;
        this.totalFlights = totalFlights;
        this.recentDestinations = recentDestinations;
    }

    public void bookSeats(int seats) {

        if (hasLaunchLicense == false) {
            System.out.println("Error: Launch license is not available.");
        }
        else if (seats <= 0) {
            System.out.println("Error: Invalid number of seats.");
        }
        else if (seats > availableSeats) {
            System.out.println("Error: Not enough seats available.");
        }
        else {
            double cost = seats * ticketPrice;

            availableSeats = availableSeats - seats;

            System.out.println("Company: " + companyName);
            System.out.println("Booking Cost: " + cost);
            System.out.println("Remaining Seats: " + availableSeats);
        }
    }
}