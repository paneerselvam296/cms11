import { Component, OnInit } from '@angular/core';
import { InsertService } from '../insert.service';

@Component({
  selector: 'app-home2',
  templateUrl: './home2.component.html',
  styleUrls: ['./home2.component.css']
})
export class Home2Component implements OnInit {
 // products:any;
 // productCount: any;
  constructor(private is:InsertService) {
   // this.loadUserCount();
   }
ngOnInit(): void {
 
  }
 
 /*loadUserCount(){
  this.is.getUserCount().subscribe((product:any)=>{
    this.productCount= product[0].Count;
  });
 } */

}
