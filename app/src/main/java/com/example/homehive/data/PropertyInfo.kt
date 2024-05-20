package com.example.homehive.data

import android.os.Parcelable
import com.example.homehive.R
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
data class PropertyInfo(
    val name: String,
    val images: List<String>,
    val noOfBedrooms: Int,
    val noOfBathroom: Int,
    val areaSqFt: Int,
    val rating: Double,
    val location: String,
    val description: String,
    val agentName: String,
    val agentImage: Int
) : Parcelable

val propertyList = listOf(
    PropertyInfo(
        "Minimal living flat",
        listOf(
            "https://www.bhg.com/thmb/H9VV9JNnKl-H1faFXnPlQfNprYw=/1799x0/filters:no_upscale():strip_icc()/white-modern-house-curved-patio-archway-c0a4a3b3-aa51b24d14d0464ea15d36e05aa85ac9.jpg",
            "https://media.architecturaldigest.com/photos/571e97c5741fcddb16b559c9/16:9/w_5119,h_2879,c_limit/modernist-decor-inspiration-01.jpg",
            "https://images.unsplash.com/photo-1495433324511-bf8e92934d90?q=80&w=3540&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            "https://plus.unsplash.com/premium_photo-1661963209358-0f4d5f509d10?q=80&w=3707&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        3,
        2,
        8870,
        4.7,
        "New York",
        "The current owners of this prized home have stylishly renovated his heroic home from top to bottom and back to the slab -- nothing was overlooked -- and everything, from the new copper plumbing to the upgraded electrical system, and from the fantastic custom floors to the beautiful plasterwork, was redone, reimagined, and redefined. Now, you get to enjoy the fruits of their smart and elegant choices.\n",
        "Anthony",
        R.drawable.head_shot3
    ),
    PropertyInfo(
        "Minimal living flat",
        listOf(
            "https://images.unsplash.com/photo-1613977257363-707ba9348227?w=900&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTExfHxob3VzZXxlbnwwfHwwfHx8MA%3D%3D",
            "https://images.unsplash.com/photo-1516455590571-18256e5bb9ff?q=80&w=2784&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            "https://images.unsplash.com/photo-1556912172-45b7abe8b7e1?q=80&w=3540&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",

        ),
        4,
        4,
        8472,
        4.4,
        "New York",
        "You can't argue with value when the combined Common charges and Real Estate Taxes are under \$3K per month! Come experience unobstructed panoramic views, a bounty of natural light, and soaring 10'6\" ceiling heights at The Sutton Condominium, where luxury meets industrial chic modern design.",
        "Joshua",
        R.drawable.head_shot1
    ),
    PropertyInfo(
        "Minimal living flat",
        listOf(
            "https://images.unsplash.com/photo-1594348352429-159508d48c57?q=80&w=3548&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            "https://images.unsplash.com/photo-1560185127-6ed189bf02f4?q=80&w=3540&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            "https://images.unsplash.com/photo-1556594472-e9b933db923c?q=80&w=3687&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",

        ),
        5,
        4,
        9376,
        4.6,
        "New York",
        "There is nothing else quite like it on the market. You’ll find yourself on a beautiful tree-lined street in Midtown East, but all the details, large and small, transform you to another place and time. There is an old-world grandeur that is impossible to escape. The maisonette one-of-a-kind, set on three floors, with a beautiful and private two-level garden.",
        "Donald",
        R.drawable.head_shot3
    ),
    PropertyInfo(
        "Minimal living flat",
        listOf(
            "https://images.unsplash.com/photo-1623715056555-91d8ba2b426f?q=80&w=3540&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            "https://images.unsplash.com/photo-1501183638710-841dd1904471?q=80&w=3540&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            "https://images.unsplash.com/photo-1502005229762-cf1b2da7c5d6?q=80&w=3648&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            "https://images.unsplash.com/photo-1592928302636-c83cf1e1c887?q=80&w=3540&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        3,
        3,
        5363,
        4.9,
        "New York",
        "This exquisitely renovated penthouse duplex boasts a private 1200 sf terrace with incredible river views!\n" +
                "Completely transformed by the current owners as a labor of love. This rare one bedroom and two bathroom unit begins one flight above the original penthouse floor. Designed and created for discerning buyers who covet a one of a kind property. ",
        "Lisa",
        R.drawable.head_shot2
    ),
    PropertyInfo(
        "Minimal living flat",
        listOf(
            "https://images.unsplash.com/photo-1614846384571-1e31322ed3a9?q=80&w=3540&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            "https://images.unsplash.com/photo-1495433324511-bf8e92934d90?q=80&w=3540&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            "https://images.unsplash.com/photo-1579725942955-4d8377f8c66a?q=80&w=3474&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            "https://images.unsplash.com/photo-1560185007-cde436f6a4d0?w=900&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDN8fHxlbnwwfHx8fHw%3D"
        ),
        6,
        4,
        8346,
        4.2,
        "New York",
        "Step into luxury living with this exquisite three-bedroom, three-bathroom condo at the esteemed Grand Beekman. Flooded with natural light, the expansive living and dining areas boast western exposures, perfect for hosting gatherings or simply unwinding in peace. You will find stunning herringbone floors and crown moldings throughout the home as well as custom lighting and a sound system.",
        "John",
        R.drawable.head_shot3
    ),
    PropertyInfo(
        "Minimal living flat",
        listOf(
            "https://images.unsplash.com/photo-1613553507747-5f8d62ad5904?q=80&w=3540&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            "https://plus.unsplash.com/premium_photo-1683140425081-14c44089acd0?q=80&w=3474&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            "https://images.unsplash.com/photo-1489171078254-c3365d6e359f?w=900&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjk2fHxob3VzZXxlbnwwfHwwfHx8MA%3D%3D",
            "https://images.unsplash.com/photo-1505692433770-36f19f51681d?q=80&w=3540&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        5,
        4,
        9162,
        4.0,
        "New York",
        "Experience luxury living at its finest in this exquisite convertible 4-bedroom, 4-bathroom co-op. This stunning residence boasts floor to ceiling windows framing picturesque views of Four Freedoms Park and the iconic Pepsi-Cola sign.",
        "Emily",
        R.drawable.head_shot4
    ),
)
