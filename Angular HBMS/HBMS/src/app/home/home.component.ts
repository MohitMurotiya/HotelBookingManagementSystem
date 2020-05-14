import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { CustomerService } from '../customer.service';
import { NgForm } from '@angular/forms';
import { Hotel } from '../hotel';
import { RegisterUser } from '../register';
import { Parser } from '../parser';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  city: string='';
  hotels: Observable<any>;
  hsize: number;
  arrayHotels:Hotel[]=[];
  parser: Parser = new Parser();

  constructor(private router:Router,private customerService: CustomerService) { }

  ngOnInit(): void {
  }

  listHotelsByCity(form:NgForm) {
    if (form.valid) {
      this.customerService.listHotelsByCity(this.city).subscribe((arrayHotels) => { 
          this.arrayHotels = arrayHotels;
          console.log(this.arrayHotels);
          this.hsize=this.arrayHotels.length
          if(this.hsize<1)
          {
            alert('Either the city entered is invalid or the Hotels are not present of that City!!')     
        } else {
          this.hotels=this.customerService.listHotelsByCity(this.city);
        }
        
      }
      )}
    }

    btnClick(hotel:Hotel) {
      let user:RegisterUser = history.state;
      console.log(user);
      /*type objects = Array<{hotl: Hotel, cust: RegisterUser}>;
      const arr: objects = [
        {hotl: hotel, cust: user}];*/
      this.parser.hotel = hotel;
      this.parser.user = user;
      console.log(this.parser);
      this.router.navigateByUrl('/viewHotel',{state:this.parser});
  };
  }

        
