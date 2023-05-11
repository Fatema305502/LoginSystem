package views.loginresult;

import core.ViewHandler;
import core.ViewModelFactory;
import javafx.event.ActionEvent;
import views.ViewController;

public class LoginResultController implements ViewController
{
  // worlds most boring class
  // This is just the result view. Only thing I can do is terminate the application

  public void onExitButton(ActionEvent actionEvent) {
    System.exit(0);
  }

  @Override
  public void init(ViewHandler vh, ViewModelFactory vmf) {

  }
}
