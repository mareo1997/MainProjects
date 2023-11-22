import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {

  constructor() { }

  getTransactions() {
    let transactions =
      [{
        date: "11/28/2023",
        type: "Credit",
        amount: 2000.00,
        description: "AIRLINE"
      },
      {
        date: "11/25/2023",
        type: "Debit",
        amount: 51,
        description: "BUSFARE"
      }, {
        date: "11/19/2023",
        type: "Credit",
        amount: 251.20,
        description: "JETBLUE AIRWAYS"
      },
      {
        date: "11/19/2023",
        type: "Debit",
        amount: 4.66,
        description: "UBER TRIP"
      }, {
        date: "11/18/2023",
        type: "Credit",
        amount: 10.55,
        description: "DOMINO'S 5172"
      },
      {
        date: "11/11/2023",
        type: "Debit",
        amount: 5.36,
        description: "IFNOTNOW MOVEMENT"
      },
      {
        date: "11/08/2023",
        type: "Debit",
        amount: 42.99,
        description: "WALGREENS #3193"
      }, {
        date: "11/04/2023",
        type: "Credit",
        amount: 141.65,
        description: "DIRECTV*STREAM"
      },
      {
        date: "10/31/2023",
        type: "Debit",
        amount: 5.00,
        description: "PAYPAL"
      }, {
        date: "10/21/2023",
        type: "Credit",
        amount: 13.00,
        description: "LYFT RIDE 10-19"
      },
      {
        date: "09/25/2023",
        type: "Debit",
        amount: 16.23,
        description: "AMAZON PRIME"
      },]
    return transactions
  }
}
