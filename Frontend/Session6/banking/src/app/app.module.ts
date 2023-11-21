import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { CommonModule } from "@angular/common";
import { BrowserModule } from "@angular/platform-browser";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { AppComponent } from "./app.component";
import { TransactionsComponent } from "./transactions/transactions.component";

// import { IgxItemLegendModule, IgxPieChartModule } from 'igniteui-angular-charts';
import { NgChartsModule } from "ng2-charts";

@NgModule({
    bootstrap: [AppComponent],
    declarations: [
        AppComponent,
        TransactionsComponent
    ],
    imports: [
        BrowserModule,
        BrowserAnimationsModule,
        CommonModule,
        FormsModule,
        NgChartsModule,
        
        // IgxItemLegendModule,
        // IgxPieChartModule
    ],
    providers: [],
    //   entryComponents: [],
    schemas: []
})
export class AppModule { }