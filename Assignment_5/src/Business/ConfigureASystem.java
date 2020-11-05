package Business;

import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
       // List<Restaurant> rList1 = new ArrayList<Restaurant>();



 
        Restaurant r1 = new Restaurant("MainLand","Brookline");
        Map m = r1.getMenuMap();
        m.put("RavioliSmall", 12.00);
        m.put("RavioliLarge", 15.00);
         m.put("PastaSmall", 12.00);
        m.put("PastaLarge", 15.00);
        m.put("SpeghettiSmall", 12.00);
        m.put("SpeghettiLarge", 15.00);
        m.put("PizzaSmall", 10.00);
        m.put("PizzaMedium", 14.00);
        m.put("PizzaLarge", 18.00);
        r1.setMenuMap(m);
       // rList1.add(r1);
        system.getRestaurantDirectory().addRestaurantList(r1);
        Restaurant r2 = new Restaurant("BiriyaniHouse","Seattle");
        Map m2 = r2.getMenuMap();
        m2.put("VegHyderabadiHalf", 12.00);
        m2.put("VegHyderabadiFull", 17.00);
        m2.put("PaneerBiriyaniHalf", 12.00);
        m2.put("PaneerBiriyaniFull", 17.00);       
        m2.put("DumAlooBiriyaniHalf", 10.00);
        m2.put("DumAlooBiriyaniFull", 12.00);
        m2.put("ChickenBiriyaniHalf", 15.00);
        m2.put("ChickenBiriyaniFull", 19.00);
        
        r2.setMenuMap(m2);
        system.getRestaurantDirectory().addRestaurantList(r2);
        Restaurant r3 = new Restaurant("ColdHouse","NewYork");
        Map m3 = r3.getMenuMap();
        m3.put("ColdCoffeeSmall", 9.00);
        m3.put("ColdCoffeeMedium", 11.00);
        m3.put("ColdCoffeeLarge", 13.00);
        m3.put("IcedLatteSmall", 8.00);
        m3.put("IcedLatteMedium", 10.00);
        m3.put("IcedLatteLarge", 12.00);
        m3.put("IceCreamSmall", 8.00);
        m3.put("IceCreamMedium", 10.00);
        m3.put("IceCreamLarge", 12.00);

        r3.setMenuMap(m3);
        system.getRestaurantDirectory().addRestaurantList(r3);
        return system;
    }
    
}
