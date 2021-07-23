import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListPhones } from './component/list-phones/list-customer.component';
import { CustomersResolver } from './resolvers/customer.resolver';

const routes: Routes = [
  {
    path: '',
    children: [
      {
        path: 'customersPhones',
        component: ListPhones,
        resolve: { customers: CustomersResolver }
      },


    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
