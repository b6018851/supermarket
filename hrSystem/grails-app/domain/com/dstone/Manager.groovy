package com.dstone

class Manager {

String fullName

String username

String password

String managerEmail

String office

String department

TeamLeader teamleader

Employee employee


String toString(){
return fullName
}



    static constraints = {
fullName blank:false, nullable:false
username blank:false, nullable:false
password blank:false, nullable:false
managerEmail blank:false, nullable:false
office blank:false, nullable:false
department blank:false, nullable:false
teamleader blank:true, nullable:true
employee blank:true, nullable:true
    }
}
