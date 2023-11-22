import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoanInfoComponent } from './loan/loan-info/loan-info.component';

export const routes: Routes = [
  {
    path: "loan/loan-info",
    component: LoanInfoComponent
  }
];
  
  @NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule { }