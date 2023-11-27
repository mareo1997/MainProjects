import { Injectable } from '@angular/core';
import { Chart } from 'chart.js';

@Injectable({
  providedIn: 'root'
})
export class NetworthService {

  constructor() { }

  assets: number = 40000;
  liabilities: number = 5200;

  // graph(){
  //   var networthChart = new Chart('networthChart', {
  //     type: 'bar',
  //     data: {
  //         labels: ['Rent', 'Water', 'Electricity', 'Food and Groceries', 'Debt', 'Deposits'],
  //         datasets: [{
  //             label: '$',
  //             data: [400, 50, 300, 100, 540, 2700],
  //             backgroundColor: [
  //                 'rgba(255, 99, 132, 0.2)',
  //                 'rgba(54, 162, 235, 0.2)',
  //                 'rgba(255, 206, 86, 0.2)',
  //                 'rgba(75, 192, 192, 0.2)',
  //                 'rgba(153, 102, 255, 0.2)',
  //                 'rgba(255, 159, 64, 0.2)'
  //             ],
  //             borderColor: [
  //                 'rgba(255, 99, 132, 1)',
  //                 'rgba(54, 162, 235, 1)',
  //                 'rgba(255, 206, 86, 1)',
  //                 'rgba(75, 192, 192, 1)',
  //                 'rgba(153, 102, 255, 1)',
  //                 'rgba(255, 159, 64, 1)'
  //             ],
  //             borderWidth: 1
  //         }]
  //     },
  //     options: {
  //         scales: {
  //             y: {
  //                 beginAtZero: true
  //             }
  //         }
  //     }
  // });
  // return networthChart
  // }

}
