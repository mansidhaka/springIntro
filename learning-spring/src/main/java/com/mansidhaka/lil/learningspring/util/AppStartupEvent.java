package com.mansidhaka.lil.learningspring.util;

import com.mansidhaka.lil.learningspring.business.ReservationService;
import com.mansidhaka.lil.learningspring.business.RoomReservation;
import com.mansidhaka.lil.learningspring.data.*;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {
    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

     private final ReservationService reservationService;
     private final DateUtils dateUtils;


     public AppStartupEvent(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository, ReservationService reservationService, DateUtils dateUtils) {
         this.roomRepository = roomRepository;
         this.guestRepository = guestRepository;
         this.reservationRepository = reservationRepository;
         this.reservationService = reservationService;
         this.dateUtils = dateUtils;
     }

     @Override
    public void onApplicationEvent(ApplicationReadyEvent event){
        Iterable<Room> rooms= this.roomRepository.findAll();
        //rooms.forEach(System.out::println);
        Iterable<Guest> guests= this.guestRepository.findAll();
        //guests.forEach(System.out::println);
         Date date = this.dateUtils.createDateFromDateString("2022-01-01");
         List<RoomReservation> reservations = this.reservationService.getRoomReservationsForDate(date);
         reservations.forEach(System.out::println);
    }

}
