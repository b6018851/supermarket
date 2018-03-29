package com.dstone

class EmployeeController {

    def scaffold=Employee
    def search(){}

    def results(full_name){}

    def employees=Employee.where{
    full_name=~full_name
    }.list()

    return [employees:employees,
    term:params.full_name,
    totalEmployeess: Employee.count()]

}
