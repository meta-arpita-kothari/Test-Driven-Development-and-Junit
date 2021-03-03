package LargestMirrorSection;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LargestMirrorSectionTest {

	@Test
	public void shouldReturnMaxMirrorTest() {
		int elementsArray[]={1,2,3,8,9,3,2,1};
		int result=LargestMirrorSection.maxMirror(elementsArray);
		
		assertEquals(3,result);
	}
	
	//negative test case
	@Test
	public void negativeCaseToReturnMaxMirrorTest() {
		int elementsArray[]={1,2,3,8,9,3,2,1};
		int result=LargestMirrorSection.maxMirror(elementsArray);
		
		assertNotEquals(4,result);
	}
	
	
	@Test
	public void shoudlReturnErrorOnEmptyArrayTest() {
		int elementsArray[]={};
		
		try{
			int result=LargestMirrorSection.maxMirror(elementsArray);
		}
		catch(AssertionError e){
			assertEquals(e.getMessage(), "Array is Empty!");
		}
	}
	
	//negative test case
	@Test
	public void negativeCaseToReturnMaxMirrorTest2() {
		int elementsArray[]={1,2,3,8,9,3,2,1};
		int result=LargestMirrorSection.maxMirror(elementsArray);
		
		assertNotEquals(4,result);
	}
}
