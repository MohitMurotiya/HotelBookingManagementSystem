import { Component, OnInit } from '@angular/core';
import { RegisterUser } from '../register';
import { LoginService } from '../login-service.service';
import { FormGroup, FormControl, Validators, NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerUser: RegisterUser  = new RegisterUser();

  constructor(private route:Router,private registerService:LoginService) { }

  ngOnInit(): void {
  }

  onRegister() {
     this.registerUser.user.role='customer';
     this.registerService.addUser(this.registerUser)
      .subscribe(data => console.log(data), error => console.log(error));
    this.registerUser = new RegisterUser();
    alert("You have registered successfully!!");
    this.route.navigate(['login']);
  }
}
