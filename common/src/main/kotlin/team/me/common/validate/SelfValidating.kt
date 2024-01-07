package team.me.common.validate

import jakarta.validation.ConstraintViolationException
import jakarta.validation.Validation

/**
 * @author Doyeop Kim
 * @since 2023/12/03
 */
open class SelfValidating<T : Any> {
    // Validator 인스턴스를 멤버로 추가
    private val validator = Validation.buildDefaultValidatorFactory().validator

    protected fun validateSelf() {
        val violations = validator.validate(this)

        if (violations.isNotEmpty()) {
            throw ConstraintViolationException(violations)
        }
    }
}