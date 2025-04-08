package com.example.test;

//import com.example.access.PackagePrivateClass;
import com.example.access.PublicClass;

public class AccessTest {

	public static void main(String[] args) {
		PublicClass pub=new PublicClass();
		pub.showPublicMessage();
		
//		PackagePrivateClass pri=new PackagePrivateClass();
//		pri.showPackagePrivateMessage();
		// The following line will cause a compile-time error because PackagePrivateClass is not public
        // and cannot be accessed from outside its package
        // PackagePrivateClass pri = new PackagePrivateClass();
        // pri.showPackagePrivateMessage();

        System.out.println("Attempt to access package-private class will result in a compile-time error.");
    

	}

}
