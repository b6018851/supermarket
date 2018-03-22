package com.dstone

class Task {

String taskName

int numberOfPeople

String sectionName

String department

String timeRequired

String description

Boolean taskCompleted



String toString(){
return taskName
}

    static constraints = {

taskName blank:false, nullable:false
numberOfPeople blank:false, nullable:false
sectionName blank:false, nullable:false
department blank:false, nullable:false
timeRequired blank:false, nullable:false
description blank:false, nullable:false
taskCompleted blank:false, nullable:false
    }
}
