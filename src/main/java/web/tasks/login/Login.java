package web.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static web.ui.LoginPage.*;

public class Login implements Task {

    private String user;
    private String pass;

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Enter.theValue(user).into(EMAIL_INPUT));
        t.attemptsTo(Enter.theValue(pass).into(PASS_INPUT));
        t.attemptsTo(Click.on(SUBMIT_LOGIN));
    }

    public Login(String user, String pass){
        this.user = user;
        this.pass = pass;
    }

    public static Login withCredential(String username, String password){
        return Tasks.instrumented(Login.class,username,password);
    }
}
