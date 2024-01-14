package team.me.membership.adapter.out.persistence.jpa.entity

import jakarta.persistence.*
import java.time.LocalDateTime

/**
 * @author Doyeop Kim
 * @since 2023/12/03
 */
@MappedSuperclass
open class BaseJpaEntity(
    @get:Column(name = "created_at", nullable = false)
    var createdAt: LocalDateTime = LocalDateTime.now(),
    @get:Column(name = "deleted_at", nullable = true)
    var deletedAt: LocalDateTime? = null,
)