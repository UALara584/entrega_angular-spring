import { Component } from '@angular/core';
import { ListaTenistasComponent } from './lista-tenistas/lista-tenistas.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [ListaTenistasComponent],
  templateUrl: './app.html'
})
export class App {}