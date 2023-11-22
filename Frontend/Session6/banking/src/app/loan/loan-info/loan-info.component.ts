import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoanService } from '../../Services/LoanService/loan.service';

@Component({
  selector: 'app-loan-info',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './loan-info.component.html',
  styleUrl: './loan-info.component.css'
})
export class LoanInfoComponent {

  loan: any
  loanAmount: number = 0;
  rate: number = 0;
  totalInterest: number = 0;
  totalLoan: number = 0;
  monthly: number = 0;
  loanDetailsList: Array<{
    month: number;
    accumulated: number;
    loanAmount: number;
  }> = [];

  constructor(private loanInfo: LoanService) {
    this.loan = this.loanInfo.loan;
    console.log(this.loan)
    this.calculateLoan(this.loan)
  }

  calculateLoan(loan: any) {
    let loanAmount = this.loan.loanAmount
    let rate = this.loan.rate/100
    this.monthly = loanAmount * (rate / 12);
    let accumulated = 0
    let balance = 0;
    this.totalInterest = loanAmount * rate;
    this.totalLoan = loanAmount + this.totalInterest
    // let start = 1;
    let month = 0;

    while (loanAmount != 0) {
      month += 1
      accumulated += this.monthly
      loanAmount -= accumulated

      if (loanAmount < 0) {
        loanAmount = 0;
      }

      const loanDetails = {
        month: month,
        accumulated: accumulated,
        loanAmount: loanAmount,
      }

      this.loanDetailsList.push(loanDetails)
    }

    console.log(this.loanDetailsList)
  }
}
