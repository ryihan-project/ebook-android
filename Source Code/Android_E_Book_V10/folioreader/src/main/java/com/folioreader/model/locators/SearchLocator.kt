package com.folioreader.model.locators

import android.os.Parcel
import android.os.Parcelable
import org.readium.r2.shared.Locations
import org.readium.r2.shared.Locator
import org.readium.r2.shared.LocatorText

enum class SearchItemType {
    UNKNOWN_ITEM,
    SEARCH_COUNT_ITEM,
    RESOURCE_TITLE_ITEM,
    SEARCH_RESULT_ITEM
}

class SearchLocator : Locator, Parcelable {
