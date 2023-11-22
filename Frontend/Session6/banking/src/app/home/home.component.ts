import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import { LoanService } from '../Services/LoanService/loan.service';
import { NetworthService } from '../Services/NetworthService/networth.service';
import { TransactionService } from '../Services/TransactionService/transaction.service';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

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
  }>//,
  // ];
  loans: Array<{
    type: string;
    oustanding: number,
    rate: number,
    dueDate: string,
    payment: number,
  }>

  constructor(transactionservice: TransactionService, networthService: NetworthService, loanService: LoanService, private router: Router) {
    this.transactions = transactionservice.getTransactions()
    this.assets = networthService.assets;
    this.liabilities = networthService.liabilities;
    this.networth = this.assets - this.liabilities;
    this.loans = loanService.getLoans()
  }

  loanInfo(loan: any){
    console.log(loan)
    // routerLink="/trainer/registration"
    this.router.navigate(["/loan/loan-info"])
  }

  ngOnInit() {
  }

  onTableDataChange(event:any): void{
    // this.tableSize = event.target.value;
    this.p = 1
    // this.transactions
  }
  //Alt+Shift+F
}
