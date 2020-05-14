import { Component, OnInit } from '@angular/core';
import { Hotel } from '../hotel';
import { AdminService } from '../admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-hotel',
  templateUrl: './add-hotel.component.html',
  styleUrls: ['./add-hotel.component.css']
})
export class AddHotelComponent implements OnInit {

    hotel: Hotel = new Hotel();

  constructor(private router: Router, private adminService: AdminService) { }

  ngOnInit(): void {
  }

  onSubmit() {
    this.adminService.addHotel(this.hotel)
      .subscribe(data => console.log(data), error => console.log(error));
    this.hotel = new Hotel();
    alert("Hotel Added Successfully!!");
    this.router.navigate(["admin"]);
  }

}
