package com.abdicodes.todo.reminders.model;


import javax.persistence.*;


@Entity
@Table
public class Todo {
	@Id
	@SequenceGenerator(
			name="todo_sequence",
			sequenceName = "todo_sequence",
			allocationSize = 1

	)
	@GeneratedValue(
			generator = "todo_sequence",
			strategy = GenerationType.SEQUENCE
	)
	private Long id;
    private String title;
    private boolean completed;


    public Todo() { }

    public Todo(Long id, String title, boolean completed) {

        this.title = title;
        this.id = id;
        this.completed = completed;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Long getid() {
        return this.id;

    }

    public void setid(Long id) {
        this.id = id;

    }

    public boolean isCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


}