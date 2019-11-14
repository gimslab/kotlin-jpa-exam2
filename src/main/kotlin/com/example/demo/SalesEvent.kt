package com.example.demo

import java.time.LocalDateTime
import javax.persistence.*
import javax.persistence.EnumType.STRING

@Entity(name = "finance3p.sales_event")
class SalesEvent(

		@Enumerated(STRING)
		val eventType: SalesEventType

//		val eventId: Long,
//		val orderId: Long,
//		val vendorItemId: Long,
//		val quantity: Long,
//		val srcTime: LocalDateTime,
//		val extra: String,
//		val status: SalesEventStatus
//		@OneToOne(cascade = [(CascadeType.ALL)], orphanRemoval = true, fetch = FetchType.LAZY)
//		val item: SalesEventItem
) : AbstractJpaPersistable<Long>()

//@Entity
//class SalesEventItem(
//		val id: Long,
//		val itemName: String
//)
