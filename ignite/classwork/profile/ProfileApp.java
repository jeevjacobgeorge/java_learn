package ignite.classwork.profile;

import java.util.Scanner;

public class ProfileApp {

	public static void main(String[] args) {
		String id,name,company,role;
		String filePath = "src/ignite/classwork/profile/profile.csv";
		Scanner sc = new Scanner(System.in);
		ProfileManager manager = new ProfileManager();
		manager.importProfile(filePath);
		while(true) {
			System.out.println("\n--- MENU ---\n1. Show all profiles\n2. Edit profile by ID\n3. Search by name\n4. Save\n5. Exit without Saving\n6. Add new Record");
			System.out.print("Choose: ");
			int choice  = sc.nextInt();
			sc.nextLine();  // clear buffer
			Profile [] profiles;
			switch(choice) {
			case 1:
				profiles = manager.getProfiles();
				for (int i = 0; i < manager.getIndex(); i++) {
					System.out.println(profiles[i]);
				}
				break;
			case 2:
				System.out.print("Enter ID to edit: ");
				id = sc.nextLine();
				System.out.print("New Name: ");
                name = sc.nextLine();
                System.out.print("New Company: ");
                company = sc.nextLine();
                System.out.print("New Role: ");
                role = sc.nextLine();
				manager.editProfile(id, name, company, role);
				System.out.println("Profile updated.");
				profiles = manager.getProfiles();
				for (int i = 0; i < manager.getIndex(); i++) {
					System.out.println(profiles[i]);
				}
				break;
			case 3:
				System.out.print("Name to search: ");
                manager.getProfilesByName(sc.nextLine());
                break;
			case 4:
				manager.exportProfile(filePath);
				break;
			case 5:
				sc.close();
				return;
			case 6:
				System.out.print("New ID: ");
				id = sc.nextLine();
				System.out.print("New Name: ");
                name = sc.nextLine();
                System.out.print("New Company: ");
                company = sc.nextLine();
                System.out.print("New Role: ");
                role = sc.nextLine();
				Profile newProfile = new Profile(id, name, company, role);
				manager.addProfile(newProfile);
				break;			
				
			default:
				System.out.println("Invalid choice");


			}

		}
	}
}
