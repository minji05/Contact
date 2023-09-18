package com.example.recyclerview


object ContactData {
    fun generateDummyContacts(): List<Contact> {
        return listOf(
            Contact(R.drawable.person1, "김이서", "010-9456-7890", false),
            Contact(R.drawable.person2, "이서아", "010-9877-6754", false),
            Contact(R.drawable.person3, "전시우", "010-8907-2543", false),
            Contact(R.drawable.person4, "하시아", "010-0431-6832", false),
            Contact(R.drawable.person5, "서지안", "010-8945-2134", false),
            Contact(R.drawable.person6, "박지유", "010-2357-0975", false),
            Contact(R.drawable.person7, "신하준", "010-1125-4289", false),
            Contact(R.drawable.person8, "장서준", "010-5673-8655", false),
            Contact(R.drawable.person9, "윤지호", "010-9986-7964", false),
            Contact(R.drawable.person10, "백선우", "010-7754-3446", false),
            // Add more contacts...
        )
    }


}