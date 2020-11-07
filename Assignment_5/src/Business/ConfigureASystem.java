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
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        Enterprise enterprise = new Enterprise("TastyEats");
        enterprise.setAddress("Boston");
        enterprise.setContact(1234567890);
        enterprise.setEmail("tastyeats@gmail.com");
        system.setEnterprise(enterprise);
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        Employee employee1 = system.getEmployeeDirectory().createEmployee("ADM");
        Employee employee2 = system.getEmployeeDirectory().createEmployee("DEL");
        Employee employee3 = system.getEmployeeDirectory().createEmployee("CST");  
        Employee employee4 = system.getEmployeeDirectory().createEmployee("ADM");
        Employee employee5 = system.getEmployeeDirectory().createEmployee("ADM");
        Employee employee6 = system.getEmployeeDirectory().createEmployee("DL2");
        Employee employee7 = system.getEmployeeDirectory().createEmployee("DL3");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("admin1", "admin", employee1, new AdminRole());
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("deliv", "deliv", employee2, new DeliverManRole());
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("cust", "cust", employee3, new CustomerRole());
        UserAccount ua4 = system.getUserAccountDirectory().createUserAccount("admin2", "admin", employee4, new AdminRole());
        UserAccount ua5 = system.getUserAccountDirectory().createUserAccount("admin3", "admin", employee5, new AdminRole());
        UserAccount ua6 = system.getUserAccountDirectory().createUserAccount("deliv2", "deliv", employee6, new DeliverManRole());
        UserAccount ua7 = system.getUserAccountDirectory().createUserAccount("deliv3", "deliv", employee7, new DeliverManRole());
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
        r1.setManagerID(employee1.getId());
        system.getRestaurantDirectory().addRestaurantList(r1);
        Restaurant r2 = new Restaurant("BiriyaniHouse","Seattle");
        Map m2 = r2.getMenuMap();
        m2.put("PaneerBiriyaniHalf", 12.00);
        m2.put("PaneerBiriyaniFull", 17.00);       
        m2.put("ChickenBiriyaniHalf", 15.00);
        m2.put("ChickenBiriyaniFull", 19.00);
        
        r2.setMenuMap(m2);
        r2.setManagerID(employee5.getId());
        system.getRestaurantDirectory().addRestaurantList(r2);
        Restaurant r3 = new Restaurant("ColdHouse","NewYork");
        Map m3 = r3.getMenuMap();
        m3.put("ColdCoffeeSmall", 9.00);
        m3.put("ColdCoffeeMedium", 11.00);
        m3.put("IceCreamSmall", 8.00);
        m3.put("IceCreamLarge", 12.00);

        r3.setMenuMap(m3);
        r3.setManagerID(employee4.getId());
        system.getRestaurantDirectory().addRestaurantList(r3);
        
      //initializing node for menu tree  
      DefaultMutableTreeNode node = new DefaultMutableTreeNode("Restaurant");
      DefaultMutableTreeNode rest1 = new DefaultMutableTreeNode("BiriyaniHouse");
      DefaultMutableTreeNode rest2 = new DefaultMutableTreeNode("MainLand");
      DefaultMutableTreeNode rest3 = new DefaultMutableTreeNode("ColdHouse");
      
      
      DefaultMutableTreeNode rest1food1 = new DefaultMutableTreeNode("PaneerBiriyani");
      DefaultMutableTreeNode rest1food2 = new DefaultMutableTreeNode("ChickenBiriyani");
      DefaultMutableTreeNode rest2food1 = new DefaultMutableTreeNode("Ravioli");
      DefaultMutableTreeNode rest2food2 = new DefaultMutableTreeNode("Pizza");
      DefaultMutableTreeNode rest3food1 = new DefaultMutableTreeNode("ColdCoffee");
      DefaultMutableTreeNode rest3food2 = new DefaultMutableTreeNode("IceCream");
      rest1food1.add(new DefaultMutableTreeNode("Half"));
      rest1food1.add(new DefaultMutableTreeNode("Full"));
      rest1food2.add(new DefaultMutableTreeNode("Half"));
      rest1food2.add(new DefaultMutableTreeNode("Full"));      
      rest2food1.add(new DefaultMutableTreeNode("Small"));
      rest2food1.add(new DefaultMutableTreeNode("Large"));
      rest2food2.add(new DefaultMutableTreeNode("Small"));
      rest2food2.add(new DefaultMutableTreeNode("Medium"));
      rest2food2.add(new DefaultMutableTreeNode("Large"));
      rest3food1.add(new DefaultMutableTreeNode("Small"));
      rest3food1.add(new DefaultMutableTreeNode("Medium"));
      rest3food2.add(new DefaultMutableTreeNode("Small"));
      rest3food2.add(new DefaultMutableTreeNode("Large"));
      rest1.add(rest1food1);
      rest1.add(rest1food2);
      rest2.add(rest2food1);
      rest2.add(rest2food2);
      rest3.add(rest3food1);
      rest3.add(rest3food2);
      
      node.add(rest1);
      node.add(rest2);
      node.add(rest3);
      system.getRestaurantDirectory().setMenuNode(node);
        return system;
    }
    
}
