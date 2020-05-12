import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { AdminService } from '../admin.service';
import { Hotel } from '../hotel';
import { User } from '../user';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  title="Admin Console";

  hotels: Observable<any>;
  arrayHotels: Hotel[]=[];
  totalHotels: number;
  users: Observable<any>;
  arrayUsers: User[]=[];
  totalUsers:number;


  constructor(private router: Router, private adminService: AdminService) {}

  ngOnInit(): void {
    //this.router.navigate(['admin']);
    this.listHotels();
    this.users = this.adminService.getAllUsers();
    this.users.subscribe((arrayUsers) => { 
      this.arrayUsers = arrayUsers;
      console.log(this.arrayUsers);
      this.totalUsers = this.arrayUsers.length - 1;
    });
  }
  
  listHotels() {
    this.hotels = this.adminService.listHotels();
    this.hotels.subscribe((arrayHotels) => { 
      this.arrayHotels = arrayHotels;
      console.log(this.arrayHotels);
      this.totalHotels = this.arrayHotels.length;
    });
  }

  addHotel() {
    this.router.navigate(['addHotel']);
  }

  btnClick(hotel:Hotel) {
    console.log(hotel);
    this.router.navigateByUrl('/openHotel',{state:hotel});
};

  deleteHotel() {
    this.router.navigate(['deleteHotel']);
  }
}