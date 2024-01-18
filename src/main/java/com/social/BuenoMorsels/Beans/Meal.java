package com.social.BuenoMorsels.Beans;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="meal_id")
    private int mealId;

	public Meal(int mealId) {
		super();
		this.mealId = mealId;
	}

	public int getMealId() {
		return mealId;
	}

	public void setMealId(int mealId) {
		this.mealId = mealId;
	}

	@Override
	public String toString() {
		return "Meal [mealId=" + mealId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mealId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meal other = (Meal) obj;
		return mealId == other.mealId;
	}


	
	
	

}
