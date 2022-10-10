package Homework2.Entities;

public class Passenger {
    private String passengerName;
    private FlightType flightType;
    public Passenger(String passengerName, FlightType flightType) {
        this.passengerName = passengerName;
        this.flightType = flightType;

    }

    public FlightType flightType() {
        return flightType;
    }

    public String passengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }
}
