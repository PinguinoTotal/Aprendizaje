import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AgregarProspectoComponent } from './agregar-prospecto.component';

describe('AgregarProspectoComponent', () => {
  let component: AgregarProspectoComponent;
  let fixture: ComponentFixture<AgregarProspectoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AgregarProspectoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AgregarProspectoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
