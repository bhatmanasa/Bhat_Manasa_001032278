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
    
}
