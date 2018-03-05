package com.dstone

class Manager {

String fullName

String userName

String password

String employeeEmail

String office

String department

static hasMany=[employees:Employee, teamleaders:TeamLeader]

    static constraints = {
fullName blank:false,nullable:false
userName blank:false,nullable:false
password blank:false,nullable:false
employeeEmail blank:false,nullable:false
office blank:false,nullable:false
department blank:false,nullable:false
    }
}
