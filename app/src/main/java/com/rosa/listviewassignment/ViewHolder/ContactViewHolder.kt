package com.rosa.listviewassignment.ViewHolder

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.rosa.listviewassignment.R

open class ContactViewHolder : RecyclerView.ViewHolder {
    var contactName: TextView
    var contactEmail: TextView
    var contactPhoneNumber: TextView
    var contactCard: CardView

    constructor(v: View) : super(v) {
        contactName = v.findViewById(R.id.txt_contactName)
        contactEmail = v.findViewById(R.id.txt_contactEmail)
        contactPhoneNumber = v.findViewById(R.id.txt_contactPhone)
        contactCard = v.findViewById(R.id.card_contact)
    }
}