package com.kyhsgeekcode.multilevellistview

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
 * Interface used to get information about list item and its location in MultiLevelListView.
 */
interface ItemInfo {
    /**
     * Gets item level. Levels starts from 0.
     *
     * @return Item level.
     */
    val level: Int

    /**
     * Gets number of items with item level at the same hierarchy.
     *
     * @return Total number of items belonging to item's level.
     */
    val levelSize: Int

    /**
     * Gets item index within level.
     *
     * @return Item index.
     */
    val idxInLevel: Int

    /**
     * Gets info if item is extended.
     *
     * @return true if item is extended, false otherwise.
     */
    val isExpanded: Boolean

    /**
     * Gets info if item is expandable.
     *
     * @return true if item is expandable, false otherwise.
     */
    val isExpandable: Boolean
}