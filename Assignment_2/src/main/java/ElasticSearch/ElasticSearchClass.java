/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElasticSearch;

import Business.Car;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.Map;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import java.util.HashMap;
import org.elasticsearch.action.admin.indices.mapping.put.PutMappingRequest;




/**
 *
 * @author manasa
 */

public class ElasticSearchClass {
    
    private final RestHighLevelClient elasticClient;

    public ElasticSearchClass()  throws IOException{
       // this.mapper=mapper;
        System.out.println("Reached Elastic search!");
      
     elasticClient = new RestHighLevelClient(
        RestClient.builder(
                new HttpHost("localhost", 9200, "http"),
                new HttpHost("localhost", 9201, "http")));

        org.elasticsearch.client.core.MainResponse resp = elasticClient.info(RequestOptions.DEFAULT);
        System.out.println("info logger ="+resp.getVersion().getNumber()+"\ninfoget="+resp);

  
      
              
    }

    public void save(Car car) throws JsonProcessingException, IOException{
   
   System.out.println("ElasticSearch car=");
  
        PutMappingRequest putMappingRequest = new PutMappingRequest("car");
        Map<String, Object> properties = new HashMap<>();
        Map<String, Object> carDesc = new HashMap<>(); 
         Map<String, Object> carCity = new HashMap<>();
          Map<String, Object> carSerial = new HashMap<>();
           Map<String, Object> carModel = new HashMap<>(); 
           Map<String, Object> carMaintain = new HashMap<>(); 
           Map<String, Object> carSeatsTotal = new HashMap<>();
            Map<String, Object> carSeatsAvail = new HashMap<>();
             Map<String, Object> carAvail = new HashMap<>();
              Map<String, Object> carMake = new HashMap<>();
               Map<String, Object> carMakeYear = new HashMap<>();
           
        carDesc.put("type", "String");
        properties.put("CarDesc", car.getCarDesc());
        
        carCity.put("type", "Strigf");
        properties.put("CarCity", car.getCarCity());
        
        carSerial.put("type", "String");
        properties.put("CarSerial", car.getCarSerialNum());
        
        carModel.put("type", "String");
        properties.put("CarModel", car.getCarModel());
        
        carMaintain.put("type", "String");
        properties.put("CarMaintain", car.getMaintenanceDate());
           
        carSeatsTotal.put("type", "String");
        properties.put("CarSeatsTotal", car.getTotalSeats());
        
        carSeatsAvail.put("type", "String");
        properties.put("CarAvailSeats", car.getSeatsAvail());
        
        carMake.put("type", "String");
        properties.put("CarMake", car.getCarMake());
        
        carMakeYear.put("type", "String");
        properties.put("CarMake", car.getCarMakeYear());
        
        Map<String, Object> isAvail = new HashMap<>();
        isAvail.put("type", "boolean");
        properties.put("Availability", car.isCarAvailability());

        Map<String, Object> mappingMap = new HashMap<>();
        mappingMap.put("properties", properties);
        putMappingRequest.type("car").source(mappingMap);
        System.out.println("mapping="+mappingMap);
        System.out.println("puttingmappingreg="+putMappingRequest.toString());
                elasticClient.index(new IndexRequest("car").id(car.getCarDesc()).source(mappingMap,XContentType.JSON),RequestOptions.DEFAULT);
    }

    public SearchResponse searchData(QueryBuilder query) throws IOException {
        SearchResponse resp = elasticClient.search(new SearchRequest("car").source(new SearchSourceBuilder().query(query)), RequestOptions.DEFAULT);
        return resp;
    }
    
    
}
