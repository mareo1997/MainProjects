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
export class HomeComponent implements OnInit {

  title = 'Financial Dashboard';
  currentPage: number = 1
  itemsPerPage: number = 5

  transactions: Array<{
    date: string;
    type: string;
    amount: number;
    description: string;
  }> = [];

  loanlist: { type: string; purchasePrice: number; loanAmount: number; collateral: number; oustanding: number; rate: number; repayment: number; dueDate: string; payment: number; }[] = [];
  networth: NetworthService = new NetworthService;
  totalItems: number = 0;
  currentItemsToShow: any;
  items: any;
  data = [{
  }];

  constructor(private transactionservice: TransactionService, private networthService: NetworthService, private loanService: LoanService, private router: Router) {
  }

  ngOnInit() {
    this.transactions = this.transactionservice.getTransactions()
    this.totalItems = this.transactions.length
    this.currentPage = 1
    this.networth = this.networthService
    this.loanlist = this.loanService.getLoansList()
    // var myChart = this.graph.graph
    var myChart = new Chart('myChart', {
      type: 'bar',
      data: {
        labels: ['Rent', 'Water', 'Electricity', 'Food and Groceries', 'Debt', 'Deposits'],
        datasets: [{
          label: '$',
          data: [1000, 500, 2000, 400, 1300, 5200],
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
    // this.loans2.getLoans(loan);
    this.loanService.getLoans(loan);
    this.router.navigate(["/loan/loan-info"])
  }

  onTableDataChange(event: any): void {
    // this.tableSize = event.target.value;
    this.currentPage = 1
    // this.transactions
  }
  
  onPageChange($event: { pageIndex: number; pageSize: number; }) {
    this.currentItemsToShow =  this.items.slice($event.pageIndex*$event.pageSize,
    $event.pageIndex*$event.pageSize + $event.pageSize);
  }

  getPaginatedData(){
    const start = 1//
    const end = start + this.itemsPerPage
    return this.data.slice(start,end)
  }

  changePage(page: number){
    this.currentPage = page
  }
  //Alt+Shift+F
}
