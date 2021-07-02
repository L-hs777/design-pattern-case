package design.part3.test;

/**
 * 服装类
 */
public class Finery implements Component {
    protected Component component;

    public void setPerson(Component component) {
        this.component = component;
    }

    @Override
    public void Show() {
        if (component != null) {
            component.Show();
        }
    }
}
