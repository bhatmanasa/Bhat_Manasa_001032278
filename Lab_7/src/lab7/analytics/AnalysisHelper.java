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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;


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
          //  System.out.println("\nTEST:Posts:"+p+" with "+likeNumber+" number of likes");
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
           // System.out.println("\nTEST:Posts:"+p+" with "+commentNumber+" number of comments");
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
       // System.out.println(res);
            
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
           System.out.println("userPosts="+userPosts);
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
                     //   System.out.println("count="+count);
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
}
