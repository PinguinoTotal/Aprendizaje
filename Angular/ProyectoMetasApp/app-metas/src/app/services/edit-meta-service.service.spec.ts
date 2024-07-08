import { TestBed } from '@angular/core/testing';

import { EditMetaServiceService } from './edit-meta-service.service';

describe('EditMetaServiceService', () => {
  let service: EditMetaServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EditMetaServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
