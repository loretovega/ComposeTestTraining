/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.compose.rally

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.compose.rally.ui.overview.OverviewBody
import org.junit.Rule
import org.junit.Test

class ClickSeeAllTest {

    @get:Rule
    val composeTestRule = createComposeRule()
    //val buttonSeeAll= hasText("SEE ALL") and hasClickAction() and hasTestTag("See all one") // yes hasContentDescription("See all one")

    @Test
    fun clickSeeAll() {

        composeTestRule.setContent {
            OverviewBody()

            Thread.sleep(3000)
        }

        composeTestRule


                // false busca en all arbol true busca en una parte especifica

            .onNodeWithTag("See all one", useUnmergedTree = true).performClick()


        composeTestRule

            .onNodeWithText("DISMISS").performClick()

        Thread.sleep(3000)



        Thread.sleep(3000)

    }
}



// YES .onNode(buttonSeeAll).performClick()

//.onNodeWithTag(buttonSeeAll.toString()).performClick()
//.onNodeWithText("SEE ALL").performClick()
// .onAllNodesWithContentDescription("SEE ALL").assertAll(hasClickAction())
//.onNodeWithText("SEE ALL")
// .performClick()
// .onNodeWithText("SEE ALL")

