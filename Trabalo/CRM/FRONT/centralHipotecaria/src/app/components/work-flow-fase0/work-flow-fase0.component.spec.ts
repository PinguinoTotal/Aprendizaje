import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WorkFlowFase0Component } from './work-flow-fase0.component';

describe('WorkFlowFase0Component', () => {
  let component: WorkFlowFase0Component;
  let fixture: ComponentFixture<WorkFlowFase0Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [WorkFlowFase0Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(WorkFlowFase0Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
