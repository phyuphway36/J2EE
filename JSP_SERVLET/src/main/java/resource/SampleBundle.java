package resource;

import java.util.ListResourceBundle;

public class SampleBundle extends ListResourceBundle {
	private static final Object[][] RESOURCE = {
			{"fruit.apple","Apple"},
			{"fruit.orange","Orange"},
			{"fruit.banana","Banana"},
			{"fruit.papaya","Papaya"}
			
	};

	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return RESOURCE;
	}

}
