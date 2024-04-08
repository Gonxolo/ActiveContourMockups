package mockup;
import javax.swing.JPanel;
import java.awt.Component;

public final class PresetShapePanel {
	/**
	 * @wbp.factory
	 * @wbp.factory.parameter.source comp presetIconButton
	 * @wbp.factory.parameter.source comp_1 presetLabel
	 */
	public static JPanel createJPanel(Component comp, Component comp_1) {
		JPanel panel = new JPanel();
		panel.add(comp);
		panel.add(comp_1);
		return panel;
	}
}