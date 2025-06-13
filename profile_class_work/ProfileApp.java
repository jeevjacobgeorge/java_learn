package profile_class_work;

public class ProfileApp {

	public static void main(String[] args) {
		ProfileManager pm = new ProfileManager("src/profile_class_work/profile.csv");
		Profile [] profileArr = pm.getProfiles();
		for(int i = 0; i <pm.getIndex(); i++) {
			System.out.println(profileArr[i].toString());
		}
	}

}
