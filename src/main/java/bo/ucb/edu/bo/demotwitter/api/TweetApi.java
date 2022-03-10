package bo.ucb.edu.bo.demotwitter.api;

import bo.ucb.edu.bo.demotwitter.bl.TweetBL;
import bo.ucb.edu.bo.demotwitter.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TweetApi {

    @Autowired
    private TweetBL tweetBL;

    //Crear un nuevo tweet
    @PostMapping(path = "/donador")
    public ResponseDto createDonador(@RequestBody CreateTweetDto tweet) {
        // Validar que los datos enviados son correctos.
        if (tweet.getUser_id() == null || tweet.getUser_id().equals(0)) {  // nombre usuario: "     "
            return new ResponseDto(false, null, "El nombre de usuario es obligatori");
        }
        if (tweet.getText_tweet() == null || tweet.getText_tweet().trim().equals("")) {  // correo electronico: "     "
            return new ResponseDto(false, null, "El correo electronico es obligatorio");
        }
        return new ResponseDto(true, tweetBL.(proyecto), "Tweet agregado con exito");
        }
    }


