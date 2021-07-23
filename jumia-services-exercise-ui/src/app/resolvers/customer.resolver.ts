import { Injectable } from "@angular/core";
import { Router, Resolve, ActivatedRouteSnapshot } from "@angular/router";
import { map, catchError } from "rxjs/operators";
import { Constants } from "../constant/constant";
import { CustomerService } from "../service/customer.service";

@Injectable()
export class CustomersResolver implements Resolve<any> {
  constructor(
    private customerService: CustomerService,
    private router: Router,
  ) { }

  resolve(route: ActivatedRouteSnapshot) {
    return this.customerService.getAllCustomers().pipe(
      map((res) => {
        if (res.status === Constants.responseCodes.SUCCESS) {
          console.log("sdsadasdasd" + res)
          return res.body;
        } else if (res.status === Constants.responseCodes.FORBIDDEN) {
          return [];
        } else if (res.status === Constants.responseCodes.UNAUTHORIZED) {
          return [];
        } else if (res.status === Constants.responseCodes.CREATED) {
          return [];
        } else if (res.status === Constants.responseCodes.NOT_FOUND) {
          return [];
        } else {
          return [];
        }
      }),
      catchError((error) => {
        if (error.status == Constants.responseCodes.UNAUTHORIZED) {
          this.router.navigate(["/logOut"]);
        } else if (!error.error || !error.error.errorMessage) {
        } else {
        }
        return [];
      })
    );
  }
}
