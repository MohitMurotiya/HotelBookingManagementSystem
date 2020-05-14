import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { CustomerComponent } from './customer/customer.component';
import { AddHotelComponent } from './add-hotel/add-hotel.component';
import { ListHotelsComponent } from './list-hotels/list-hotels.component';
import { HotelComponent } from './hotel/hotel.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { UpdateHotelComponent } from './update-hotel/update-hotel.component';
import { AddRoomComponent } from './add-room/add-room.component';
import { ViewHotelComponent } from './view-hotel/view-hotel.component';
import { BookingComponent } from './booking/booking.component';
import { ReportsComponent } from './reports/reports.component';
import { GuestsBookingsComponent } from './guests-bookings/guests-bookings.component';
import { DateBookingsComponent } from './date-bookings/date-bookings.component';
import { HotelBookingsComponent } from './hotel-bookings/hotel-bookings.component';
import { AllBookingsComponent } from './all-bookings/all-bookings.component';
import { CustomerHistoryComponent } from './customer-history/customer-history.component';

const routes: Routes = [
  { path: 'hotelslist', component: ListHotelsComponent},
  { path: 'reports', component: ReportsComponent, children: [
    { path: 'bookingsBetnDates', component: DateBookingsComponent},
    { path: 'allBookings', component: AllBookingsComponent}]
  },
  { path: 'guestsBooking', component: GuestsBookingsComponent},
  { path: 'history', component: CustomerHistoryComponent},
  { path: 'bookingsByHotel', component: HotelBookingsComponent},
  { path: 'bookRoom', component: BookingComponent},
  { path: 'viewHotel', component: ViewHotelComponent},
  { path: 'updateHotel', component: UpdateHotelComponent},
  { path: 'addRoom', component: AddRoomComponent},
  { path: 'updateUser', component: UpdateUserComponent},
  { path: 'home', component: HomeComponent},
  { path: 'register', component: RegisterComponent},
  { path: 'openHotel', component: HotelComponent},
  { path: 'addHotel', component: AddHotelComponent},
  { path: 'login', component: LoginComponent },
  { path: 'admin', component: AdminComponent},
  { path: 'customer', component: CustomerComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
