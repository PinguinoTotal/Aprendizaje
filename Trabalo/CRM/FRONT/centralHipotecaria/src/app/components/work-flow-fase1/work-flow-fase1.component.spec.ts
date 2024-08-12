import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WorkFlowFase1Component } from './work-flow-fase1.component';

describe('WorkFlowFase1Component', () => {
  let component: WorkFlowFase1Component;
  let fixture: ComponentFixture<WorkFlowFase1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [WorkFlowFase1Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(WorkFlowFase1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
