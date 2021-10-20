public class RaterTesting
{
    public static void main(String[] args)
    {
        Rater rater = new Rater("Canton", 2);
        
        rater.updateReview();
        System.out.println(rater);
        
        rater.setRating(10.0);
        rater.updateReview();
        System.out.println(rater);
    }
}