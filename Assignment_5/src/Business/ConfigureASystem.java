package Business;

import Business.Employee.Employee;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        Employee employee1 = system.getEmployeeDirectory().createEmployee("ADM");
        Employee employee2 = system.getEmployeeDirectory().createEmployee("DEL");
        Employee employee3 = system.getEmployeeDirectory().createEmployee("CST");        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("admin1", "admin", employee1, new AdminRole());
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("deliv", "deliv", employee2, new DeliverManRole());
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("cust", "cust", employee3, new CustomerRole());
        
        return system;
    }
    
}
