package com.dstone

class Shift {

String timeOfDay

String dayOfWeek

int numberOfHours

String startingTime

Employee employee

static hasMany=[teams:Team, tasks:Task]

    static constraints = {

timeOfDay blank:false, nullable:false
dayOfWeek blank:false, nullable:false
numberOfHours blank:false, nullable:false
startingTime blank:false, nullable:false
    }
}
