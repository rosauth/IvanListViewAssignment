package com.rosa.listviewassignment.Util

import com.rosa.listviewassignment.Service.ApiService
import com.rosa.listviewassignment.Service.ContactService


class ContactUtil {
    constructor()
    fun getContact(): ContactService {
        return ApiService.getClient().create(ContactService::class.java)
    }
}