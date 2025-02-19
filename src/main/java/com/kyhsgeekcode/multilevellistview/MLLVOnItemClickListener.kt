package com.kyhsgeekcode.multilevellistview

import android.view.View

/******************************************************************************
 *
 *  2016 (C) Copyright Open-RnD Sp. z o.o.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 ******************************************************************************/


/**
 * Interface for handling MultiLevelListView events.
 */
interface MLLVOnItemClickListener<T> {
    /**
     * Method called when an item has been clicked
     *
     * @param parent The MultiLevelListView containing the clicked view
     * @param view The view that was clicked (the view provided by the adapter)
     * @param item Object that was clicked
     * @param itemInfo ItemInfo object with information about the clicked object and its location
     * on the list
     */
    fun onItemClicked(parent: MultiLevelListView<T>, view: View, item: T?, itemInfo: ItemInfo)

    /**
     * Method called when a group item has been clicked
     *
     * @param parent The MultiLevelListView containing the cliked view
     * @param view The view that was clicked (the view provided by the adapter)
     * @param item Object that was clicked
     * @param itemInfo ItemInfo object with information about the clicked object and its location
     * on the list
     */
    fun onGroupItemClicked(
        parent: MultiLevelListView<T>,
        view: View,
        item: T?,
        itemInfo: ItemInfo
    )
}