package uz.mobiler.pluto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import uz.mobiler.pluto.models.User
import uz.mobiler.pluto.retrofit.ApiClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ApiClient.apiService.getUsers().enqueue(object : Callback<List<User>>{
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {

            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {

            }
        })
    }
}