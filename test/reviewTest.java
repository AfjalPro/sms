package test;

import org.junit.Assert;
import org.junit.Test;
import sms.Review;

public class reviewTest {

    @Test
    public void testReviewConstructor() {
        String expectedComment = "Great facility!";
        int expectedRate = 5;

        Review review = new Review(expectedComment, expectedRate);

        Assert.assertEquals("True", expectedComment, review.getComment());
        Assert.assertEquals("False", expectedRate, review.getRate());
    }
}
