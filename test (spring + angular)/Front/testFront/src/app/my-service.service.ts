import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MyServiceService {

  constructor(private httpclient:HttpClient) { }

  public calculPonctuation(data){
 
   return this.httpclient.post<any>("http://localhost:8080"+"/calculate",data);
}
}
