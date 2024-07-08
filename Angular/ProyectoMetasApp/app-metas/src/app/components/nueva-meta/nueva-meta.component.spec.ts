import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NuevaMetaComponent } from './nueva-meta.component';

describe('NuevaMetaComponent', () => {
  let component: NuevaMetaComponent;
  let fixture: ComponentFixture<NuevaMetaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NuevaMetaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NuevaMetaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
