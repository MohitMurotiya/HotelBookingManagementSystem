import { Component, OnInit, Input } from '@angular/core';
import { User } from '../user';
import { RegisterUser } from '../register';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { CustomerService } from '../customer.service';
import { Hotel } from '../hotel';
import { Booking } from '../Booking';
import { Parser } from '../parser';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  customer:RegisterUser=new RegisterUser();

  city: string='';
  hotels: Observable<any>;
  parser: Parser = new Parser();
  hsize: number;
  arrayHotels:Hotel[]=[];
  type : string;
  message: string;
  
  constructor(private router:Router, private customerService: CustomerService) { }

  search:string='';
  choice:string='';

  ngOnInit() {
    
    this.customer = history.state;
    this.listHotels();
    console.log(history.state)
  }

  updateProfile() {
    this.customer = history.state;
    console.log(this.customer)
    this.router.navigateByUrl('/updateUser',{state:this.customer});
  }

  searchHotels(form:NgForm) {
    if(form.valid){
      if(this.search=="Search By Name"){
        this.listHotelsByName();
      } else if(this.search=="Search By City"){
        this.listHotelsByCity();
      } else if(this.search=="Search By Rating"){
        this.listHotelsByRating();
    }
  }
  }

  listHotelsByCity() {
    this.customerService.listHotelsByCity(this.choice).subscribe((arrayHotels) => { 
      this.arrayHotels = arrayHotels;
      this.hsize=this.arrayHotels.length
      if(this.hsize<1)
      {
        alert('We are not in this City yet..!!')
    } else {
      this.hotels=this.customerService.listHotelsByCity(this.choice);
    } 
  }
  )}

  listHotelsByName() {
    console.log(this.choice);
    let name:string=this.choice
    this.customerService.listHotelsByName(name).subscribe((arrayHotels) => { 
    this.arrayHotels = arrayHotels;
    this.hsize=this.arrayHotels.length
    if(this.hsize<1)
    {
      alert('Hotels of this Name are not present..!!')
    } else {
      this.hotels=this.customerService.listHotelsByName(name);
    } 
  }
  )}
    //this.hotels = this.customerService.listHotelsByName(name);

  listHotelsByRating() {
    console.log(this.choice);
    this.customerService.listHotelsByRating(this.choice).subscribe((arrayHotels) => { 
    this.arrayHotels = arrayHotels;
    this.hsize=this.arrayHotels.length
    if(this.hsize<1)
    {
      alert('Hotels of this rating are not present..!!')
    } else {
       this.hotels=this.customerService.listHotelsByRating(this.choice);
    } 
  }
)}
    //this.hotels = this.customerService.listHotelsByRating(this.choice);

  listHotels() {
    this.hotels = this.customerService.listHotels();
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

  history() {
    let user:RegisterUser = history.state;
    this.router.navigateByUrl('/history',{state: user});
  }
}
