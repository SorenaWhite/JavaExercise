package Practise;
import java.util.ArrayList;

public class ReviewCollector {
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    public ReviewCollector() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

    public void addReview(ProductReview prodReview) {
        reviewList.add(prodReview);
        if(!productList.contains(prodReview.getName())) productList.add(prodReview.getName());
    }

    public int getNumGoodReviews(String prodName) {
        /* 1. Find all product reviews for the given product name (String: given product name)
                1) Find corresponding product ()
                2) F
         * 2. Each review
         * 3. if (review.indexOf("best") != -1) count++
         * 4. return count
         */
        int count = 0;
        for (int i=0; i<reviewList.size(); i++) {
            ProductReview pR = reviewList.get(i);
            if (pR.getName() == prodName) {
                if(pR.getReview().indexOf("best") != -1) count++;
            }
        }
        return count;
    }

}

// ArrayList.contains() : 判断是否存在，boolean 类型