

public class oop_post_lecture {
    public static void main(String[] args) {
        oop_post_dane post = new oop_post_dane();
        oop_post_dane post2 = post;
//        System.out.println("post = " + post);
        System.out.println("post2 = " + post2);
        System.out.println("post = " + post);

        post2.setAuthor("Justin");
        System.out.println("post.author = " + post.getAuthor());

        oop_post_dane post3 = new oop_post_dane("book title","first Last","11/01/1987","yes!");
        oop_post_dane post4 = new oop_post_dane("book xxx title","first Lasdast","11/02/1987","yes!");
        oop_post_dane post5 = new oop_post_dane("book xxx asdftitle","asdfasdf Last","11/01/1987","yes!");

        System.out.println("post3.author + post3.title = " + post3.getAuthor() + post3.getTitle());

        System.out.println("post3.toString() = " + post3.toString());


        // static method
        System.out.println("Post.getTotalPosts() = " + oop_post_dane.getTotalPosts());

        // Post.getTotalPosts()  == post3.getTotalPosts();


    }
}