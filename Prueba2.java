package Ejemplo1;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Prueba2 {

	protected Shell shell;
	private Text txtPpp;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Prueba2 window = new Prueba2();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setSize(600, 600);
		shell.setText("SWT Application");
		
		Label lblUnidades = new Label(shell, SWT.NONE);
		lblUnidades.setBounds(112, 130, 55, 15);
		lblUnidades.setText("Unidades");
		
		Label lblPrecio = new Label(shell, SWT.NONE);
		lblPrecio.setBounds(112, 169, 55, 15);
		lblPrecio.setText("Precio");
		
		txtPpp = new Text(shell, SWT.BORDER);
		txtPpp.setBounds(236, 130, 234, 21);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(236, 169, 234, 21);
		
		Button btnCalcular = new Button(shell, SWT.NONE);
		btnCalcular.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text_2 = new Text(shell, SWT.BORDER);
				text_2.setBounds(236, 277, 245, 54);
				double result = Double.parseDouble(txtPpp.getText());
				double dnum = Double.parseDouble(text_1.getText());
			double	res=dnum*result;
			btnCalcular.setBounds(236, 218, 75, 25);
			btnCalcular.setText("Calcular");
			
			Label label = new Label(shell, SWT.NONE);
			label.setBounds(236, 259, 234, 34);
			label.setText("El precio es:" + res);
			System.out.println("El precio total es: "+res);
			if(dnum==0) {
				System.out.println("Las unidades no pueden ser 0");
			}else if (result==0){
				System.out.println("El precio tampoco puede ser 0");
			}
			}
		});
		btnCalcular.setBounds(255, 251, 75, 25);
		btnCalcular.setText("Calcular");
		
		
		
	}
}
