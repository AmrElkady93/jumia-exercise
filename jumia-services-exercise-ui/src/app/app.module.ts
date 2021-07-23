import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatNativeDateModule, MatPseudoCheckboxModule, MatRippleModule } from '@angular/material/core';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatSortModule } from '@angular/material/sort';
import { MatInputModule } from '@angular/material/input';
import { MatTableModule } from '@angular/material/table';
import { MatSelectModule } from '@angular/material/select';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { NzIconModule } from 'ng-zorro-antd/icon';
import { NzMenuModule } from 'ng-zorro-antd/menu';
import { NzSwitchModule } from 'ng-zorro-antd/switch';
import { NzLayoutModule } from 'ng-zorro-antd/layout';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListPhones } from './component/list-phones/list-customer.component';
import { CustomersResolver } from './resolvers/customer.resolver';

@NgModule({
  declarations: [
    AppComponent,
    ListPhones

  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    MatPaginatorModule,
    AppRoutingModule,
    MatTableModule,
    MatPseudoCheckboxModule,
    MatNativeDateModule,
    MatRippleModule,
    MatSortModule,
    MatFormFieldModule,
    HttpClientModule,
    BrowserAnimationsModule,
    NzLayoutModule,
    NzMenuModule,
    NzIconModule,
    NzSwitchModule,
    MatInputModule,
    MatSelectModule

  ],
  providers: [CustomersResolver],
  bootstrap: [AppComponent]
})
export class AppModule { }
