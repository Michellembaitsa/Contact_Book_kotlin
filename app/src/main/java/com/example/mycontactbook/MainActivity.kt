package com.example.mycontactbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContacts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_contacts()

    }

    fun display_contacts() {
        var contactList = listOf(
            Contact_list_Item_Dataclass(
                "Michelle Mbaitsa",
                "0700061374",
                "michellembaitsaa@gmail.com"
            ),
            Contact_list_Item_Dataclass(
                "Akal Erupe",
                "0728567456",
                "akalerupe.com"
            ),
            Contact_list_Item_Dataclass(
                "Irene Nyatichi",
                "0743456567",
                "nyatichikeroro@gmail.com"
            ),
            Contact_list_Item_Dataclass(
                "Kabrey Murugi ",
                "0736786970",
                "murugikabrey@gmail.com"
            ),
            Contact_list_Item_Dataclass(
                "Grace Waceke",
                "0773455678",
                "wacekemaina@gmail.com"
            ),
            Contact_list_Item_Dataclass(
                "Aisha Fadallala",
                "0700061374",
                "fadallalaaisha@gmail.com"
            ),
            Contact_list_Item_Dataclass(
                "Zilla mwimali",
                "0728567456",
                "mwimalizillah.com"
            ),
            Contact_list_Item_Dataclass(
                "Jeannine Uwase",
                "0743456567",
                "uwasejeannine@gmail.com"
            ),
            Contact_list_Item_Dataclass(
                "Mandek Adow",
                "0736786970",
                "andowmandek@gmail.com"
            ),
            Contact_list_Item_Dataclass(
                "Diana Jarenga",
                "0773455678",
                "jarengadiana@gmail.com"
            ),
            Contact_list_Item_Dataclass(
                "Sandra Chepchirchir",
                "0700061374",
                "sandrachepchirchir@gmail.com"
            ),
            Contact_list_Item_Dataclass(
                "Anastacia Karobia",
                "0728567456",
                "anastaciakarobia.com"
            ),
            Contact_list_Item_Dataclass(
                "Mercy Wangari",
                "0743456567",
                "mercywangari@gmail.com"
            ),
            Contact_list_Item_Dataclass(
                "Grace Kendi",
                "0736786970",
                "Grace Kendi@gmail.com"
            ),
            Contact_list_Item_Dataclass(
                "Mercy Birungi",
                "0773455678",
                "birungimercy@gmail.com"
            ),


            )
        rvContacts=findViewById(R.id.rvContacts)
        var contactsAdapter=ContactsAdapter(contactList)
        rvContacts.apply {
            layoutManager=LinearLayoutManager(baseContext)
            rvContacts.adapter=contactsAdapter
        }
    }
}