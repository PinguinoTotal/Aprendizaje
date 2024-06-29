import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalcularPromedioSalarioComponent } from './calcular-promedio-salario.component';

describe('CalcularPromedioSalarioComponent', () => {
  let component: CalcularPromedioSalarioComponent;
  let fixture: ComponentFixture<CalcularPromedioSalarioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CalcularPromedioSalarioComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CalcularPromedioSalarioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
