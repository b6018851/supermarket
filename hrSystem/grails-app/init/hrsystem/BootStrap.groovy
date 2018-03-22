package com.dstone

class BootStrap {

    def init = { servletContext ->

def man1=new Manager(
fullName:'Steve Crossbar',
userName:'scross',
password:'password1',
managerEmail:'scross@email.com',
office:'B1-900',
department:'Grocery',
).save()

def man2=new Manager(
fullName:'Bob Handle',
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
).save()


def tl2=new TeamLeader(
fullName:'Thomas Mulhurn',
department:'Electronics',
employeeID:'TL2222',
sectionName:'Computers',
officePhone: '02222888',
leaderEmail:'tmul@email.com',
password:'leader2',
manager:man2
).save()

def task1=new Task(
taskName:'Replenish',
numberOfPeople:8,
sectionName:'Fruit',
department:'Groceries',
timeRequired:'1 hour',
description:'Replenishing stock',
taskCompleted:true
).save()

def task2=new Task(
taskName:'Facing Up',
numberOfPeople:2,
sectionName:'Cans',
department:'Groceries',
timeRequired:'2 Hours',
description:'Face up all canned goods',
taskCompleted:true
).save()


def shift1=new Shift(
timeOfDay:'Morning',
dayOfWeek:'Monday',
numberOfHours:'4',
startingTime:'6:00am',
task: task1
).save()

def shift2=new Shift(
timeOfDay:'Afternoon',
dayOfWeek:'Tuesday',
numberOfHours:'6',
startingTime:'12:00am',
task: task2
).save()


def team1=new Team(
teamName:'Team Loading',
numberOfEmployees:'10',
sectionName:'Bakery',
description:'Loading deliveries',
teamleader:tl1,
shift: shift1,
task: task1
).save()

def team2=new Team(
teamName:'Team Unloading',
numberOfEmployees:'20',
sectionName:'Groceries',
description:'Unloading deliveries',
teamleader:tl2,
shift: shift2,
task: task2
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
teamleader:tl1,
team:team1,
shift: shift1,
task: task1
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
teamleader:tl2,
team:team2,
shift: shift2,
task: task2
).save()







//task1.addToshifts(shift1)
//shift2.addTotasks(task2)
//emp1.addTotasks(task1)
//emp2.addTotasks(task2)
//team1.addTotasks(task1)
//team2.addTotasks(task2)
//team1.addTotasks(task1)
//team2.addTotasks(task2)
//emp1.addTotasks(task1)
//emp2.addTotasks(task2)
//shift1.addToemployees(emp1)
//man1.addToemployees(emp1)
//tl1.addToemployees(emp1)
//team1.addToemployees(emp1)
//shift2.addToemployees(emp2)
//man2.addToemployees(emp2)
//tl2.addToemployees(emp2)
//team2.addToemployees(emp2)
//tl1.addToteams(team1)
//tl2.addToteams(team2)
//man1.addToteamleaders(tl1)
//man2.addToteamleaders(tl2)



    }
    def destroy = {
    }
}
