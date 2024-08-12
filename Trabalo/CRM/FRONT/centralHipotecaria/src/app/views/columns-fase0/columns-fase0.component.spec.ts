import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ColumnsFase0Component } from './columns-fase0.component';

describe('ColumnsFase0Component', () => {
  let component: ColumnsFase0Component;
  let fixture: ComponentFixture<ColumnsFase0Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ColumnsFase0Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ColumnsFase0Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
