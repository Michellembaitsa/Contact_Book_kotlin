package com.example.mycontactbook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(var contactsList:List<Contact_list_Item_Dataclass>):RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
    var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_items,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
var contacts=contactsList.get(position)
        holder.tvName.text=contacts.name
        holder.tvPhoneNumber.text=contacts.number
        holder.tvEmail.text=contacts.email
    }

    override fun getItemCount(): Int {
    return contactsList.size

    }
}
class ContactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
}