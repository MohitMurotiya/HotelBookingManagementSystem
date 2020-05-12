import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-date-bookings',
  templateUrl: './date-bookings.component.html',
  styleUrls: ['./date-bookings.component.css']
})
export class DateBookingsComponent implements OnInit {

  bookings: Observable <any>;
  users: Observable <any>;
  hotels: Observable <any>;
  rooms: Observable <any>;

  date1:string='';
  date2:string='';

  constructor(private adminService: AdminService) { }

  ngOnInit(): void {
   
  }

  searchBookings() {
    console.log(this.date1+" "+this.date2)
    this.bookings = this.adminService.getBookingsByDate(this.date1,this.date2);
    this.getAllHotels();
    this.getAllRooms();
    this.getAllUsers();
  }

  getAllUsers() {
    this.users = this.adminService.getAllUsers();
  }

  getAllHotels() {
    this.hotels = this.adminService.listHotels();
  }

  getAllRooms() {
    this.rooms = this.adminService.getAllRooms();
  }

}
