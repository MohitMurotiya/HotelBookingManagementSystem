import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { Observable } from 'rxjs';
import { Hotel } from '../hotel';

@Component({
  selector: 'app-hotel-bookings',
  templateUrl: './hotel-bookings.component.html',
  styleUrls: ['./hotel-bookings.component.css']
})
export class HotelBookingsComponent implements OnInit {

  bookings: Observable <any>;
  users: Observable <any>;
  rooms: Observable <any>;
  hotel: Hotel = new Hotel();

  constructor(private adminService: AdminService) { }

  ngOnInit(): void {
    this.getBookingsByHotel();
  }

  getBookingsByHotel() {
    this.hotel = history.state;
    this.bookings = this.adminService.getBookingsByHotel(this.hotel.hotelId);
    this.getAllRooms();
    this.getAllUsers();
  }

  getAllUsers() {
    this.users = this.adminService.getAllUsers();
  }

  getAllRooms() {
    this.rooms = this.adminService.getAllRooms();
  }

}
