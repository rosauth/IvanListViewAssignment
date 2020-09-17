package com.rosa.listviewassignment.Service

import com.rosa.listviewassignment.Entity.ContactResponse
import retrofit2.Call
import retrofit2.http.GET

interface ContactService {
    @GET("contacts/")
    fun getAllContact(): Call<ContactResponse>
}