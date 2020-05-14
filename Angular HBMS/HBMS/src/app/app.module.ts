import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { LoginService } from './login-service.service';
import { AdminComponent } from './admin/admin.component';
import { CustomerComponent } from './customer/customer.component';
import { AdminService } from './admin.service';
import { CustomerService } from './customer.service';
import { AddHotelComponent } from './add-hotel/add-hotel.component';
import { ListHotelsComponent } from './list-hotels/list-hotels.component';
import { HotelComponent } from './hotel/hotel.component';
import { RegisterComponent } from './register/register.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { HomeComponent } from './home/home.component';
import { UpdateHotelComponent } from './update-hotel/update-hotel.component';
import { AddRoomComponent } from './add-room/add-room.component';
import { ViewHotelComponent } from './view-hotel/view-hotel.component';
import { BookingComponent } from './booking/booking.component';
import { ReportsComponent } from './reports/reports.component';
import { AllBookingsComponent } from './all-bookings/all-bookings.component';
import { HotelBookingsComponent } from './hotel-bookings/hotel-bookings.component';
import { GuestsBookingsComponent } from './guests-bookings/guests-bookings.component';
import { DateBookingsComponent } from './date-bookings/date-bookings.component';
import { CommonModule } from '@angular/common';
import { CustomerHistoryComponent } from './customer-history/customer-history.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdminComponent,
    CustomerComponent,
    AddHotelComponent,
    ListHotelsComponent,
    HotelComponent,
    RegisterComponent,
    UpdateUserComponent,
    HomeComponent,
    UpdateHotelComponent,
    AddRoomComponent,
    ViewHotelComponent,
    BookingComponent,
    ReportsComponent,
    AllBookingsComponent,
    HotelBookingsComponent,
    GuestsBookingsComponent,
    DateBookingsComponent,
    CustomerHistoryComponent,
  ],
  imports: [
    BrowserModule,
    CommonModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,

  ],
  providers: [LoginService, AdminService, CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
