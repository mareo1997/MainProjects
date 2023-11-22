import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoanService {

  constructor() { }

  loan: any

  getLoans(loan: any) {
    this.loan = loan;
    console.log(this.loan)
  }

  getLoansList() {
    let loans =
      [{
        type: "Toyota Car Loan",
        purchasePrice: 27000.00,
        loanAmount: 20000.00,
        collateral: 10000.00,
        oustanding: 19125.00,
        rate: 2.5,
        repayment: 9,
        dueDate: "07/01/2018",
        payment: 20000.00 * (0.025 / 12)
      },
      {
        type: "802 Northward Mortgage",
        purchasePrice: 150000.00,
        loanAmount: 150000.00,
        collateral: 30000.00,
        oustanding: 123750.00,
        rate: 10,
        repayment: 10,
        dueDate: "07/01/2018",
        payment: 150000.00 * (.1 / 12)
      },
      {
        type: "Florida International University Student Loan",
        purchasePrice: 6500.00,
        loanAmount: 6000.00,
        collateral: 0.00,
        oustanding: 4245.00,
        rate: 1,
        repayment: 19,
        dueDate: "07/01/2018",
        payment: 6000.00 * (.01 / 12)
      },]
    // ];
    return loans
  }

}
