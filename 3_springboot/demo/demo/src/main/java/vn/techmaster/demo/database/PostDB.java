package vn.techmaster.demo.database;

import vn.techmaster.demo.model.Post;

import java.util.ArrayList;
import java.util.List;

public class PostDB {

    private List<Post> postList = new ArrayList<>();

        System.out.println("WebController Created");

        this.postList = new ArrayList<>();
        this.postList.add(new Post(1,"Post title 1 ", "Author 1"));
        this.postList.add(new Post(2,"Post title 2 ", "Author 2"));
        this.postList.add(new Post(3,"Post title 3 ", "Author 3"));

}
