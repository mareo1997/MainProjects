import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BlockService {

  constructor(private http: HttpClient) { }

  getBlocks(){
    return this.http.get('http://localhost:3500/blocks')
  }

}
