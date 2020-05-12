import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { RegisterUser } from './register';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  
  addUser(registerUser: RegisterUser): Observable<any> {
    return this.http.post('http://localhost:8011/user/registeration' ,registerUser);
  }

  updateUser(updateUser: RegisterUser): Observable<any> {
    return this.http.put('http://localhost:8011/user/account/update' ,updateUser);
  }

  constructor(private http: HttpClient) { }

  login(username : string, password :string): Observable<any> {
    console.log("inside login service")
    return this.http.get('http://localhost:8012/user/username/'+username+'/password/'+password);
  }
}
