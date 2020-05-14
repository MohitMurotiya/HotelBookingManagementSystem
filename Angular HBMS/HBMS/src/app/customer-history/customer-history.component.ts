import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { RegisterUser } from '../register';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer-history',
  templateUrl: './customer-history.component.html',
  styleUrls: ['./customer-history.component.css']
})
export class CustomerHistoryComponent implements OnInit {

  bookings: Observable <any>;
  users: Observable <any>;
  hotels: Observable <any>;
  rooms: Observable <any>;
  user:RegisterUser = new RegisterUser();

  constructor(private route:Router , private customerService: CustomerService) { }

  ngOnInit() {
    this.user = history.state;
    console.log(this.user)
    
      console.log(this.user.user.id)
      this.bookings = this.customerService.getUserBookings(this.user.user.id);
    
    this.getAllHotels();
    this.getAllRooms();
  }

  updateProfile() {
    this.user = history.state;
    console.log(this.user)
    this.route.navigateByUrl('/updateUser',{state:this.user});
  }

  getAllHotels() {
    this.hotels = this.customerService.listHotels();
  }

  getAllRooms() {
    this.rooms = this.customerService.getAllRooms();
  }

  homePage() {
    this.user=history.state;
    this.route.navigateByUrl('/customer',{state: this.user})
  }

}
