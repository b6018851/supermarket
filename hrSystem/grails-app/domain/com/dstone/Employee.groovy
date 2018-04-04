package com.dstone

class Employee {

String fullname

Date dateOfBirth

String residence

String hourlyRate

String employeeid

Date dateEmployed

String taxcode

String contract


static hasMany=[managers:Manager, teamleaders:TeamLeader, shifts:Shift, teams:Team, tasks:Task]

static belongsTo=[Team]

String toString(){
return fullname
}





    static constraints = {
fullname blank:false, nullable:false
dateOfBirth blank:false, nullable:false
residence blank:false, nullable:false
hourlyRate blank:false, nullable:false
employeeid blank:false, nullable:false
dateEmployed blank:false, nullable:false
taxcode blank:false, nullable:false
contract blank:false, nullable:false

   }
}

