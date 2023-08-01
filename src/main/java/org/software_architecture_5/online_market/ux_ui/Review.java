package org.software_architecture_5.online_market.ux_ui;

public class Review {
    private int id;
    private String text;
    private int rating;

    public Review(int id, String text, int rating) {
        this.id = id;
        this.text = text;
        this.rating = rating;
    }

    public void setReview(int id, String text, int rating) {
        this.id = id;
        this.text = text;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", rating=" + rating +
                '}';
    }

    public String getReviewText(int id) {

        return text;
    }
}
