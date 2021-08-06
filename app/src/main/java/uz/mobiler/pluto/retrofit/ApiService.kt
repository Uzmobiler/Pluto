package uz.mobiler.pluto.retrofit

import retrofit2.Call
import retrofit2.http.GET
import uz.mobiler.pluto.models.User

interface ApiService {

    @GET("users")
    fun getUsers(): Call<List<User>>
}