import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Router } from 'express';
import { Checkin } from '../_services/checkin';
import { FlightService } from '../_services/flight.service';

@Component({
  selector: 'app-checkin',
  templateUrl: './checkin.component.html',
  styleUrls: ['./checkin.component.css']
})
export class CheckinComponent implements OnInit {
  checkin!:Checkin
  message!: string;

  // inject service class
  constructor(private service: FlightService) { }

  ngOnInit(): void {
    // when page is loaded clear form data
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
