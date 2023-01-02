import { Component, OnInit } from '@angular/core';
import { Checkin } from '../_services/checkin';
import { FlightService } from '../_services/flight.service';

@Component({
  selector: 'app-checkin',
  templateUrl: './checkin.component.html',
  styleUrls: ['./checkin.component.css']
})
export class CheckinComponent implements OnInit {
  checkin!:Checkin;

  constructor(private service: FlightService) { }

  ngOnInit(): void {
    this.checkin = new Checkin();
  }

  createCheckin() {
    if (confirm('You have Checked-In successfully!!!')) {
    this.service.createCheckin(this.checkin)
    .subscribe(data => {
      this.checkin = new Checkin();
    }
  , error => {
      console.log(error);
    });
  }
  }
}
