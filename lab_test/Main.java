public class Main {

    public static void main(String[] args) {

        String[] destinations1 = {
            "Low Earth",
            "Lunar",
            "Space Station",
            "Polar",
            "Equatorial"
        };

        String[] destinations2 = {
            "Mars",
            "Moon",
            "Venus",
            "Jupiter",
            "Saturn"
        };

        SpaceTourismCompany company1 = new SpaceTourismCompany(
            "OrbitVista",
            "2022-05-12",
            true,
            12,
            500000,
            20,
            destinations1
        );

        SpaceTourismCompany company2 = new SpaceTourismCompany(
            "GalaxyTrip",
            "2024-01-10",
            true,
            10,
            750000,
            15,
            destinations2
        );

        company1.bookSeats(3);

        company2.bookSeats(4);

        company1.bookSeats(20);
    }
}