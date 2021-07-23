export class Customer {
  id: string;
  name: string;
  phone: string;
  country: string;
  countryCode: string;
  number: string;
  state: boolean;

  constructor(
    id: string,
    name: string,
    phone: string,
    country: string,
    countryCode: string,
    number: string,
    state: boolean,
  ) {
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.country = country;
    this.countryCode = countryCode;
    this.number = number;
    this.state = state;


  }
}
