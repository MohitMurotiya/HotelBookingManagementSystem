import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GuestsBookingsComponent } from './guests-bookings.component';

describe('GuestsBookingsComponent', () => {
  let component: GuestsBookingsComponent;
  let fixture: ComponentFixture<GuestsBookingsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GuestsBookingsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GuestsBookingsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
