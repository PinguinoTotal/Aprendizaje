import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ColumnsFase1Component } from './columns-fase1.component';

describe('ColumnsFase1Component', () => {
  let component: ColumnsFase1Component;
  let fixture: ComponentFixture<ColumnsFase1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ColumnsFase1Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ColumnsFase1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
