import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';
import {HttpClient} from "@angular/common/http";
import {AgreementService} from "./agreement.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'insurance-task-frontend';

  form: FormGroup;
  submitted = false;

  constructor(private http: HttpClient, private agreementService: AgreementService) {
  }


  ngOnInit() {
    this.form = new FormGroup({
      carRegistrationNumber: new FormControl('', [Validators.required]),
      customerPid: new FormControl('', Validators.required),
      firstName: new FormControl('', Validators.required),
      lastName: new FormControl('', Validators.required),
      email: new FormControl('', [Validators.required, Validators.email]),
    });
  }

  next() {
    this.submitted = true;
    if (this.form.invalid) {
      return;
    }
    this.agreementService.createAgreement(this.form.value).subscribe((response) => {
      console.log(response);
    });
  }

  get f(): { [key: string]: AbstractControl } {
    return this.form.controls;
  }

  cancel() {
    console.log("Not implemented")
  }
}
