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
    @Column(name="meal_name")
    private String mealName;
    
	public Meal() {
		super();
	}

	public Meal(int mealId, String mealName) {
		super();
		this.mealId = mealId;
		this.mealName = mealName;
	}

	public int getMealId() {
		return mealId;
	}

	public void setMealId(int mealId) {
		this.mealId = mealId;
	}

	public String getMealName() {
		return mealName;
	}

	public void setMealName(String mealName) {
		this.mealName = mealName;
	}

	@Override
	public String toString() {
		return "Meal [mealId=" + mealId + ", mealName=" + mealName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mealId, mealName);
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
		return mealId == other.mealId && Objects.equals(mealName, other.mealName);
	}


}
