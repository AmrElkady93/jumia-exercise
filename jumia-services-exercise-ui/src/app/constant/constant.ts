declare var API_URL: string;
declare var API_PREFIX: string;
export class Constants {
  public static serverURL = API_URL + API_PREFIX;



  public static WebServicesURLs = {
    getAllCustomers: Constants.serverURL + "/customers"
  };
  public static responseCodes = {
    SUCCESS: 200,
    CREATED: 201,
    UNAUTHORIZED: 401,
    FORBIDDEN: 403,
    NOT_FOUND: 404,
    ALREADY_LOGGED: 209,
    REQUEST_TIMEOUT: 408,
  };
}
