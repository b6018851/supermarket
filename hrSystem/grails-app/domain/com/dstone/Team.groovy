package com.dstone

class Team {

String teamName

int numberOfEmployees

String sectionName

String description

TeamLeader teamleader

static hasMany=[employees:Employee, shifts:Shift, tasks:Task]

static belongsTo=[Employee, Shift, Task]

String toString(){
return teamName
}

    static constraints = {
teamName blank:false, nullable:false
numberOfEmployees blank:false, nullable:false
sectionName blank:false, nullable:false
description blank:false, nullable:false, maxSize:5000, widget:'textarea' 
employees blank:true, nullable:true
shifts blank:true, nullable:true
tasks blank:true, nullable:true
    }
}
