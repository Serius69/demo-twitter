package bo.ucb.edu.bo.demotwitter.dto;

import java.util.List;

public class TimelineDto {

    private Integer user_id;
    private List tweetline;


    public TimelineDto() {
    }

    public List getTweetline() {
        return tweetline;
    }

    public void setTweetline(List tweetline) {
        this.tweetline = tweetline;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
