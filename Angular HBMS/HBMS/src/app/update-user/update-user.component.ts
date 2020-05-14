import { Component, OnInit, Input } from '@angular/core';
import { RegisterUser } from '../register';
import { LoginService } from '../login-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {

  thisCustomer:RegisterUser = new RegisterUser();

  //@Input() thisCustomer: RegisterUser;

  constructor(private route:Router, private loginService: LoginService) { }

  ngOnInit(): void {
    this.thisCustomer=history.state;
    console.log(this.thisCustomer)
  }

  onRegister() {
    this.loginService.updateUser(this.thisCustomer)
    .subscribe(data => console.log(data), error => console.log(error));
    alert("You have Updated your profile successfully!!");
    this.route.navigate(['login']);
  }

  homePage() {
    this.thisCustomer=history.state;
    this.route.navigateByUrl('/customer',{state: this.thisCustomer})
  }

  history() {
    let user:RegisterUser = history.state;
    this.route.navigateByUrl('/history',{state: user});
  }

}
