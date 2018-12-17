package edu.cuny.brooklyn.oop;

import java.util.Comparator;

import edu.cuny.brooklyn.oop.shape.Shape;

class ShapeNameComparator implements Comparator <Shape>{
	public int compare (Shape a, Shape b) {
		return a.getName().compareTo(b.getName());
	}
}
