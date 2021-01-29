import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PonctuationComponent } from './ponctuation/ponctuation.component';


const routes: Routes = [
  {path:'**',component:PonctuationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
