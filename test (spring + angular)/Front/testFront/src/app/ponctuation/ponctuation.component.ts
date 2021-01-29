import { Component, OnInit } from '@angular/core';
import { MyServiceService } from '../my-service.service';

@Component({
  selector: 'app-ponctuation',
  templateUrl: './ponctuation.component.html',
  styleUrls: ['./ponctuation.component.css']
})
export class PonctuationComponent implements OnInit {

  constructor(private service:MyServiceService) { }
numb:number;
text:string;
result:number;
  ngOnInit(): void {
  }
  calculate(){
    let resp=this.service.calculPonctuation(this.text);
    resp.subscribe((data)=>this.result=data);
  }

}
