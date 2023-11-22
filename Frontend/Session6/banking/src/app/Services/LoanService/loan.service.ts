import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoanService {

  constructor() { }

  getLoans(){
    let loans =
         [{
          type: "Toyota Car Loan",
          oustanding: 4500,
          rate: 2.5,
          dueDate: "07/01/2018",
          payment: 4500 * (2.5/12)
         },
         {
          type: "802 Northward Mortgage",
          oustanding: 15000,
          rate: 10,
          dueDate: "07/01/2018",
          payment: 15000 * (10/12)
         },
         {
          type: "Florida International University Student Loan",
          oustanding: 1000,
          rate: 1,
          dueDate: "07/01/2018",
          payment: 1000 * (1/12)
         },]
     // ];
     return loans
   }
}
