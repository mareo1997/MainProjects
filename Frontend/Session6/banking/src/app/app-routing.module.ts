import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoanInfoComponent } from './loan/loan-info/loan-info.component';
import { HomeComponent } from './home/home.component';

export const routes: Routes = [
  {
    path: "home",
    component: HomeComponent
  },
  {
    path: "loan/loan-info",
    component: LoanInfoComponent
  },
  {
    path: "",
    redirectTo: "/home",
    pathMatch: "full"
  }
];
  
  @NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule { }