package gymapp.ihebchiha.com.igym;

import gymapp.ihebchiha.com.igym.Modeles.Client;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface InterClient {

    @POST("/client/addClient")
    Call<Client> createAccount();

    @GET("/client/allClient")
    Call<Client> getAllClients();

    @GET("/client/insertClient")
    Call<Integer> insertClients();

    @GET("/client/login")
    Call<Client> login(@Query("util") String user,@Query("mdp") String pass);
}
