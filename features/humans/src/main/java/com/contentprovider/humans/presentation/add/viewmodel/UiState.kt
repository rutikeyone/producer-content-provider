package com.contentprovider.humans.presentation.add.viewmodel

import androidx.annotation.StringRes
import com.contentprovider.core.presentation.Event

data class UiState(
    @StringRes val showSnackBarEvent: Event<Int>? = null,
    val navigateBackEvent: Event<Unit>? = null,
)