import { Component, OnInit } from '@angular/core';
import { RegisterUser } from '../register';
import { LoginService } from '../login-service.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerUser: RegisterUser  = new RegisterUser();

  constructor(private registerService:LoginService) { }

  ngOnInit(): void {
  }

  registrationForm = new FormGroup({
    fname : new FormControl('Enter your Name',
    [Validators.required, Validators.minLength(4)]),
  })

  onRegister() {
    this.registerService.addUser(this.registerUser)
      .subscribe(data => console.log(data), error => console.log(error));
    this.registerUser = new RegisterUser();
  }

}
