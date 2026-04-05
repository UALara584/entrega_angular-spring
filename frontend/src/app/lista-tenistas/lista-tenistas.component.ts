import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Tenista } from '../models/tenista';
import { TenistaService } from '../services/tenista.service';

@Component({
  selector: 'app-lista-tenistas',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './lista-tenistas.component.html',
  styleUrl: './lista-tenistas.component.css'
})
export class ListaTenistasComponent implements OnInit {
  tenistas: Tenista[] = [];

  constructor(private tenistaService: TenistaService) {}

  ngOnInit(): void {
    this.tenistaService.getTenistas().subscribe({
      next: (data) => {
        console.log('Datos recibidos:', data);
        this.tenistas = data;
      },
      error: (error) => {
        console.error('Error al cargar tenistas:', error);
      }
    });
  }
}