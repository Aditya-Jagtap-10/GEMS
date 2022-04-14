// Main.java

import java.io.*;
import java.util.ArrayList;

public class Main {
    @SuppressWarnings("unchecked")
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of users:");
        int n = Integer.parseInt(br.readLine());
        ArrayList users = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            System.out.println("Enter the details of user :"+i);
            String[] details = (br.readLine()).split(",");
            User user = new User(details[0], details[1], details[2], details[3]);
            users.add(user);
        }
        UserBO userBO = new UserBO();
        FileWriter writer = new FileWriter("output.csv");  
        BufferedWriter buffer = new BufferedWriter(writer);  
        userBO.writeFile(users, buffer); 
        buffer.close();
        br.close();
	}
}


// User.java

public class User {
    String name,mobileNumber,username,password;
    
    User() {}
    
    User(String name, String mobileNumber, String username, String password) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.username = username;
        this.password = password;
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s\n",this.name,this.mobileNumber,this.username,this.password);
    }
    
}


// UserBO.java

import java.util.ArrayList;
import java.io.*;

public class UserBO {

	public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws Exception {
		for (User user : userList) {
    	 bw.write(user.toString());
		}
	}
}
