package com.dstone

class BootStrap {

    def init = { servletContext ->

/*def task1=new Task(
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

def emp1=new Employee(
fullName:'Tom Rivers',
dateOfBirth:new Date ('05/05/1999'),
residence:'Sheffield',
hourlyRate:'7.50',
employeeID:'E25555',
dateEmployed:new Date ('26/02/2018'),
taxCode:'TX345',
contract:'Full-time',
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
).save()

def shift1=new Shift(
timeOfDay:'Morning',
dayOfWeek:'Monday',
numberOfHours:'4',
startingTime:'6:00am',
employee: emp1
).save()

def shift2=new Shift(
timeOfDay:'Afternoon',
dayOfWeek:'Tuesday',
numberOfHours:'6',
startingTime:'12:00am',
employee: emp2
).save()

def tl1= new TeamLeader(
fullName:'Sarah Macdonald',
department:'Grocery',
employeeid:'TL1111',
sectionName:'Bakery',
officePhone: '01111777',
leaderEmail:'smac@email.com',
password:'leader1',
employee: emp1
).save()


def tl2=new TeamLeader(
fullName:'Thomas Mulhurn',
department:'Electronics',
employeeid:'TL2222',
sectionName:'Computers',
officePhone: '02222888',
leaderEmail:'tmul@email.com',
password:'leader2',
employee: emp2
).save()




def team1=new Team(
teamName:'Team Loading',
numberOfEmployees:'10',
sectionName:'Bakery',
description:'Loading deliveries',
teamleader: tl1
).save()

def team2=new Team(
teamName:'Team Unloading',
numberOfEmployees:'20',
sectionName:'Groceries',
description:'Unloading deliveries',
teamleader: tl2
).save()





def man1=new Manager(
fullName:'Steve Crossbar',
username:'scross',
password:'password1',
managerEmail:'scross@email.com',
office:'B1-900',
department:'Grocery',
teamleader: tl1
).save()

def man2=new Manager(
fullName:'Bob Handle',
username:'bhandle',
password:'password2',
managerEmail:'bhandle@email.com',
office:'B1-800',
department:'Electronics',
teamleader: tl2
).save()









tl1.addToManagers(man1)
tl2.addToManagers(man2)
tl1.addToManagers(man2)
emp1.addToManagers(man1)
emp2.addToManagers(man2)
emp1.addToManagers(man2)
emp1.addToTeamLeaders(tl1)
emp2.addToTeamLeaders(tl2)
emp1.addToTeamLeaders(tl2)
emp1.addToShifts(shift1)
emp2.addToShifts(shift2)
emp1.addToShifts(shift2)
team1.addToShifts(shift1)
team2.addToShifts(shift2)
team2.addToShifts(shift1)
team1.addToShifts(shift2)
shift1.addToTeams(team1)
shift2.addToTeams(team2)
shift2.addToTeams(team1)
shift1.addToTeams(team2)
emp1.addToTeams(team1)
emp2.addToTeams(team2)
emp2.addToTeams(team1)
emp1.addToTeams(team2)
team1.addToEmployees(emp1)
team2.addToEmployees(emp2)
team2.addToEmployees(emp1)
team1.addToEmployees(emp2)
emp1.addToTasks(task1)
emp2.addToTasks(task2)
emp2.addToTasks(task1)
emp1.addToTasks(task2)
task1.addToEmployees(emp1)
task2.addToEmployees(emp2)
task2.addToEmployees(emp1)
task1.addToEmployees(emp2)
team1.addToTasks(task1)
team2.addToTasks(task2)
team2.addToTasks(task1)
team1.addToTasks(task2)
task1.addToTeams(team1)
task2.addToTeams(team2)
task2.addToTeams(team1)
task1.addToTeams(team2)
shift1.addToTasks(task1)
shift2.addToTasks(task2)
shift2.addToTasks(task1)
shift1.addToTasks(task2)
task1.addToShifts(shift1)
task2.addToShifts(shift2)
task2.addToShifts(shift1)
task1.addToShifts(shift2)*/



    }
    def destroy = {
    }
}
