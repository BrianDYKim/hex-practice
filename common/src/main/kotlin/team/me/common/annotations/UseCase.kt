package team.me.common.annotations

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component

/**
 * @author Doyeop Kim
 * @since 2023/12/03
 */
@Target(AnnotationTarget.TYPE, AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Component
annotation class UseCase(
    @get:AliasFor(annotation = Component::class)
    val value: String = ""
)