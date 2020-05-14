import { Component, OnInit, Input } from '@angular/core';
import { Hotel } from '../hotel';
import { AdminService } from '../admin.service';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-hotel',
  templateUrl: './hotel.component.html',
  styleUrls: ['./hotel.component.css']
})
export class HotelComponent implements OnInit {

  hotel:Hotel = new Hotel();
  rooms: Observable<any>;

  constructor(private router:Router, private adminService: AdminService) { }

  ngOnInit(): void {
    console.log(history.state)
    this.hotel = history.state;
  }

  addRoom() {
    this.router.navigateByUrl('/addRoom',{state:this.hotel});
};

  updateHotel() {
    this.router.navigateByUrl('/updateHotel',{state:this.hotel});
  }

  deleteHotel() {
    if(confirm("Are you sure to delete "+this.hotel.hotelName)) {
      let hotelId:number = this.hotel.hotelId;
      console.log("inside delete Hotel "+ hotelId);
      this.adminService.deleteHotel(hotelId).subscribe(data => {
        console.log(data);
        this.router.navigate(["admin"]);
      });
    }
  }

  showRooms() {
    /*var x = document.getElementById("hotelRooms");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }*/
    this.rooms = this.adminService.showRooms(this.hotel.hotelId);
  }

  deleteRoom(roomId) {
    if(confirm("Are you sure to Remove this Room??")) {
      console.log("inside delete Hotel "+ roomId);
    this.adminService.deleteRoom(roomId).subscribe(data => {
      console.log(data);
    });
    this.rooms = this.adminService.showRooms(this.hotel.hotelId);
    }
  }

  hotelBookings() {
    this.router.navigateByUrl('/bookingsByHotel',{state: this.hotel});
  }

  customersList() {
    this.router.navigateByUrl('/guestsBooking',{state: this.hotel});
  }
}