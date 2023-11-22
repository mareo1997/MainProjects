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
        purchasePrice: 45000,
        loanAmount: 50000,
        collateral: 30000,
        oustanding: 4500,
        rate: 2.5,
        repayment: 9,
        dueDate: "07/01/2018",
        payment: 4500 * (2.5 / 12)
      },
      {
        type: "802 Northward Mortgage",
        purchasePrice: 45000,
        loanAmount: 50000,
        collateral: 30000,
        oustanding: 15000,
        rate: 10,
        repayment: 10,
        dueDate: "07/01/2018",
        payment: 15000 * (10 / 12)
      },
      {
        type: "Florida International University Student Loan",
        purchasePrice: 45000,
        loanAmount: 50000,
        collateral: 30000,
        oustanding: 1000,
        rate: 1,
        repayment: 19,
        dueDate: "07/01/2018",
        payment: 1000 * (1 / 12)
      },]
    // ];
    return loans
  }

}
