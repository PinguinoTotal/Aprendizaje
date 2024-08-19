import { TestBed } from '@angular/core/testing';

import { OpenProspectoFormService } from './open-prospecto-form.service';

describe('OpenProspectoFormService', () => {
  let service: OpenProspectoFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OpenProspectoFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
