package com.dstone

class BootStrap {

    def init = { servletContext ->

def man1=new Manager(
fullname:'Steve Crossbar',
userName:'scross',
password:'password1',
managerEmail:'scross@email.com',
office:'B1-900',
department:'Grocery'
).save()

def man2=new Manager(
fullname:'Bob Handle',
userName:'bhandle',
password:'password2',
managerEmail:'bhandle@email.com',
office:'B1-800',
department:'Electronics'
).save()

def tl1= new TeamLeader(
fullName:'Sarah Macdonald',
department:'Grocery',
employeeID:'TL1111',
sectionName:'Bakery',
officePhone: '01111777',
leaderEmail:'smac@email.com',
password:'leader1',
manager:man1
//team:
).save()

def tl2=new TeamLeader(
fullName:'Thomas Mulhurn',
department:'Electronics',
employeeID:'TL2222',
sectionName:'Computers',
officePhone:'02222888',
leaderEmail:'tmul@email.com',
password:'leader2',
manager:man2
//team:
).save()

def emp1=new Employee(
fullName:'Tom Rivers',
dateOfBirth:new Date ('05/05/1999'),
residence:'Sheffield',
hourlyRate:'7.50',
employeeID:'E25555',
dateEmployed:new Date ('26/02/2018'),
taxCode:'TX345',
contract:'Full-time',
manager:man1,
teamleader:tl1
//shift:
//team:
).save()

def emp2=new Employee(
fullName:'Sam Jones',
dateOfBirth:new Date ('02/08/1995'),
residence:'Rotherham',
hourlyRate:'7.50',
employeeID:'E26666',
dateEmployed:new Date ('01/01/2017'),
taxCode:'TX345',
contract:'Full-time',
manager:man2,
teamleader:tl2
//shift:
//team:
).save()






    }
    def destroy = {
    }
}
