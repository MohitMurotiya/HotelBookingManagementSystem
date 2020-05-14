import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Hotel } from '../hotel';
import { User } from '../user';
import { Router } from '@angular/router';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-reports',
  templateUrl: './reports.component.html',
  styleUrls: ['./reports.component.css']
})
export class ReportsComponent implements OnInit {
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


}
