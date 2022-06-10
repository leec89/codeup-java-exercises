public class Dish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public Dish() {};

    public Dish(int amount, String dishName, boolean thumbsUpDown) {
        this.costInCents = amount;
        this.nameOfDish = dishName;
        this.wouldRecommend = thumbsUpDown;
    }

    public void printSummary() {
        System.out.printf(" Cost: %d %n Name: %s %n Recommend %b %n %n", costInCents, nameOfDish, wouldRecommend);
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public Boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void isWouldRecommend(Boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }
}
