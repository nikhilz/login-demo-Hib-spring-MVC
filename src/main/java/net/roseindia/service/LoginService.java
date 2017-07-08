package net.roseindia.service;
/*
@Author: Deepak Kumar
Check more tutorials at http://www.roseindia.net
*/
import net.roseindia.model.*;

public interface LoginService{    
       public boolean checkLogin(String userName, String userPassword);
}