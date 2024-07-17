import { TestBed } from '@angular/core/testing';

import { PhoneMenuPressedService } from './phone-menu-pressed.service';

describe('PhoneMenuPressedService', () => {
  let service: PhoneMenuPressedService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PhoneMenuPressedService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
