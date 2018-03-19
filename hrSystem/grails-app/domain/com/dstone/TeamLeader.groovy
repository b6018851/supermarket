package com.dstone

class TeamLeader {
String fullName

String department

String employeeID

String sectionName

int officePhone

String leaderEmail

String password

Manager manager

Team team

static hasMany=[employees:Employee]

static belongsTo=[Employee]

String toString(){
return fullName
}

    static constraints = {
fullName blank:false,nullable:false
department blank:false,nullable:false
employeeID blank:true,nullable:false
sectionName blank:true,nullable:false
officePhone blank:true,nullable:false
leaderEmail blank:false,nullable:false
password blank:false,nullable:false
manager blank:true, nullable:true
team blank:true, nullable:true
employees blank:true, nullable:true

    }
}
