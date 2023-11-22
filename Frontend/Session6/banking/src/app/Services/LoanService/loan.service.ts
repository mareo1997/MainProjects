import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoanService {

  constructor() { }

  loan: any

  getLoans(loan: any){
    this.loan = loan;
    console.log(this.loan)
  }

  getLoansList() {
    let loans =
      [{
        type: "Toyota Car Loan",
        purchasePrice: 27000,
        loanAmount: 20000,
        collateral: 10000,
        oustanding: 19125,
        rate: 2.5,
        repayment: 9,
        dueDate: "07/01/2018",
        payment: 20000 * (0.025 / 12)
      },
      {
        type: "802 Northward Mortgage",
        purchasePrice: 150000,
        loanAmount: 150000,
        collateral: 30000,
        oustanding: 15000,
        rate: 10,
        repayment: 10,
        dueDate: "07/01/2018",
        payment: 150000 * (.1 / 12)
      },
      {
        type: "Florida International University Student Loan",
        purchasePrice: 6500,
        loanAmount: 6000,
        collateral: 0,
        oustanding: 1000,
        rate: 1,
        repayment: 19,
        dueDate: "07/01/2018",
        payment: 6000 * (.01 / 12)
      },]
    // ];
    return loans
  }

}
