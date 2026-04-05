import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Tenista } from '../models/tenista';

@Injectable({
  providedIn: 'root'
})
export class TenistaService {

  private apiUrl = 'http://localhost:8080/api/tenistas';

  constructor(private http: HttpClient) {}

  getTenistas(): Observable<Tenista[]> {
    return this.http.get<Tenista[]>(this.apiUrl);
  }
}