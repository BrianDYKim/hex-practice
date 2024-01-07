package team.me.membership.application.port.`in`

import jakarta.validation.constraints.AssertTrue
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import team.me.common.validate.SelfValidating

/**
 * @author Doyeop Kim
 * @since 2023/12/03
 */
data class RegisterMembershipCommand(
    @NotNull
    val name: String,
    @NotNull
    val email: String,
    @NotNull @NotBlank
    val address: String,
    @AssertTrue
    val isValid: Boolean,
    val isCorp: Boolean,
) : SelfValidating<RegisterMembershipCommand>() {
    init {
        this.validateSelf()
    }
}