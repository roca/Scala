//File left intentionally blank for you to edit.
package com.agiledeveloper.lab

class Creature(val  color: String) {
	Creature.count += 1
}

object Creature {
	var count = 0
	def apply(color: String) = new Creature(color)
}