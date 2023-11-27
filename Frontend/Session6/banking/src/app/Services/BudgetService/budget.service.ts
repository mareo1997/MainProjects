import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BudgetService {
  
  budget: Array<{
    type: string;
    category: string;
    amount: number;
  }> = [{
    type: "Want",
    category: "New Tv",
    amount: 500,
  }, {
    type: "Need",
    category: "Rent",
    amount: 400,
  }, {
    type: "Need",
    category: "Debt",
    amount: 90,
  }, {
    type: "Need",
    category: "Electricity",
    amount: 700,
  }, {
    type: "Want",
    category: "Clothes",
    amount: 150,
  }, {
    type: "Want",
    category: "Eating out",
    amount: 350,
  }, {
    type: "Need",
    category: "Car",
    amount: 125,
  }];

  constructor() { }

  getBudget() {
    return this.budget
  }

  setBudget(budget: { type: string; category: string; amount: any; }) {
    this.budget.push(budget)
  }

}
