import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { TransactionService } from './transactions/Services/TransactionService/transaction.service';
import { NetworthService } from './transactions/Services/NetworthService/networth.service';
import { LoanService } from './transactions/Services/LoanService/loan.service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Financial Dashboard';
  assets: number = 0;
  liabilities: number = 0;
  networth: number = 0;
  // constructor() {
  //   // this.assets = 5000;
  //   // this.liabilities = 450;
  //   // let networth = this.assets - this.liabilities
  // }

  transactions: Array<{
    date: string;
    type: string;
    amount: number;
    description: string;
    // }> = [
    //     {
    //       date: "01/18/2021",
    //       type: "Credit",
    //       amount: 2000,
    //       description: "Airline"
    //     },
    //     {
    //       date: "02/05/1990",
    //       type: "Debit",
    //       amount: 51,
    //       description: "Busfare"
  }>//,
  // ];
  loans: Array<{
    type: string;
    oustanding: number,
    rate: number,
    dueDate: string,
    payment: number,
  }>

  constructor(transactionservice: TransactionService, networthService: NetworthService, loanService: LoanService) {
    this.transactions = transactionservice.getTransactions()
    this.assets = networthService.assets;
    this.liabilities = networthService.liabilities;
    this.networth = this.assets - this.liabilities;
    this.loans = loanService.getLoans()
    // console.log(this.abc)
  }

  ngOnInit() {
    // this.assets = 500;
    // this.liabilities = 45;
    // this.networth = this.assets - this.liabilities
    // a = this.abc
  }

  //Alt+Shift+F

}
