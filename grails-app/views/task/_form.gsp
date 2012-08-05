<%@ page import="org.micap.taskmanager.main.Task" %>



<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="task.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${taskInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'dueDate', 'error')} required">
	<label for="dueDate">
		<g:message code="task.dueDate.label" default="Due Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dueDate" precision="day"  value="${taskInstance?.dueDate}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'priority', 'error')} ">
	<label for="priority">
		<g:message code="task.priority.label" default="Priority" />
		
	</label>
	<g:textField name="priority" value="${taskInstance?.priority}"/>
</div>

