import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { BlockService } from './block.service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angular-app1';
  blocks: any
  constructor(private block: BlockService){}

  ngOnInIt(){
    this.blocks = this.block.getBlocks().subscribe((res:any)=>{this.block=res})
  }

  getData(){
    this.blocks = this.block.getBlocks().subscribe((res:any)=>{this.block=res})
    console.log(this.block)
  }

}
