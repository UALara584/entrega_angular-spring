import { TestBed } from '@angular/core/testing';

import { Tenista } from './tenista';

describe('Tenista', () => {
  let service: Tenista;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Tenista);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
