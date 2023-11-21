import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {

  constructor() { }

  getTransactions(){
   let transactions =
        [{
          date: "01/18/2021",
          type: "Credit",
          amount: 2000,
          description: "Airline"
        },
        {
          date: "02/05/1990",
          type: "Debit",
          amount: 51,
          description: "Busfare"
        },]
    // ];
    return transactions
  }
}
