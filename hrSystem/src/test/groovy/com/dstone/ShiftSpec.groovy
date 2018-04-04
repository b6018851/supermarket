package com.dstone

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ShiftSpec extends Specification implements DomainUnitTest<Shift> {

    def setup() {
    }

    def cleanup() {
    }

    void totalNumberOfHours() {
     
when: "A Shift has dayOfWeek and numberOfHours"

def shift1 = new Shift(
dayOfWeek: 'Monday',
numberOfHours: 4)
then: "The calculateHoursForFourWeeks method will total hours"
shift1.calculateHoursForFourWeeks() == 16
    }
}
