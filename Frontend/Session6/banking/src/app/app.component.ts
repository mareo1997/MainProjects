import { Component, ViewChild } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router, RouterOutlet } from '@angular/router';
import { TransactionService } from './Services/TransactionService/transaction.service';
import { NetworthService } from './Services/NetworthService/networth.service';
import { LoanService } from './Services/LoanService/loan.service';
import { IgxItemLegendComponent, IgxPieChartComponent } from 'igniteui-angular-charts';
import { EnergyGlobalDemand } from './Class/energy-global-demand';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Financial Dashboard';
  assets: number = 0;
  liabilities: number = 0;
  networth: number = 0;
  p: number = 1
  count: number = 0

  // transactions: Array<{
  //   date: string;
  //   type: string;
  //   amount: number;
  //   description: string;
  // }>//,
  // // ];
  // loans: Array<{
  //   type: string;
  //   oustanding: number,
  //   rate: number,
  //   dueDate: string,
  //   payment: number,
  // }>

  // constructor(transactionservice: TransactionService, networthService: NetworthService, loanService: LoanService, private router: Router) {
  //   this.transactions = transactionservice.getTransactions()
  //   this.assets = networthService.assets;
  //   this.liabilities = networthService.liabilities;
  //   this.networth = this.assets - this.liabilities;
  //   // this.loans = loanService.getLoans()
  // }

  // loanInfo(loan: any){
  //   console.log(loan)
  //   // routerLink="/trainer/registration"
  //   this.router.navigate(["/loan/loan-info"])
  // }

  ngOnInit() {
  }

  onTableDataChange(event:any): void{
    // this.tableSize = event.target.value;
    this.p = 1
    // this.transactions
  }
  //Alt+Shift+F

  @ViewChild("legend", { static: true } )
  private legend: IgxItemLegendComponent | undefined
  @ViewChild("chart", { static: true } )
  private chart: IgxPieChartComponent | undefined

  private _energyGlobalDemand: EnergyGlobalDemand | undefined;
  public get energyGlobalDemand(): EnergyGlobalDemand {
      if (this._energyGlobalDemand == null)
      {
          this._energyGlobalDemand = new EnergyGlobalDemand();
      }
      return this._energyGlobalDemand;
  }


}
