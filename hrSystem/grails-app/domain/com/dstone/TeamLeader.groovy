package com.dstone

class TeamLeader {
String fullName

String department

String employeeid

String sectionName

int officePhone

String leaderEmail

String password

Employee employee

static hasMany=[managers:Manager]

String toString(){
return fullName
}

    static constraints = {
fullName blank:false,nullable:false
department blank:false,nullable:false
employeeid blank:true,nullable:false
sectionName blank:true,nullable:false
officePhone blank:true,nullable:false
leaderEmail blank:false,nullable:false, email:true
password blank:false,nullable:false
employee blank:true, nullable:true

    }
}
