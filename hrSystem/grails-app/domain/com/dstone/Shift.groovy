package com.dstone

class Shift {

String timeOfDay

String dayOfWeek

int numberOfHours

String startingTime

Task task

String toString(){
return timeOfDay
}

    static constraints = {

timeOfDay blank:false, nullable:false
dayOfWeek blank:false, nullable:false
numberOfHours blank:false, nullable:false
startingTime blank:false, nullable:false
task blank:true, nullable:true
    }
}
