package bo.ucb.edu.bo.demotwitter.bl;

import bo.ucb.edu.bo.demotwitter.dao.*;
import bo.ucb.edu.bo.demotwitter.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetBL {

    @Autowired
    TweetDao tweetDao;

    //Listado tweets
    public List<ConsultaDonadorDto> findAllDonadores() {
        return tweetDao.();
    }

    //Crear un nuevo tweet
    public CreateTweetDto addProyecto(CreateTweetDto proyectoDto) {
        return tweetDao.crearTweet(proyectoDto);
    }



}
