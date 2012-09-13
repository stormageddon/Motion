package org.micap.taskmanager.main

class Task implements Comparable {
	
	String 	description
	//Priority priority
	int priority
	java.util.Date	dueDate
	
    static constraints = {
		description blank: false
		priority blank: false
    }

	/**
	 * Returns true if this priority is before the 
	 * param priority, otherwise it is based on the
	 * due date of both tasks.
	 */
	@Override
	public int compareTo(Object oTask) {
		// TODO Auto-generated method stub
		int result = 0

		if( this.priority > oTask.priority ) {
			result = -1
		}
		else if( this.priority < oTask.priority ) {
			result = 1
		}
		else {
			if( this.dueDate.before(oTask.dueDate)) {
				result = -1
			} else if( this.dueDate.after(oTask.dueDate)) {
				result = 1
			}
		}
		return result
	}	
}
