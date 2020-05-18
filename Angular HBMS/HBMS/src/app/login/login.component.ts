import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../login-service.service';
import { User } from '../user';
import { RegisterUser } from '../register';
import { empty } from 'rxjs';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username = '';
  password = '';
  registerUser:RegisterUser=new RegisterUser();


  constructor(private router: Router,
    private loginservice: LoginService) { }

  ngOnInit() {
  }

  checkLogin() {
    console.log("inside check login");
   this.loginservice.login(this.username, this.password).subscribe(data => {
    this.registerUser = data;
    if(this.registerUser == undefined){
      alert('User Not Found!!')
    }else{
      if(this.registerUser.user.role=='admin') {
        this.router.navigate(['admin']);
      } else if(this.registerUser.user.role=='customer') {
        this.router.navigateByUrl('/customer',{state: this.registerUser});
      }
  }
   /* if (this.loginservice.login(this.username, this.password)) {
      this.router.navigate([''])
      this.invalidLogin = false
    } else
      this.invalidLogin = true*/
   });
  }
}