package com.dstone

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class EmployeeSpec extends Specification implements DomainUnitTest<Employee> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {
      when: "An Employee has a name, residence and contract"

def emp1 = new Employee(
fullName:'Tom Rivers',
residence:'Sheffield',
contract:'Full-time')
then: "The toString method will merge them."
emp1.toString() == 'Tom Rivers, Sheffield, Full-Time'
    }
}
