package team.me.common.annotations

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component

/**
 * WebAdapter를 식별하는데 사용하는 어댑터 인터페이스
 */
@Target(AnnotationTarget.TYPE, AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Component
annotation class WebAdapter(
    @get:AliasFor(annotation = Component::class)
    val value: String = ""
)
