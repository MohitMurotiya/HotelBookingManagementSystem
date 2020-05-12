import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Booking } from './Booking';
import { Room } from './room';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http: HttpClient) { }

  listHotelsByCity(city: string): Observable<any> {
    return this.http.get('http://localhost:8021/hotel/city/'+city);
  }

  listHotelsByName(name: string): Observable<any> {
    return this.http.get('http://localhost:8021/hotel/name/'+name);
  }

  listHotelsByRating(rating: string): Observable<any> {
    return this.http.get('http://localhost:8021/hotel/rating/'+rating);
  }

  listHotels(): Observable<any> {
    return this.http.get('http://localhost:8021/hotels');
  }

  showRooms(hotelId:number): Observable<any> {
    return this.http.get('http://localhost:8024/rooms/hotelName/'+hotelId);
  }

  bookRoom(booking: Booking): Observable<any> {
    return this.http.post('http://localhost:8003/booking/add' ,booking);
  }

  updateRoom(room: Room): Observable<any> {
    return this.http.put('http://localhost:8023/room/update' ,room);
  }
}
