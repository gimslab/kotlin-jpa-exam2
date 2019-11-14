package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository

interface SalesEventRepository : JpaRepository<SalesEvent, Long> {
//	fun findByOrderId(orderId: Long): List<SalesEvent>
}
