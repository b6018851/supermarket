package com.dstone

class TeamLeaderController {

    def scaffold=TeamLeader

    def login(){}

    def validate(){
    
    def user= TeamLeader.findByLeaderEmail(params.leaderEmail)

    if (user && user.password == params.password){
    session.user = user
    render view:'home'
}
    else{
    flash.message="Invalid email and/or password."
    render view:'login'
}
}
    def logout ={
    session.user = null
    redirect(uri:'/')
}
}



