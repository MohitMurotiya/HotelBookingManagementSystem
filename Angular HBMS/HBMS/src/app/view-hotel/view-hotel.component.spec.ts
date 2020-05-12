import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewHotelComponent } from './view-hotel.component';

describe('ViewHotelComponent', () => {
  let component: ViewHotelComponent;
  let fixture: ComponentFixture<ViewHotelComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewHotelComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewHotelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
