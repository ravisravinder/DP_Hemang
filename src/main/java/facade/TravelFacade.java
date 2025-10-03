package facade;

public class TravelFacade {
    CarRental carRental;
    FlightBooking flightBooking;
    HotelBooking hotelBooking;

    public TravelFacade() {
       carRental = new CarRental();
       flightBooking = new FlightBooking();
       hotelBooking = new HotelBooking();
    }
    public void bookTrip(String destination, String hotelName, String carType){
        flightBooking.bookFlight(destination);
        hotelBooking.bookHotel(hotelName);
        carRental.rentCar(carType);
        System.out.println("Trip booked successfully");
    }
}
