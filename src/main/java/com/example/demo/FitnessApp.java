package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FitnessApp {
	public static void main(String[] args) {
		SpringApplication.run(FitnessApp.class, args);
	}
}

@RestController
@RequestMapping("/users")
class UserController {
	private final List<User> users = new ArrayList<>();

	@PostMapping
	public User addUser(@RequestBody User user) {
		users.add(user);
		return user;
	}

	@GetMapping
	public List<User> getUsers() {
		return users;
	}
}

@RestController
@RequestMapping("/workout-plans")
class WorkoutPlanController {
	private final List<WorkoutPlan> workoutPlans = new ArrayList<>();

	@PostMapping
	public WorkoutPlan addWorkoutPlan(@RequestBody WorkoutPlan workoutPlan) {
		workoutPlans.add(workoutPlan);
		return workoutPlan;
	}

	@GetMapping
	public List<WorkoutPlan> getWorkoutPlans() {
		return workoutPlans;
	}
}

class User {
	private String name;
	private int age;

	public User() {}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class WorkoutPlan {
	private String title;
	private String description;

	public WorkoutPlan() {}

	public WorkoutPlan(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}