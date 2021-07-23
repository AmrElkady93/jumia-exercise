import { AfterViewInit, Component, OnInit, TemplateRef, ViewChild } from '@angular/core';
import { FormControl } from '@angular/forms';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { ActivatedRoute, Router } from '@angular/router';
import { Customer } from 'src/app/model/customer';
import { CustomerService } from 'src/app/service/customer.service';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListPhones implements OnInit, AfterViewInit {

  customersList: Customer[];
  dataSource: any
  countryNameFilter: FormControl;
  stateFilter: FormControl;
  filterValues = {
    countryName: '',
    state: '',
  };

  mainConfiguration = {
    title: "Customer List",
  };

  @ViewChild(MatSort) sort: MatSort;
  @ViewChild('paginator') paginator: MatPaginator;


  constructor(private router: Router,
    private customerService: CustomerService,
    private route: ActivatedRoute) {
  }

  // to access this columns
  displayedColumns: string[] = ['id', 'name', 'country', 'countryCode', 'phone', 'state'];

  createFilter(): (data: any, filter: string) => boolean {
    let filterFunction = function (data, filter): boolean {
      let searchTerms = JSON.parse(filter);
      let searchTermsEnabled = searchTerms.state.toLowerCase();
      let statusFilterValue = searchTermsEnabled === '' ? '' : (searchTermsEnabled === 'valid' ? true : false);
      return data.country.toLowerCase().indexOf(searchTerms.countryName.toLowerCase()) !== -1
        && data.state.toString().toLowerCase().indexOf(statusFilterValue) !== -1
    }
    return filterFunction;
  }

  onStateSelectionChange(obj) {
    this.filterValues.state = obj.value
  }

  onCountryNameSelectionChange(obj) {
    this.filterValues.countryName = obj.value
  }

  ngAfterViewInit() {

    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }

  ngOnInit(): void {

    this.customersList = this.route.snapshot.data["customers"]
      ? this.route.snapshot.data["customers"]
      : [];

    console.log(this.customersList)
    this.dataSource = new MatTableDataSource(this.customersList);
    this.dataSource.filterPredicate = this.createFilter();


    this.countryNameFilter = new FormControl();
    this.stateFilter = new FormControl();

    this.stateFilter.valueChanges
      .subscribe(
        state => {
          this.filterValues.state = state === 'all' ? '' : state;
          this.dataSource.filter = JSON.stringify(this.filterValues);
        })

    this.countryNameFilter.valueChanges
      .subscribe(
        name => {
          this.filterValues.countryName = name === 'All' ? '' : name;
          this.dataSource.filter = JSON.stringify(this.filterValues);
          console.log(name)
        })
  }

}
