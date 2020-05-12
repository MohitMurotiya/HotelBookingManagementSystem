import { Component, OnInit, Input } from '@angular/core';
import { RegisterUser } from '../register';
import { LoginService } from '../login-service.service';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {

  thisCustomer:RegisterUser = new RegisterUser();

  //@Input() thisCustomer: RegisterUser;

  constructor(private loginService: LoginService) { }

  ngOnInit(): void {
    this.thisCustomer=history.state;
    console.log(this.thisCustomer)
  }

  onRegister() {
    this.loginService.updateUser(this.thisCustomer)
    .subscribe(data => console.log(data), error => console.log(error));
  }

}
