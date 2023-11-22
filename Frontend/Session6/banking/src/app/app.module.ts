import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { CommonModule } from "@angular/common";
import { BrowserModule } from "@angular/platform-browser";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { AppComponent } from "./app.component";
import { TransactionsComponent } from "./transactions/transactions.component";
import { NgxPaginationModule } from 'ngx-pagination';
import { NgChartsModule } from "ng2-charts";
import { HttpClientModule } from "@angular/common/http";
import { IgxItemLegendModule, IgxPieChartModule } from "igniteui-angular-charts";
import { RouterModule, RouterLink } from '@angular/router';
import { LoanComponent } from "./loan/loan.component";
import { LoanInfoComponent } from "./loan/loan-info/loan-info.component";
import { HomeComponent } from "./home/home.component";
import { AppRoutingModule } from "./app-routing.module";
import { BankingModule } from "./banking/banking.module";
import { PaginationComponent } from "./pagination/pagination.component";

@NgModule({
    bootstrap: [AppComponent],
    declarations: [
        AppComponent,
        HomeComponent,
        TransactionsComponent,
        LoanComponent,
        LoanInfoComponent,
        PaginationComponent
    ],
    imports: [
        BrowserModule,
        BrowserAnimationsModule,
        CommonModule,
        FormsModule,
        NgChartsModule,
        NgxPaginationModule,
        HttpClientModule, 
        IgxItemLegendModule,
        IgxPieChartModule,
        RouterModule,
        AppRoutingModule,
        BankingModule
    ],
    providers: [], 
    //   entryComponents: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AppModule { }