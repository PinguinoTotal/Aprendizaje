import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OmnimanComponent } from './omniman.component';

describe('OmnimanComponent', () => {
  let component: OmnimanComponent;
  let fixture: ComponentFixture<OmnimanComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [OmnimanComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OmnimanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
