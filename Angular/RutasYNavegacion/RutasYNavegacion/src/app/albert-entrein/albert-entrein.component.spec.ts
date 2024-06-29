import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AlbertEntreinComponent } from './albert-entrein.component';

describe('AlbertEntreinComponent', () => {
  let component: AlbertEntreinComponent;
  let fixture: ComponentFixture<AlbertEntreinComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AlbertEntreinComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AlbertEntreinComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
