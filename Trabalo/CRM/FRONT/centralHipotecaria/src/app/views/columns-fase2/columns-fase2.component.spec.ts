import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ColumnsFase2Component } from './columns-fase2.component';

describe('ColumnsFase2Component', () => {
  let component: ColumnsFase2Component;
  let fixture: ComponentFixture<ColumnsFase2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ColumnsFase2Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ColumnsFase2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
