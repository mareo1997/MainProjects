import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import { LoanService } from '../Services/LoanService/loan.service';
import { NetworthService } from '../Services/NetworthService/networth.service';
import { TransactionService } from '../Services/TransactionService/transaction.service';
import { OnInit } from '@angular/core';
import { Chart } from 'chart.js';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit{

  title = 'Financial Dashboard';
  assets: number = 0;
  liabilities: number = 0;
  networth: number = 0;
  p: number = 1
  count: number = 0

  transactions: Array<{
    date: string;
    type: string;
    amount: number;
    description: string;
  }>

  loans: Array<{
    type: string;
    oustanding: number,
    rate: number,
    dueDate: string,
    payment: number,
  }>

  loans2: LoanService;
  // graph: NetworthService;

  constructor(transactionservice: TransactionService, networthService: NetworthService, loanService: LoanService, private router: Router) {
    this.transactions = transactionservice.getTransactions()
    this.assets = networthService.assets;
    this.liabilities = networthService.liabilities;
    this.networth = this.assets - this.liabilities;
    // this.graph = networthService;
    this.loans = loanService.getLoansList()
    this.loans2 = loanService
  }

  ngOnInit() {
    // var myChart = this.graph.graph
    var myChart = new Chart('myChart', {
      type: 'bar',
      data: {
          labels: ['Rent', 'Water', 'Electricity', 'Food and Groceries', 'Debt', 'Deposits'],
          datasets: [{
              label: '$',
              data: [400, 50, 300, 100, 540, 2700],
              backgroundColor: [
                  'rgba(255, 99, 132, 0.2)',
                  'rgba(54, 162, 235, 0.2)',
                  'rgba(255, 206, 86, 0.2)',
                  'rgba(75, 192, 192, 0.2)',
                  'rgba(153, 102, 255, 0.2)',
                  'rgba(255, 159, 64, 0.2)'
              ],
              borderColor: [
                  'rgba(255, 99, 132, 1)',
                  'rgba(54, 162, 235, 1)',
                  'rgba(255, 206, 86, 1)',
                  'rgba(75, 192, 192, 1)',
                  'rgba(153, 102, 255, 1)',
                  'rgba(255, 159, 64, 1)'
              ],
              borderWidth: 1
          }]
      },
      options: {
          scales: {
              y: {
                  beginAtZero: true
              }
          }
      }
  });
  }

  loanInfo(loan: any) {
    // console.log(loan)
    // routerLink="/trainer/registration"
    this.loans2.getLoans(loan);
    this.router.navigate(["/loan/loan-info"])
  }

  onTableDataChange(event: any): void {
    // this.tableSize = event.target.value;
    this.p = 1
    // this.transactions
  }
  //Alt+Shift+F
}
