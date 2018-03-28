package com.dstone

class Employee {

String fullName

Date dateOfBirth

String residence

String hourlyRate

String employeeID

Date dateEmployed

String taxCode

String contract


static hasMany=[managers:Manager, teamleaders:TeamLeader, shifts:Shift, teams:Team, tasks:Task]

static belongsTo=[Team]

String toString(){
return fullName
}

    static constraints = {
fullName blank:false, nullable:false
dateOfBirth blank:false, nullable:false
residence blank:false, nullable:false
hourlyRate blank:false, nullable:false
employeeID blank:false, nullable:false
dateEmployed blank:false, nullable:false
taxCode blank:false, nullable:false
contract blank:false, nullable:false

    }
}
