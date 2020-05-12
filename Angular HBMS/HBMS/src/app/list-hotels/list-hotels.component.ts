import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { Observable } from 'rxjs';
import { async } from 'rxjs/internal/scheduler/async';
import { Hotel } from '../hotel';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-hotels',
  templateUrl: './list-hotels.component.html',
  styleUrls: ['./list-hotels.component.css']
})
export class ListHotelsComponent implements OnInit {

  hotels: Observable<any>;

  constructor(private router:Router, private adminService: AdminService) { }

  ngOnInit(): void {
    this.listHotels();
  }

  listHotels() {
    this.hotels = this.adminService.listHotels();
  }

  btnClick(hotel:Hotel) {
    console.log(hotel);
    this.router.navigateByUrl('/openHotel',{state:hotel});
};
}
