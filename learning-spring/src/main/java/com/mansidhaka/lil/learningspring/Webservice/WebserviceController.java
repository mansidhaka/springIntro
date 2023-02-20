package com.mansidhaka.lil.learningspring.Webservice;

import com.mansidhaka.lil.learningspring.business.ReservationService;
import com.mansidhaka.lil.learningspring.business.RoomReservation;
import com.mansidhaka.lil.learningspring.data.Guest;
import com.mansidhaka.lil.learningspring.data.Room;
import com.mansidhaka.lil.learningspring.util.DateUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WebserviceController {
    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    public WebserviceController(DateUtils dateUtils, ReservationService reservationService) {
        this.dateUtils = dateUtils;
        this.reservationService = reservationService;
    }
    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<RoomReservation> getReservations(@RequestParam(value = "date", required = false) String dateString){
      Date date =  this.dateUtils.createDateFromDateString(dateString);
      return this.reservationService.getRoomReservationsForDate(date);
    }
    @GetMapping("/guests")
    public List<Guest> getGuests(){
        return this.reservationService.getHotelGuests();
    }
    @GetMapping("/rooms")
    public List<Room> getRooms()
    {
        return this.reservationService.getRooms();
    }
    @PostMapping("/guests")
    @ResponseStatus(HttpStatus.CREATED)
    public void addGuest(@RequestBody Guest guest){
        this.reservationService.addGuest(guest);
    }
}
