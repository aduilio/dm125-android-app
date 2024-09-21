package com.aduilio.mytasks.repository

import com.aduilio.mytasks.entity.Task
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path

interface TaskRepository {

    @POST("tasks")
    fun create(@Body task: Task): Call<Task>

    @GET("tasks")
    fun readAll(): Call<List<Task>>

    @PATCH("tasks/{id}")
    fun update(@Path("id") id: Long, @Body task: Task): Call<Task>
}