import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerHistoryComponent } from './customer-history.component';

describe('CustomerHistoryComponent', () => {
  let component: CustomerHistoryComponent;
  let fixture: ComponentFixture<CustomerHistoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomerHistoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerHistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
