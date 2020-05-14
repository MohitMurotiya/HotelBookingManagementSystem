import { Component, OnInit } from '@angular/core';
import { Hotel } from '../hotel';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { CustomerService } from '../customer.service';
import { RegisterUser } from '../register';
import { Parser } from '../parser';

@Component({
  selector: 'app-view-hotel',
  templateUrl: './view-hotel.component.html',
  styleUrls: ['./view-hotel.component.css']
})
export class ViewHotelComponent implements OnInit {
  hotel:Hotel = new Hotel();
  rooms: Observable<any>;
  user:RegisterUser = new RegisterUser();
  parser:Parser = new Parser();

  constructor(private router:Router, private customerService: CustomerService) { }

  ngOnInit(): void {
    this.parser = history.state;
    console.log(this.parser);
    this.hotel = this.parser.hotel;
    console.log(this.hotel);
    this.user = this.parser.user;
    console.log(this.user);
  }

  

  showRooms() {
    /*var x = document.getElementById("hotelRooms");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }*/
  this.parser = history.state;
  console.log(this.parser);
  this.hotel = this.parser.hotel;
  console.log(this.hotel);
  console.log(this.hotel.hotelId);
    this.rooms = this.customerService.showRooms(this.hotel.hotelId);
  }

  bookRoom(room) {
    this.parser = history.state
    this.parser.room = room;
    console.log(this.parser);
    this.router.navigateByUrl('/bookRoom',{state: this.parser});
  }

  history() {
    this.parser = history.state
    this.router.navigateByUrl('/history',{state: this.parser.user});
  }

  homePage() {
    this.user=history.state;
    this.router.navigateByUrl('/customer',{state: this.user})
  }

}
