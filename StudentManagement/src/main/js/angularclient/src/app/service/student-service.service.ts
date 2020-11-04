import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Student } from '../model/student';
import { Observable } from 'rxjs/internal/Observable';

@Injectable()
export class StudentService {

  private getStudentsUrl: string;
  private addStudentsUrl: string;

  constructor(private http: HttpClient) {
    this.getStudentsUrl = 'http://localhost:8080/studentManagement/students';
    this.addStudentsUrl = 'http://localhost:8080/studentManagement/addStudent';
  }

  public findAll(): Observable<Student[]> {
    return this.http.get<Student[]>(this.getStudentsUrl);
  }

  public save(student: Student) {
    return this.http.post<Student>(this.addStudentsUrl, student);
  }
}