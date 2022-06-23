package oop;

public class OOPLecture {
    public static void main(String[] args) {

        Post post = new Post();                     // creating a new Post named post
        Post post2 = post;                          // creating post2 which references post

        System.out.println("post2 = " + post2);     // this print and the next line should be the same
        System.out.println("post = " + post);

        post2.author = "Justin";                    // even though setting to post2, it does post
        System.out.println("post.author = " + post.author);

        Post post3 = new Post("book title","first Last","11/01/1987","yes!");
        Post post4 = new Post("book xxx title","first Lasdast","11/02/1987","yes!");
        Post post5 = new Post("book xxx asdftitle","asdfasdf Last","11/01/1987","yes!");

        System.out.println("post3.author + post3.title = " + post3.author + post3.title);

        System.out.println("post3.toString() = " + post3.toString());


        // static method
        System.out.println("oop.Post.getTotalPosts() = " + Post.getTotalPosts());

        // oop.Post.getTotalPosts()  == post3.getTotalPosts();


    }
}