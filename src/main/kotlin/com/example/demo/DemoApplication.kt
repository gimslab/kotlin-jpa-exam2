package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication(
		val repository: SalesEventRepository
) {

	init {
		println("HHHHHHHHHHHHHHHHHHHHH")
		val se = SalesEvent(eventType = SalesEventType.ORD_DLV)

		println("hashCodeBefore=${se.hashCode()}")
		println("seSet=${hashSetOf(se)}")

		val saved = repository.save(se)
		println("saved=$saved")

		println("hashCodeBefore=" + se.hashCode())
		println("seSet=" + hashSetOf(se))
		println("EEEEEEEEEEEEEEEEEEE")
	}
}

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
