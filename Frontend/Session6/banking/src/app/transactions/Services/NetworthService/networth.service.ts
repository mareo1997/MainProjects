import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class NetworthService {

  constructor() { }

  assets: number = 5000;
  liabilities: number = 50;

}
