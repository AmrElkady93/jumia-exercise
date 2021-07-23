import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders, HttpResponse } from "@angular/common/http";
import { Customer } from "../model/customer";
import { Constants } from "../constant/constant";


@Injectable({
  providedIn: "root"
})
export class CustomerService {
  headers: HttpHeaders;
  constructor(private http: HttpClient) {
    this.headers = new HttpHeaders();
    this.headers.append("Content-Type", "application/json");
    this.headers.append("accept", "*/*");
  }

  getAllCustomers() {

    return this.http.get<Customer[]>(
      Constants.WebServicesURLs.getAllCustomers,
      {
        headers: this.headers,
        observe: "response"
      }
    );
  }

}
