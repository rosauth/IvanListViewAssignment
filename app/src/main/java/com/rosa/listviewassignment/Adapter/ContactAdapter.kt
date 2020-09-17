package com.rosa.listviewassignment.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rosa.listviewassignment.Entity.Contact
import com.rosa.listviewassignment.R
import com.rosa.listviewassignment.ViewHolder.ContactViewHolder

class ContactAdapter(private val list:List<Contact>) : RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        return ContactViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.contact_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.contactName.text = list?.get(position)?.name
        holder.contactEmail.text = list?.get(position)?.email
        holder.contactPhoneNumber.text = list?.get(position)?.phone.mobile
    }

    override fun getItemCount(): Int = list?.size
}