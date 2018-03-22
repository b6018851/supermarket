package com.dstone

class Manager {

String fullName

String userName

String password

String managerEmail

String office

String department


String toString(){
return fullName
}



    static constraints = {
fullName blank:false,nullable:false
userName blank:false,nullable:false
password blank:false,nullable:false
managerEmail blank:false,nullable:false
office blank:false,nullable:false
department blank:false,nullable:false
    }
}
