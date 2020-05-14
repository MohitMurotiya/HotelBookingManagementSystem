import { Component, OnInit } from '@angular/core';
import { Parser } from '../parser';
import { Booking } from '../Booking';
import { AdminService } from '../admin.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-all-bookings',
  templateUrl: './all-bookings.component.html',
  styleUrls: ['./all-bookings.component.css']
})
export class AllBookingsComponent implements OnInit {

  bookings: Observable <any>;
  users: Observable <any>;
  hotels: Observable <any>;
  rooms: Observable <any>;

  constructor(private adminService: AdminService) { }

  ngOnInit(): void {
    this.getAllBookings();
    this.getAllHotels();
    this.getAllRooms();
    this.getAllUsers();
  }

  getAllBookings() {
    this.bookings = this.adminService.getAllBookings();
  }

  getAllUsers() {
    this.users = this.adminService.getAllUsers();
    console.log(this.users);
  }

  getAllHotels() {
    this.hotels = this.adminService.listHotels();
  }

  getAllRooms() {
    this.rooms = this.adminService.getAllRooms();
  }

}
