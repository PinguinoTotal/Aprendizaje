import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BtnCerrarComponent } from './btn-cerrar.component';

describe('BtnCerrarComponent', () => {
  let component: BtnCerrarComponent;
  let fixture: ComponentFixture<BtnCerrarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BtnCerrarComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BtnCerrarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
