package org.micap.taskmanager.main

class Priority implements Comparable {
	
	private int priorityLevel 		// 1 = low, 2 = mid, 3 = high
	private String priorityAsString

	public void setPriority( int priority ) {
		switch( priority ) {
			case 1:
				this.priorityAsString = "LOW"
		}
		this.priorityLevel = priority
	}
	
	public int getPriorityLevel() {
		return this.priorityLevel
	}
	
	@Override
	public boolean equals(Object otherPriority) {
		return this.priorityLevel == otherPriority.getPriorityLevel()
	}
	
	@Override
	public int compareTo(Object oPriority) {
		int result = 0
		
		if( this.priorityLevel > oPriority.getPriorityLevel() ) {
			result = -1
		} else if( this.priorityLevel < oPriority.getPriorityLevel()) {
			result = 1
		} // else they are equal
		
		return result;
	}
	
	public String toString() {
		return " priority: " + this.priorityLevel
	}

}
