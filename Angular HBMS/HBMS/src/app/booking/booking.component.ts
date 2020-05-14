import { Component, OnInit } from '@angular/core';
import { Hotel } from '../hotel';
import { RegisterUser } from '../register';
import { Parser } from '../parser';
import { Booking } from '../Booking';
import { Router } from '@angular/router';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {

  parser:Parser = new Parser();
  booking:Booking = new Booking();
  day:number;
  checkin:string=''
  checkout:string=''

  constructor(private router:Router, private customerService: CustomerService) { }

  ngOnInit(): void {
    this.parser = history.state;
  }

  cal() {
// To calculate the no. of days between two dates
    this.parser = history.state; 
    var date1 = new Date(this.booking.checkout);
    var date2 = new Date(this.booking.checkin);
    var diffTime = (date1.getTime() - date2.getTime()); 
    var diffDays = diffTime / (24 * 3600 * 1000);
    console.log("Difference="+ diffDays)
    this.day = diffDays;
    console.log("Days="+this.day)
    this.booking.finalPrice = this.booking.numOfGuests*300 + this.parser.room.price * this.day ;
    console.log("Final Price: "+this.booking.finalPrice);
    console.log(this.booking.checkin+" "+this.booking.checkout);
  }

  onSubmit() {
    this.parser = history.state;
    console.log(this.parser)
    this.booking.hotelId = this.parser.hotel.hotelId;
    this.booking.userId = this.parser.user.user.id;
    this.booking.roomId = this.parser.room.id;
    console.log(this.booking);
    this.parser.room.availability = false;
    this.parser.room.hotel = this.parser.hotel;
    //this.checkin=this.datepipe.transform(this.booking.checkin, "dd-MM-yyyy");
    //this.checkout=this.datepipe.transform(this.booking.checkout, "dd-MM-yyyy")
    //this.booking.checkin = new Date(this.booking.checkin);
    //this.booking.checkout = new Date(this.booking.checkout);
    console.log(this.booking.checkin+" "+this.booking.checkout);
    this.customerService.bookRoom(this.booking)
      .subscribe(data => console.log(data), error => console.log(error));
    this.customerService.updateRoom(this.parser.room).subscribe(data => console.log(data), error => console.log(error));
    console.log(this.booking);
    this.booking = new Booking();
    alert("Room Booked Succesfully!!");
    this.router.navigateByUrl('/customer',{state:this.parser.user});
  }

  history() {
    this.parser=history.state;
    this.router.navigateByUrl('/history',{state: this.parser.user});
  }

  homePage() {
    this.parser=history.state;
    this.router.navigateByUrl('/customer',{state: this.parser.user})
  }

  hotelPage() {
    this.parser=history.state;
    this.router.navigateByUrl('/viewHotel',{state: this.parser})
  }

}
