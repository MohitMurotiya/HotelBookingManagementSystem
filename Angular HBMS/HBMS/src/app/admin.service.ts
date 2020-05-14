import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Hotel } from './hotel';
import { Room } from './room';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http: HttpClient) { }

  listHotels(): Observable<any> {
    return this.http.get('http://localhost:8021/hotels');
  }

  showRooms(hotelId:number): Observable<any> {
    return this.http.get('http://localhost:8024/rooms-admin/hotelName/'+hotelId);
  }

  addHotel(hotel: Hotel): Observable<any> {
    return this.http.post('http://localhost:8022/hotel/add' ,hotel);
  }

  updateHotel(hotel: Hotel): Observable<any> {
    return this.http.put('http://localhost:8022//hotel/update' ,hotel);
  }

  addRoom(room: Room): Observable<any> {
    return this.http.post('http://localhost:8023/room/add' ,room);
  }

  deleteHotel(hotelId: number): Observable <any> {
    console.log("inside delete Hotel of admin service "+hotelId)
    return this.http.delete('http://localhost:8022/hotel/delete/'+hotelId);
  }

  deleteRoom(roomId: number): Observable <any> {
    console.log("inside delete Room of admin service "+roomId)
    return this.http.delete('http://localhost:8023/room/delete/'+roomId);
  }

  updateRoom(room: Room): Observable<any> {
    return this.http.put('http://localhost:8023/room/update' ,room);
  }

  getAllBookings(): Observable<any> {
    return this.http.get('http://localhost:8031/bookings');
  }

  getBookingsByHotel(hotelId:number): Observable<any> {
    return this.http.get('http://localhost:8031/bookings/by/hotel/'+hotelId);
  }

  getAllRooms(): Observable<any> {
    return this.http.get('http://localhost:8024/rooms');
  }

  getAllUsers(): Observable<any> {
    return this.http.get('http://localhost:8012/users/loginDetails');
  }

  getAllCustomers():  Observable<any> {
    return this.http.get('http://localhost:8012/users');
  }

  getBookingsByDate(startDate:string,endDate:string): Observable<any> {
    return this.http.get('http://localhost:8003/bookings/date/'+startDate+'/to/'+endDate);
  }
}
