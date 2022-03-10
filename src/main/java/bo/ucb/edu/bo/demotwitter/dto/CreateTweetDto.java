package bo.ucb.edu.bo.demotwitter.dto;

public class CreateTweetDto {
    private Integer user_id;
    private String text_tweet;

    public CreateTweetDto (){

    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getText_tweet() {
        return text_tweet;
    }

    public void setText_tweet(String text_tweet) {
        this.text_tweet = text_tweet;
    }
}



