package bo.ucb.edu.bo.demotwitter.dao;

import bo.ucb.edu.bo.demotwitter.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

@Service
public class TweetDao {

    @Autowired
    private DataSource dataSource;

    //Crear un nuevo donador
    public CreateTweetDto crearTweet (CreateTweetDto newtweet) {
        newtweet.setUser_id(1);
        newtweet.setText_tweet("");

        try(Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("" +
                    "INSERT INTO tweets (tweet_id,user_sender_id,text,timestamp) VALUES (?,?,?,?,?); " +
                    "INSERT INTO users (user_id, username, profile_img) VALUES (?,?,?,?,?); " +
                    "INSERT INTO follows (user_follower_id,user_followed_id) VALUES (?,?,?); ")
        ) {
            //---Tabla users
            pstmt.setInt(1, newtweet.getDireccionId()); //id_direccion
            pstmt.setString(2, "Zona Sur"); //zona
            pstmt.setString(3, donadorDto.getDireccion()); //calle
            //---Tabla tweets
            pstmt.setInt(6, donadorDto.getPersonaId());// id_persona
            pstmt.setString(7, donadorDto.getNombrePersona());// nombre

            //--- Tabla follows
            pstmt.setInt(11, donadorDto.getUsuarioId()); // id usuario
            pstmt.setString(12, donadorDto.getNombreUsuario()); //nombre usuario
            pstmt.setString(13, donadorDto.getContrasena()); // contrasenia

            pstmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return donadorDto;
    }

}
