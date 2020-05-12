import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { Observable } from 'rxjs';
import { Hotel } from '../hotel';

@Component({
  selector: 'app-guests-bookings',
  templateUrl: './guests-bookings.component.html',
  styleUrls: ['./guests-bookings.component.css']
})
export class GuestsBookingsComponent implements OnInit {

  bookings: Observable <any>;
  users: Observable <any>;
  rooms: Observable <any>;
  hotel: Hotel = new Hotel();

  constructor(private adminService: AdminService) { }

  ngOnInit(): void {
    this.getAllBookings();
    this.getAllRooms();
    this.getAllUsers();
    this.hotel = history.state;
  }

  getAllBookings() {
    this.bookings = this.adminService.getAllBookings();
  }

  getAllUsers() {
    this.users = this.adminService.getAllCustomers();
  }

  getAllRooms() {
    this.rooms = this.adminService.getAllRooms();
  }

}
