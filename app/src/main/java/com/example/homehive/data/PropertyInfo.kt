package com.example.homehive.data

import android.os.Parcelable
import com.example.homehive.R
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
data class PropertyInfo(
    val name: String,
    val images: List<Int>,
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
            R.drawable.out_house5,
            R.drawable.out_house4,
            R.drawable.int_house1,
            R.drawable.int_house2
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
            R.drawable.out_house3,
            R.drawable.out_house2,
            R.drawable.int_house3,
            R.drawable.int_house4
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
            R.drawable.out_house7,
            R.drawable.out_house8,
            R.drawable.int_house5,
            R.drawable.int_house6
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
            R.drawable.out_house10,
            R.drawable.out_house9,
            R.drawable.int_house1,
            R.drawable.int_house7
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
            R.drawable.out_house11,
            R.drawable.out_house3,
            R.drawable.int_house1,
            R.drawable.int_house7
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
            R.drawable.out_house8,
            R.drawable.out_house7,
            R.drawable.int_house1,
            R.drawable.int_house7
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
