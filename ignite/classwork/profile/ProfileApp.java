package ignite.classwork.profile;

public class ProfileApp {

	public static void main(String[] args) {
		ProfileManager pm = new ProfileManager();
		Profile [] profileArr = pm.importProfile("src/ignite/classwork/profile/profile.csv");
		for(int i = 0; i <pm.getIndex(); i++) {
			System.out.println(profileArr[i].toString());
		}
	}

}
