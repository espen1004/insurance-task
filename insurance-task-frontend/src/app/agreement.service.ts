import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";


@Injectable()
export class AgreementService {
  constructor(private httpClient: HttpClient) {}

  createAgreement(createAgreementRequest: any): Observable<any> {
    const url = "/api/agreements";
    return this.httpClient.post(url, createAgreementRequest);
  }
}
