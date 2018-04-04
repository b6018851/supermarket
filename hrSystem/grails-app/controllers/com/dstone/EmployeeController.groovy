package com.dstone

class EmployeeController {

    def scaffold=Employee

    def search(){}

    def results(){

    def employeesProps=Employee.metaClass.properties*.name
    
    def employees = Employee.withCriteria {
    "${params.queryType}" {
    params.each{ 
    field, value ->
    if (employeesProps.grep(field) && value) {
    ilike(field, value)

}
}
}
}


    return [ employees:employees]
}
}










