import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoanComponent } from '../loan/loan.component';
import { LoanInfoComponent } from '../loan/loan-info/loan-info.component';
import { TransactionsComponent } from '../transactions/transactions.component';
import { HomeComponent } from '../home/home.component';



@NgModule({
  declarations: [
    LoanComponent,
    LoanInfoComponent,
    TransactionsComponent,
    HomeComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    LoanComponent,
    LoanInfoComponent,
    TransactionsComponent,
    HomeComponent
  ]
})
export class BankingModule { }
