import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import { LoanService } from '../Services/LoanService/loan.service';
import { NetworthService } from '../Services/NetworthService/networth.service';
import { TransactionService } from '../Services/TransactionService/transaction.service';
import { OnInit } from '@angular/core';
import { Chart } from 'chart.js';
import { BudgetService } from '../Services/BudgetService/budget.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {

  title = 'Financial Dashboard';
  currentPage: number = 1
  itemsPerPage: number = 5
  selectType: string = "Empty";

  transactions: Array<{
    date: string;
    type: string;
    amount: number;
    description: string;
  }> = [];

  loanlist: { type: string; purchasePrice: number; loanAmount: number; collateral: number; oustanding: number; rate: number; repayment: number; dueDate: string; payment: number; }[] = [];
  totalItems: number = 0;
  currentItemsToShow: any;

  budget: { type: string; category: string; amount: number; }[] = [];
  items: any;
  networth: NetworthService = new NetworthService;
  categoryList: string[] = [];
  amountList: number[] = [];
  selectedValue: any;
  description: any;
  selectedDescription: string = '';
  selectedAmount: number = 0;
  newBudget: any;
  amount: any;
  category: string = '';
  open: boolean = false;

  constructor(private transactionservice: TransactionService, private networthService: NetworthService, private loanService: LoanService, private router: Router, private budgetService: BudgetService) {
  }

  ngOnInit() {
    this.transactions = this.transactionservice.getTransactions()
    this.totalItems = this.transactions.length
    this.currentPage = 1
    this.networth = this.networthService
    this.loanlist = this.loanService.getLoansList()

    this.initalizeBudget()

    this.initalizeChart()

  }

  loanInfo(loan: any) {
    this.loanService.getLoans(loan);
    this.router.navigate(["/loan/loan-info"])
  }

  changeCategory(e: any) {
    this.category = e.target.value;
    console.log(this.category)
  }

  changeAmount(e: any) {
    this.amount = e.target.value;
    console.log(this.amount)
  }

  openBudget() {
    this.open = true;
  }

  closeBudget() {
    this.open = false;
  }

  createBudget() {
    let budget = {
      type: this.selectType,
      category: this.category,
      amount: this.amount
    }

    console.log(budget)

    this.budgetService.setBudget(budget)

    this.initalizeBudget()

    this.open = false;
  }

  initalizeBudget() {
    this.budget = this.budgetService.getBudget()

    console.log(this.budget)

    this.categoryList = []
    this.amountList = []
    
    this.budget.forEach(b => {
      this.categoryList.push(b.category);
      this.amountList.push(b.amount);
    });

    let budgetChart = new Chart('budgetChart', {
      type: 'pie',
      data: {
        labels: this.categoryList,
        datasets: [{
          label: '$',
          data: this.amountList,
          backgroundColor: [
            'rgba(255, 99, 132, 0.2)',
            'rgba(54, 162, 235, 0.2)',
            'rgba(255, 206, 86, 0.2)',
            'rgba(75, 192, 192, 0.2)',
            'rgba(153, 102, 255, 0.2)',
            'rgba(255, 159, 64, 0.2)',
            'rgba(255, 99, 132, 0.2)',
            'rgba(54, 162, 235, 0.2)',
            'rgba(255, 206, 86, 0.2)',
            'rgba(75, 192, 192, 0.2)',
            'rgba(153, 102, 255, 0.2)',
            'rgba(255, 159, 64, 0.2)'
          ],
          borderColor: [
            'rgba(255, 99, 132, 1)',
            'rgba(54, 162, 235, 1)',
            'rgba(255, 206, 86, 1)',
            'rgba(75, 192, 192, 1)',
            'rgba(153, 102, 255, 1)',
            'rgba(255, 159, 64, 1)',
            'rgba(255, 99, 132, 1)',
            'rgba(54, 162, 235, 1)',
            'rgba(255, 206, 86, 1)',
            'rgba(75, 192, 192, 1)',
            'rgba(153, 102, 255, 1)',
            'rgba(255, 159, 64, 1)'
          ],
          borderWidth: 1
        }]
      },
      options: {
        scales: {
          y: {
            beginAtZero: true
          }
        }
      }
    });
  }


  initalizeChart() {
    var networthChart = new Chart('networthChart', {
      type: 'pie',
      data: {
        labels: ['Rent', 'Water', 'Electricity', 'Food and Groceries', 'Debt', 'Deposits'],
        datasets: [{
          label: '$',
          data: [1000, 500, 2000, 400, 1300, 5200],
          backgroundColor: [
            'rgba(255, 99, 132, 0.2)',
            'rgba(54, 162, 235, 0.2)',
            'rgba(255, 206, 86, 0.2)',
            'rgba(75, 192, 192, 0.2)',
            'rgba(153, 102, 255, 0.2)',
            'rgba(255, 159, 64, 0.2)'
          ],
          borderColor: [
            'rgba(255, 99, 132, 1)',
            'rgba(54, 162, 235, 1)',
            'rgba(255, 206, 86, 1)',
            'rgba(75, 192, 192, 1)',
            'rgba(153, 102, 255, 1)',
            'rgba(255, 159, 64, 1)'
          ],
          borderWidth: 1
        }]
      },
      options: {
        scales: {
          y: {
            beginAtZero: true
          }
        }
      }
    });
  }

  onTableDataChange(event: any): void {
    // this.tableSize = event.target.value;
    this.currentPage = 1
    // this.transactions
  }

  onPageChange($event: { pageIndex: number; pageSize: number; }) {
    this.currentItemsToShow = this.items.slice($event.pageIndex * $event.pageSize,
      $event.pageIndex * $event.pageSize + $event.pageSize);
  }

  // getPaginatedData(){
  //   const start = 1//
  //   const end = start + this.itemsPerPage
  //   return this.data.slice(start,end)
  // }

  changePage(page: number) {
    this.currentPage = page
  }
  //Alt+Shift+F
}
