/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

/**
 *
 * @author harshalneelkamal,Manasa
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;


public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerCommets() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("average of likes per comments: " + likeNumber / commentNumber);
            
    }
    public void getMostLikedPost() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        int likeNumber = 0;
        int highestLikes = 0;
        Post highestPost = null;
        List<Post> highestPosts = new ArrayList<Post>();

        for (Post p : posts.values()) {
            likeNumber = 0;
            List<Comment> comments = p.getComments();
            for (Comment c : comments) {
            likeNumber += c.getLikes();
             }
      //      System.out.println("\nTEST:Posts:"+p+" with "+likeNumber+" number of likes");
            if(highestLikes < likeNumber){
                highestLikes = likeNumber;
                highestPost = p;
            }
        }
        for (Post p : posts.values()) {
            likeNumber = 0;
            
            List<Comment> comments = p.getComments();
            for (Comment c : comments) {
            likeNumber += c.getLikes();
             }
         //  System.out.println("\nTEST:Posts:"+p+" with "+likeNumber+" number of likes");
            if(highestLikes == likeNumber){
              highestPosts.add(p);
            }
        }    
           System.out.println("\n--------------------------------------------------------\n");
        if(highestPosts.size() == 1){
        System.out.println("Post with most liked comments:"+highestPost+" with "+highestLikes+" number of likes");
        }else{
            for(Post p: highestPosts){
        System.out.println("Post with most liked comments:"+highestPost+" with "+highestLikes+" number of likes");               
            }
        }
            
    }    
    
    public void getMostCommentedPost() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        int commentNumber = 0;
        int highestComments = 0;
        Post highestPost = null;
        List<Post> highestPosts= new ArrayList<Post>();

        for (Post p : posts.values()) {
            commentNumber = 0;
            List<Comment> comments = p.getComments();
            commentNumber = comments.size();
            if(highestComments < commentNumber){
                highestComments = commentNumber;
                highestPost = p;
            }
        }
        System.out.println("\n--------------------------------------------------------\n");
        String res = "";
        for (Post p : posts.values()) {
            commentNumber = 0;           
            List<Comment> comments = p.getComments();
            commentNumber = comments.size();
           res+=("\nTEST:Posts:"+p+" with "+commentNumber);
            if(highestComments == commentNumber){
              highestPosts.add(p);
              System.out.println("Post with highest comment:"+p);
            }
        }
 //System.out.println(res);
            
    }
    
    
       public void getInactiveUserBasedOnPosts(){
           final Map<Integer,Integer> userPosts = new HashMap<Integer,Integer>();
        Map<Integer,Integer> sortedUserPosts = new HashMap<Integer,Integer>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        int tempUser;
        int postNum;
        List<Integer> postsList = new ArrayList<Integer>();
            for (Post p : posts.values()) {
            tempUser = p.getUserId();
            if(!(userPosts.containsKey(tempUser))){
                postNum = 0;
                for (Post post : posts.values()) {
                    if(post.getUserId() == tempUser){
                        postNum+=1;
                    }
                }
                userPosts.put(tempUser, postNum);
            }
            }
            for(int i = 0; i<userPosts.size();i++){
                    postsList.add(userPosts.get(i));
            }
           Collections.sort(postsList);
       //    System.out.println("userPosts="+userPosts);
           System.out.println("\n--------------------------------------------------------\n");
           System.out.println("Top 5 Inactive Users Based on Total Number Of Posts:\n");
           int count =0;
           for(int i=0; i<postsList.size(); i++){
               if(i == 5){
                   return;
               }            
           for (Integer key : userPosts.keySet()) {
              
               if(userPosts.get(key) == postsList.get(i)){
                   if(!sortedUserPosts.containsKey(key)){
                        count+=1;
                        if(count ==6){
                            return;
                        }
                       System.out.println("User Id = "+key+" with no of posts = "+postsList.get(i));
                   sortedUserPosts.put(key,postsList.get(i));
                   }
               }
               }
           }
    } 
    public void getInactiveUsersBasedOnCommentsCreated(){
        final Map<Integer,Integer> userComments= new HashMap<Integer,Integer>();
        Map<Integer,Integer> sortedUserComments = new HashMap<Integer,Integer>();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int tempUser;
        int commentNum;
        List<Integer> commentList = new ArrayList<Integer>();
            for (Comment c : comments.values()) {
            tempUser = c.getUserId();
            if(!(userComments.containsKey(tempUser))){
                commentNum = 0;
                for (Comment comment : comments.values()) {
                    if(comment.getUserId() == tempUser){
                        commentNum+=1;
                    }
                }
                userComments.put(tempUser, commentNum);
            }
            }
            for(int i = 0; i<userComments.size();i++){
                    commentList.add(userComments.get(i));
            }
           Collections.sort(commentList);
           System.out.println("\n--------------------------------------------------------\n");
           System.out.println("Top 5 Inactive Users Based on Total Number Of Comments They created:\n");
           int count =0;
           for(int i=0; i<commentList.size(); i++){
               if(i == 5){
                   return;
               }            
           for (Integer key : userComments.keySet()) {
              
               if(userComments.get(key) == commentList.get(i)){
                   if(!sortedUserComments.containsKey(key)){
                        count+=1;
                        if(count ==6){
                            return;
                        }
                       System.out.println("User Id = "+key+" with no of comments = "+commentList.get(i));
                   sortedUserComments.put(key,commentList.get(i));
                   }
               }
               }
           }
    }
    
    public void getUsersOverall(){
        final Map<Integer,Integer> userComments= new HashMap<Integer,Integer>();
        final Map<Integer,Integer> userLikes= new HashMap<Integer,Integer>();
        final Map<Integer,Integer> userPosts = new HashMap<Integer,Integer>();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        Map<Integer,User> users =  DataStore.getInstance().getUsers();
        List<User> listUsers = new ArrayList<User>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Integer> totalMap = new HashMap<Integer,Integer>();
        int postNum;
        int likeNum;
        int tempUser;
        int commentNum;        
        
        //Fetching comments for each users:
            for (Comment c : comments.values()) {
            tempUser = c.getUserId();
            if(!(userComments.containsKey(tempUser))){
                commentNum = 0;
                likeNum = 0;
                for (Comment comment : comments.values()) {
                    if(comment.getUserId() == tempUser){
                        commentNum+=1;
                        likeNum+=comment.getLikes();
                    }
                }
                userComments.put(tempUser, commentNum);
                userLikes.put(tempUser, likeNum);
            }
            }
            
        //Fetching Posts for users:
            tempUser = 0;
            for (Post p : posts.values()) {
            tempUser = p.getUserId();
            if(!(userPosts.containsKey(tempUser))){
                postNum = 0;
                for (Post post : posts.values()) {
                    if(post.getUserId() == tempUser){
                        postNum+=1;
                    }
                }
                userPosts.put(tempUser, postNum);
            }
            }
            

       // System.out.println("userLikes="+userLikes);
     //   System.out.println("userComments="+userComments);
       // System.out.println("userPosts="+userPosts);
        int totalNum = 0;
           for (User u : users.values()) {
               totalNum = userLikes.get(u.getId()) +userComments.get(u.getId())+ userPosts.get(u.getId());
               totalMap.put(u.getId(), totalNum);
               u.setTotalactive(totalNum);
               listUsers.add(u);
           }
        //   System.out.println("totalMap="+totalMap);
           
           
        Comparator<User> activenessComparator = new Comparator<User>(){
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getTotalactive(), o2.getTotalactive());
           
         };
        };
        
        Comparator<User> proactivenessComparator = new Comparator<User>(){
            @Override
            public int compare(User o2, User o1) {
                return Integer.compare(o1.getTotalactive(), o2.getTotalactive());
           
         };
        };
                    
            
            Collections.sort(listUsers, activenessComparator);
           System.out.println("\n--------------------------------------------------------\n");
           System.out.println("Top 5 inactive Users overall (sum of comments, likes, posts:\n");
           for(int i=0; i<listUsers.size();i++){
               if(i==5){
                   break;
               }
               System.out.println(listUsers.get(i)+"with total point ="+listUsers.get(i).getTotalactive()+"[Comments: "+userComments.get(listUsers.get(i).getId())
                               +";Likes: "+userLikes.get(listUsers.get(i).getId())+";Post: "+userPosts.get(listUsers.get(i).getId())+"]");
           }
           
            Collections.sort(listUsers, proactivenessComparator);
           System.out.println("\n--------------------------------------------------------\n");
           System.out.println("Top 5 Proactive Users overall (sum of comments, likes, posts:\n");
           for(int i=0; i<listUsers.size();i++){
               if(i==5){
                   return;
               }
               System.out.println(listUsers.get(i)+"with total point ="+listUsers.get(i).getTotalactive()+"[Comments: "+userComments.get(listUsers.get(i).getId())
                               +";Likes: "+userLikes.get(listUsers.get(i).getId())+";Post: "+userPosts.get(listUsers.get(i).getId())+"]");
           }
    }
    
    
}
