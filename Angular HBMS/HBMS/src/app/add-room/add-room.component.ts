import { Component, OnInit } from '@angular/core';
import { Room } from '../room';
import { Router } from '@angular/router';
import { AdminService } from '../admin.service';
import { Hotel } from '../hotel';

@Component({
  selector: 'app-add-room',
  templateUrl: './add-room.component.html',
  styleUrls: ['./add-room.component.css']
})
export class AddRoomComponent implements OnInit {

  hotel:Hotel = new Hotel();
  room: Room= new Room();

  constructor(private router: Router, private adminService: AdminService) { }

  ngOnInit(): void {
    this.hotel = history.state;
    console.log(this.hotel);
    this.room.hotel = this.hotel;
  }

  onSubmit() {
    this.room.availability = true;
    this.adminService.addRoom(this.room)
      .subscribe(data => console.log(data), error => console.log(error));
    this.room = new Room();
    alert("Room Added Successfully!!");
    this.router.navigate(["admin"]);
  }

}
