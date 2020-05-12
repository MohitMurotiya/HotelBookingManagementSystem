import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  city: string='';
  hotels: Observable<any>;
  
  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
  }

  listHotelsByCity() {
    console.log(this.city);
    this.hotels = this.customerService.listHotelsByCity(this.city);
  }
}
