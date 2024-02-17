package Practise;

public class ReviewCollectorDemo {
    public static void main (String [] args) {
        ReviewCollector a = new ReviewCollector();
        ProductReview review1 = new ProductReview("car", "bests");
        a.addReview(review1);
        int b = a.getNumGoodReviews("car");
        System.out.println(b);
    }
}
