package com.server.features.auth.requests

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SignUpRequest(
    @SerialName("full_name")
    val fullName: String,
    val email: String,
    val password: String
)
