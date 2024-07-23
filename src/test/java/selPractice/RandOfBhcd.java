package selPractice;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinUser;


public class RandOfBhcd {
	
	 public static void main(String[] args) {
	        final char[] buffer = new char[1024];

	        User32.INSTANCE.EnumWindows(new WinUser.WNDENUMPROC() {
	            public boolean callback(WinDef.HWND hWnd, Pointer data) {
	                User32.INSTANCE.GetWindowText(hWnd, buffer, buffer.length);
	                String windowTitle = Native.toString(buffer).toLowerCase();
	                System.out.println(windowTitle);
	                
	                // Check if the window title contains "chrome"
	                if (windowTitle.contains("*untitled - notepad")) {
	                    User32.INSTANCE.ShowWindow(hWnd, WinUser.SW_MAXIMIZE);
	                }
	                
	                return true;
	            }
	        }, null);
	    }

}
