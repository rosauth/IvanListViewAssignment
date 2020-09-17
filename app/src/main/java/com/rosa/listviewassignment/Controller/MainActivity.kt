package com.rosa.listviewassignment.Controller

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rosa.listviewassignment.Adapter.ContactAdapter
import com.rosa.listviewassignment.Entity.ContactResponse
import com.rosa.listviewassignment.R
import com.rosa.listviewassignment.Util.ContactUtil
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()
        ContactUtil().getContact().getAllContact()
            .enqueue(object : Callback<ContactResponse> {
                override fun onResponse(
                    call: Call<ContactResponse>,
                    response: Response<ContactResponse>
                ) {
                    var listContacts = response.body()!!.contacts
                    Log.d("Result", listContacts.toString())

                    var adapter = ContactAdapter(listContacts)

                    val layoutManager: RecyclerView.LayoutManager =
                        LinearLayoutManager(this@MainActivity)

                    rv_contact.layoutManager = layoutManager
                    adapter.notifyDataSetChanged()
                    rv_contact.adapter = adapter

                }

                override fun onFailure(call: Call<ContactResponse>, t: Throwable) {
                    Toast.makeText(applicationContext, "Error", Toast.LENGTH_SHORT).show()
                }
            })
    }
}