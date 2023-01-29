package com.plcoding.mvvmtodoapp.ui.todo_list

import com.plcoding.mvvmtodoapp.data.Todo

sealed class TodoListEvent {
    object OnAddTodoClick : TodoListEvent()
    object OnUndoDeleteClick : TodoListEvent()
    data class OnTodoClick(val todo: Todo) : TodoListEvent()
    data class OnTodoDeleteClick(val todo: Todo) : TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean) : TodoListEvent()
}
