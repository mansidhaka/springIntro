package com.mansidhaka.lil.learningspring.data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id //annotations
    @GeneratedValue(strategy = GenerationType.AUTO) // default for generated value
    @Column(name ="RESERVATION_ID") //Keep it same as schema
    private long reservationid;
    @Column(name ="ROOM_ID") //Keep it same as schema
    private long roomid;
    @Column(name =" GUEST_ID") //Keep it same as schema
    private long guestid;
    @Column(name ="RES_DATE") //Keep it same as schema
    private Date reservationDate;

    public long getReservationid() {
        return reservationid;
    }

    public void setReservationid(long reservationid) {
        this.reservationid = reservationid;
    }

    public long getRoomid() {
        return roomid;
    }

    public void setRoomid(long roomid) {
        this.roomid = roomid;
    }

    public long getGuestid() {
        return guestid;
    }

    public void setGuestid(long guestid) {
        this.guestid = guestid;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationid=" + reservationid +
                ", roomid=" + roomid +
                ", guestid=" + guestid +
                ", resdate=" + reservationDate +
                '}';
    }
}
