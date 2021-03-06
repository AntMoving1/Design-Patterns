package com.ptn.creation._21visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

	List<Element> eList = new ArrayList<>();

	public void addElement(Element element) {
		eList.add(element);
	}

	public void visitAllElement(IVisitor visitor) {
		for (Element element : eList) {
			element.accept(visitor);
		}
	}
}
