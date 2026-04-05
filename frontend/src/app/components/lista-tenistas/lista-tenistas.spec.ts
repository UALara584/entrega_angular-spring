import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaTenistas } from './lista-tenistas';

describe('ListaTenistas', () => {
  let component: ListaTenistas;
  let fixture: ComponentFixture<ListaTenistas>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListaTenistas],
    }).compileComponents();

    fixture = TestBed.createComponent(ListaTenistas);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
