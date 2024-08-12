import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WorkFlowFase2Component } from './work-flow-fase2.component';

describe('WorkFlowFase2Component', () => {
  let component: WorkFlowFase2Component;
  let fixture: ComponentFixture<WorkFlowFase2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [WorkFlowFase2Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(WorkFlowFase2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
