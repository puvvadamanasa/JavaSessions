package testngSessions;

import org.testng.annotations.Test;

public class CrudoOperationTest {
	
	public void createUser() {
		System.out.println("create user");
	}
	
   public void getUser(int userid) {
		System.out.println("get user"+userid);
	}

   public void updateUser(int userid) {
	   System.out.println("update user");
   }
   
   public void deleteUser(int userid) {
	  System.out.println("delete user");
   }
   @Test
   public void createUserTest() {
	   createUser();
   }
   @Test
   public void getUserTest() {
	   createUser();//123
	   getUser(123);
   }
   @Test
   public void updateUserTest() {
	   createUser();//123
	   getUser(123);
	   updateUser(123);
	   getUser(123);
   }
   
   @Test
   public void deleteUserTest() {
	   createUser();//123
	   getUser(123);
	   deleteUser(123);
	   getUser(123);
   }
   @Test
   public void getUserTesting() {
	   createUser();
	   getUser(123);
   }

}
