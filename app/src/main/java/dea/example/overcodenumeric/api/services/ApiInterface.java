package dea.example.overcodenumeric.api.services;

import dea.example.overcodenumeric.api.model.AppVersion;
import dea.example.overcodenumeric.api.model.NumResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("/")
    Call<AppVersion> getAppVersion();

    @GET("/api/validate")
    Call<NumResponse> doValidate(@Query("access_key") String access_key, @Query("number") String number, @Query("country_code") String country_code, @Query("format") String format);



}
