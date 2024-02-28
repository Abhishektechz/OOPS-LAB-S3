import java.util.Vector;

class ReservationSystem {
    private Vector<String> flightReservations;
    private Vector<String> hotelReservations;

    public ReservationSystem() {
        flightReservations = new Vector<>();
        hotelReservations = new Vector<>();
    }

    public void searchFlights(String query) {
        System.out.println("Searching for flights: " + query);
        // Perform flight search logic here
    }

    public void bookFlight(String flightDetails) {
        flightReservations.add(flightDetails);
        System.out.println("Flight booked: " + flightDetails);
    }

    public void cancelFlightReservation(String flightDetails) {
        if (flightReservations.contains(flightDetails)) {
            flightReservations.remove(flightDetails);
            System.out.println("Flight reservation canceled: " + flightDetails);
        } else {
            System.out.println("Flight reservation not found.");
        }
    }

    public void searchHotels(String query) {
        System.out.println("Searching for hotels: " + query);
        // Perform hotel search logic here
    }

    public void bookHotel(String hotelDetails) {
        hotelReservations.add(hotelDetails);
        System.out.println("Hotel booked: " + hotelDetails);
    }

    public void cancelHotelReservation(String hotelDetails) {
        if (hotelReservations.contains(hotelDetails)) {
            hotelReservations.remove(hotelDetails);
            System.out.println("Hotel reservation canceled: " + hotelDetails);
        } else {
            System.out.println("Hotel reservation not found.");
        }
    }
}

public class Reservation {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();

        reservationSystem.searchFlights("New York to London");
        reservationSystem.bookFlight("Flight ABC123");
        reservationSystem.searchHotels("London");
        reservationSystem.bookHotel("Hotel XYZ");
        reservationSystem.cancelFlightReservation("Flight ABC123");
        reservationSystem.cancelHotelReservation("Hotel XYZ");
    }
}
