import { Component, OnInit } from '@angular/core';
import { Hotel } from '../hotel';
import { AdminService } from '../admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-hotel',
  templateUrl: './update-hotel.component.html',
  styleUrls: ['./update-hotel.component.css']
})
export class UpdateHotelComponent implements OnInit {

  hotel:Hotel = new Hotel();

  constructor(private router:Router, private adminService : AdminService) { }

  ngOnInit(): void {
    this.hotel=history.state;
    console.log(this.hotel);
  }

  updateHotel() {
    this.adminService.updateHotel(this.hotel)
    .subscribe(data => console.log(data), error => console.log(error));
    alert("Hotel Updated Successfully!!");
    this.router.navigate(["admin"]);
  }
}
