import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateHotelComponent } from './update-hotel.component';

describe('UpdateHotelComponent', () => {
  let component: UpdateHotelComponent;
  let fixture: ComponentFixture<UpdateHotelComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateHotelComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateHotelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
