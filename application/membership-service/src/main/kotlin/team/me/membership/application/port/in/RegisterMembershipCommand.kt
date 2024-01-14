package team.me.membership.application.port.`in`

import jakarta.validation.constraints.AssertTrue
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import team.me.common.validate.SelfValidating

/**
 * @author Doyeop Kim
 * @since 2023/12/03
 */
data class RegisterMembershipCommand(
    @field:NotNull
    val name: String,
    @field:NotNull
    val email: String,
    @field:NotNull @field:NotBlank
    val address: String,
    @field:AssertTrue
    val isValid: Boolean,
    @field:AssertTrue
    val isCorp: Boolean,
) : SelfValidating<RegisterMembershipCommand>() {
    init {
        this.validateSelf()
    }
}