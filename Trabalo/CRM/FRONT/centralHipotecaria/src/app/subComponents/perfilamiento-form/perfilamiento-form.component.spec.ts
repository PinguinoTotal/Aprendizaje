import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PerfilamientoFormComponent } from './perfilamiento-form.component';

describe('PerfilamientoFormComponent', () => {
  let component: PerfilamientoFormComponent;
  let fixture: ComponentFixture<PerfilamientoFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PerfilamientoFormComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PerfilamientoFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
