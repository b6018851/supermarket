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

Manager manager

TeamLeader teamleader

Team team

static hasMany=[tasks:Task, shifts:Shift]

static belongsTo=[Task, Shift]

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
shifts blank:true, nullable:true
manager blank:true, nullable:true
teamleader blank:true, nullable:true
team blank:true, nullable:true
tasks blank:true, nullable:true
    }
}
