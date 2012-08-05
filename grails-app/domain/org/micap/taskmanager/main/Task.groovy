package org.micap.taskmanager.main

class Task implements Comparable {
	
	String 	description
	//Priority priority
	String priority
	java.util.Date	dueDate
	
    static constraints = {
		description blank: false
		priority blank: false
    }

	/**
	 * Returns true if this date is before the 
	 * param date
	 */
	@Override
	public int compareTo(Object oTask) {
		// TODO Auto-generated method stub
		int result = 0
	/*	if( this.priority.compareTo(oTask.priority) < 0 ) {
			result = -1
		}l
		else {*/
			if( this.dueDate.before(oTask.dueDate)) {
				result = -1
			} else if( this.dueDate.after(oTask.dueDate)) {
				result = 1
			}
		//}
		return result
	}	
}
