import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TransactionService } from '../Services/TransactionService/transaction.service';

@Component({
  selector: 'app-transactions',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './transactions.component.html',
  styleUrl: './transactions.component.css'
})
export class TransactionsComponent {

  transactions: Array<{
    date: string;
    type: string;
    amount: number;
    description: string;
  }>

  constructor(transactionservice: TransactionService) {
    this.transactions = transactionservice.getTransactions()
    // this.assets = networthService.assets;
    // this.liabilities = networthService.liabilities;
    // this.networth = this.assets - this.liabilities;
    // this.loans = loanService.getLoans()
    // console.log(this.abc)
  }

  ngOnInIt(){

  }

}
