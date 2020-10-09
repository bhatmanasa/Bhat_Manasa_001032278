/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarRecord;
import ElasticSearch.ElasticSearchClass;
import java.awt.CardLayout;
import java.io.IOException;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

/**
 *
 * @author manasa
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private CarRecord carRecord;
    private JPanel userProcessContainer;
    private String criteria;
    private String value1;
    private String value2;
    private ArrayList<Car> tempCarList;
    private String user;
     private final ElasticSearchClass elasticSearchClass;

    public SearchJPanel(JPanel userProcessContainer, CarRecord carRecord, String criteria, String value1, String value2, String user, ElasticSearchClass elasticSearchClass) throws ParseException {
        initComponents();
        this.carRecord = carRecord;
        this.userProcessContainer = userProcessContainer;
        this.criteria = criteria;
        this.value1 = value1;
        this.value2 = value2;
        this.user = user;
        tempCarList = new ArrayList<Car>();
        this.elasticSearchClass = elasticSearchClass;
        fetchTable(criteria, value1, value2);
        populateTable();
        if(user.equalsIgnoreCase("admin")){
    
            btnDelete1.setVisible(true);
        }else{
           btnDelete1.setVisible(false);         
        }
    }

    public SearchJPanel(JPanel userProcessContainer,CarRecord carRecord,String criteria,String make,String makeYear,String city,String serial,String minSeats,String maxSeats,String model,String avail1,String user,ElasticSearchClass elasticSearchClass){
        initComponents();
        this.carRecord = carRecord;
        this.userProcessContainer = userProcessContainer;
        this.criteria = criteria;
        this.elasticSearchClass = elasticSearchClass;
                this.user = user;
        for(Car car: carRecord.getCarList()){
        if(!make.equalsIgnoreCase("")){
          if(car.getCarCity().equalsIgnoreCase(value1)){
                        tempCarList.add(car);
                    }
        }
                }       
                
    }


    private ArrayList<Car> fetchTable(String criteria, String value1, String value2) throws ParseException{
        switch(criteria){
            case "Make":
                for(Car car: carRecord.getCarList()){
                    if(car.getCarMake().equalsIgnoreCase(value1)){
                        tempCarList.add(car);
                    }
                }
                break;
            case "MakeYear":
                for(Car car: carRecord.getCarList()){
                    if(car.getCarMakeYear() == Integer.parseInt(value1)){
                        tempCarList.add(car);
                    }
                }
                break;
            case "Model":
                for(Car car: carRecord.getCarList()){
                    if(car.getCarModel().equalsIgnoreCase(value1)){
                        tempCarList.add(car);
                    }
                }
                break;
            case "Serial":
                for(Car car: carRecord.getCarList()){
                    if(car.getCarSerialNum().equalsIgnoreCase(value1)){
                        tempCarList.add(car);
                    }
                }
                break;
            case "City":
                for(Car car: carRecord.getCarList()){
                    if(car.getCarCity().equalsIgnoreCase(value1)){
                        tempCarList.add(car);
                    }
                }
                break;
            case "All":
                for(Car car: carRecord.getCarList()){
                        tempCarList.add(car);
                    }
                break;
            case "ReqSeats":
                   
                for(Car car: carRecord.getCarList()){
         
                    if((car.getTotalSeats()>=Integer.parseInt(value1))&&(car.getTotalSeats()<=Integer.parseInt(value2))){
                        tempCarList.add(car);
                    }
                }
                break;
            case "Availability":
                boolean avail = FALSE;
                if(value1.equals("Available")){
                    avail = TRUE;
                }
                for(Car car: carRecord.getCarList()){
                    if(car.isCarAvailability() == avail){
                        tempCarList.add(car);
                    }
                }
                break;
            case "Customized":
                for(Car car: carRecord.getCarList()){
                    if(car.getCarMake().equalsIgnoreCase(value1)){
                        tempCarList.add(car);
                    }
                }
                break;
            case "Expired":
                for(Car car: carRecord.getCarList()){
                    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    String carDate = car.getMaintenanceDate();

                    LocalDate carDate1 = LocalDate.parse(carDate, format); 
                    LocalDate nowDate = LocalDate.now();
                    System.out.println("nowdate="+nowDate);
                    System.out.println("carDate="+carDate1);
                    long noOfDays = ChronoUnit.DAYS.between(carDate1, nowDate);
           
                    System.out.println ("Days between: " + noOfDays);
                    if(noOfDays > 365){
                        tempCarList.add(car);
                    }
                }
                break;           
        }
        return tempCarList;
    }
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblCars.getModel();
        dtm.setRowCount(0);
        for(Car car: tempCarList){
            Object[] row = new Object[4];
            row[0] = car;
            row[1] = car.getCarModel();
            row[2] = car.getCarCity();
            if(car.isCarAvailability()){
            row[3] = "Available";
            }else{
            row[3] = "Not Available";   
            }
            
            dtm.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnViewDetail = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDelete1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 153));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        tblCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Description", "Model", "City", "Availability"
            }
        ));
        jScrollPane1.setViewportView(tblCars);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnViewDetail.setText("View Details");
        btnViewDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh Table");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ADVANCED SEARCH");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Type in any Details of Car to get the List");

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Select any row and click");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("from table and click below");

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("to view in detail");

        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel4)))
                                .addComponent(jLabel5)))
                        .addComponent(btnRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnViewDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(449, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnDelete1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       ArrayList<Car> advanceSearchList = new ArrayList<Car>();
        QueryBuilder query;
       if(txtSearch.getText().isEmpty()){
           query = QueryBuilders.matchAllQuery();
       }else{
           query = QueryBuilders.multiMatchQuery(txtSearch.getText());
       }
        try {
            SearchResponse resp = elasticSearchClass.searchData(query);
            System.out.println(resp.getProfileResults());

        
        String tempResponse = resp.toString();
        String tempResponse2;
        while(!tempResponse.equals("")){
        
            int temp = (tempResponse.indexOf("CarMaintain"));
            if(temp == 0){
                tempResponse = tempResponse.substring(tempResponse.indexOf("CarMaintain")+11);
            }
            int i = tempResponse.indexOf("properties");
           
            if(i>0){
                int serialNo = tempResponse.indexOf("CarSerial");
                String serial = tempResponse.substring(serialNo+12,tempResponse.indexOf("CarMake")-3);
      
                int carMakeNo = tempResponse.indexOf("CarMake");
                String carMake = tempResponse.substring(carMakeNo+9,tempResponse.indexOf("Availability")-2);

                int Availability = tempResponse.indexOf("Availability");
                String avail = tempResponse.substring(Availability+14,tempResponse.indexOf("CarCity")-2);
                int cityNum = tempResponse.indexOf("CarCity");
                String city = tempResponse.substring(cityNum+10,tempResponse.indexOf("CarModel")-3);
        
                int modelNum = tempResponse.indexOf("CarModel");
                String model = tempResponse.substring(modelNum+11,tempResponse.indexOf("CarDesc")-3);
                

                int makeNum = tempResponse.indexOf("CarMakeYear");
                String make = tempResponse.substring(makeNum+13,tempResponse.indexOf("CarDesc")-3);
                int descNum = tempResponse.indexOf("CarDesc");
                String desc = tempResponse.substring(descNum+10,tempResponse.indexOf("CarAvailSeats")-3);

                
                int availSeatsNum = tempResponse.indexOf("CarAvailSeats");
                String availSeats = tempResponse.substring(availSeatsNum+15,tempResponse.indexOf("CarSeatsTotal")-2);
                     
                int totalSeats = tempResponse.indexOf("CarSeatsTotal");
                String totSeats = tempResponse.substring(totalSeats+15,totalSeats+16);

                int maintainNum = tempResponse.indexOf("CarMaintain");
          
                String s = tempResponse.substring(tempResponse.indexOf("CarMaintain"));
               
 
              int s2 = tempResponse.indexOf(tempResponse.indexOf("}}"));

                String maintain = tempResponse.substring(maintainNum+14,maintainNum+24);

                tempResponse = tempResponse.substring(tempResponse.indexOf("CarMaintain"));
                Car cObj = new Car();
                                   advanceSearchList.add(cObj);
                 if(avail.equals("true")){
                    cObj.setCarAvailability(true);
                 }else{
                     cObj.setCarAvailability(false);
                 }
           
                    cObj.setCarCity(city);
      
                    cObj.setCarDesc(desc);
                   
                    cObj.setCarMake(make);
             
                    cObj.setCarMakeYear(Integer.parseInt(carMake));
 
                    cObj.setCarModel(model);
               
                    cObj.setCarSerialNum(serial);
                  
                    cObj.setMaintenanceDate(maintain);
                 
                    cObj.setSeatsAvail(Integer.parseInt(totSeats));
              
                    cObj.setTotalSeats(Integer.parseInt(availSeats));   
                
            }else{
                tempResponse = "";
            }
            
            
            
        }
        DefaultTableModel dtm = (DefaultTableModel) tblCars.getModel();
        dtm.setRowCount(0);
        for(Car car: advanceSearchList){
            Object[] row = new Object[4];
            row[0] = car;
            row[1] = car.getCarModel();
            row[2] = car.getCarCity();
            if(car.isCarAvailability()){
            row[3] = "Available";
            }else{
            row[3] = "Not Available";   
            }
            
            dtm.addRow(row);
        }
     
        } catch (IOException ex) {
            Logger.getLogger(SearchJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCars.getSelectedRow();
        if(selectedRow >=0){
            Car car = (Car) tblCars.getValueAt(selectedRow, 0);
            ViewJPanel panel = new ViewJPanel(userProcessContainer,car,user);
            userProcessContainer.add("ViewAccountJPanel",panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view the details!","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnViewDetailActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
                int selectedRow= tblCars.getSelectedRow();

        if(selectedRow >= 0){
            int confirmed = JOptionPane.showConfirmDialog(null, "Are you Sure you want to delete the record?","Confirm Delete",JOptionPane.YES_NO_OPTION);
            if(confirmed == JOptionPane.YES_OPTION){
                Car cObj  = (Car)tblCars.getValueAt(selectedRow, 0);
                carRecord.deleteCar(cObj);
                JOptionPane.showMessageDialog(null,"Car has been removed!");
                populateTable();
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please select any row!");
        }
    }//GEN-LAST:event_btnDelete1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewDetail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCars;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
