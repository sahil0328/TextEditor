import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Close")){


	                JNotepad.re.setVisible(false);
	            
			
			
		}
		// TODO Auto-generated method stub
		
	}

}
