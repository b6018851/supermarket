package com.supermarket

class HrSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

def manloginToggle = {
out << "<div style='margin: 15px 0 40px;'>"
if (request.getSession(false) && session.user){
out << "<span style='float:left; margin-left: 15px'>"
out << "Welcome ${session.user}."

out << "</span><span style='float:right;margin-right:15px'>"
out << "<a href='${createLink(controller:'manager', action:'logout')}'>"
out << "Manager Logout </a></span>"

}
else{
out << "<span style='float:right;margin-right:10px'>"
out << "<a href='${createLink(controller:'manager', action:'login')}'>"
out << "Manager Login </a></span>"
}
out << "</div><br/>"
}

def tlloginToggle = {
out << "<div style='margin: 15px 0 40px;'>"
if (request.getSession(false) && session.user){
out << "<span style='float:left; margin-left: 15px'>"
out << "Welcome ${session.user}."
out << "</span><span style='float:right;margin-right:15px'>"

out << "<a href='${createLink(controller:'teamLeader', action:'logout')}'>"
out << "Team Leader Logout </a></span>"

}
else{
out << "<span style='float:right;margin-right:10px'>"
out << "<a href='${createLink(controller:'teamLeader', action:'login')}'>"
out << "Team Leader Login </a></span>"
}
out << "</div><br/>"
}
}


