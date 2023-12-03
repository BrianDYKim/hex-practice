package team.me.common.validate

import org.springframework.validation.BeanPropertyBindingResult
import org.springframework.validation.BindException
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean

import jakarta.validation.*

/**
 * @author Doyeop Kim
 * @since 2023/12/03
 */
abstract class SelfValidating<T : Any> {
    // Validator 인스턴스를 멤버로 추가
    protected val validator = LocalValidatorFactoryBean().validator

    protected fun validateSelf() {
        val errors = BeanPropertyBindingResult(this, "target")
        validator.validate(this, errors)

        if (errors.hasErrors()) {
            throw BindException(errors)
        }
    }
}