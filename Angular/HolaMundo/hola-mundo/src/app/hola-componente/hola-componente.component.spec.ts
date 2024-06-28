import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HolaComponenteComponent } from './hola-componente.component';

describe('HolaComponenteComponent', () => {
  let component: HolaComponenteComponent;
  let fixture: ComponentFixture<HolaComponenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HolaComponenteComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HolaComponenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
