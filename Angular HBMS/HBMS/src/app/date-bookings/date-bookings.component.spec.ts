import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DateBookingsComponent } from './date-bookings.component';

describe('DateBookingsComponent', () => {
  let component: DateBookingsComponent;
  let fixture: ComponentFixture<DateBookingsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DateBookingsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DateBookingsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
