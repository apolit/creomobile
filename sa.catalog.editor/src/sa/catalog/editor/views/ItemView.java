package sa.catalog.editor.views;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import com.creocode.catalog.CatalogPackage;
import com.creocode.catalog.ItemType;
import com.creocode.catalog.presentation.CatalogEditor;

public class ItemView extends ViewPart implements ISelectionListener {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "sa.catalog.editor.views.ItemView";

	private Text titleText;

	private StyledText introStyledText;

	private StyledText contentStyledText;

	private ItemType selectedItem;
	private Button btnShowAllItems;

	private CatalogEditor editor;
	private Button btnClean;
	private Label lblImage;
	private Button btnChooseImage;
	private List list;
	private Composite composite;
	private Button btnRemove;
	private Button btnUp;
	private Button btnDown;

	/**
	 * The constructor.
	 */
	public ItemView() {

	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(2, false));

		btnShowAllItems = new Button(parent, SWT.NONE);
		btnShowAllItems.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				TreeViewer viewer = (TreeViewer) editor.getViewer();
				viewer.expandAll();
			}
		});
		btnShowAllItems.setText("Show all items");
		new Label(parent, SWT.NONE);

		Label lblTitle = new Label(parent, SWT.NONE);
		lblTitle.setText("Title (name)");
		new Label(parent, SWT.NONE);

		titleText = new Text(parent, SWT.BORDER);
		titleText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		titleText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (selectedItem == null)
					return;
				editor.getEditingDomain().getCommandStack().execute(
						new SetCommand(editor.getEditingDomain(), selectedItem,
								CatalogPackage.eINSTANCE.getItemType_Title(), titleText.getText()));
			}
		});

		Label lblIntro = new Label(parent, SWT.NONE);
		lblIntro.setText("Intro (short introduction, if needed)");
		new Label(parent, SWT.NONE);

		introStyledText = new StyledText(parent, SWT.BORDER|SWT.V_SCROLL);
		GridData gd_introStyledText = new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1);
		gd_introStyledText.heightHint = 31;
		introStyledText.setLayoutData(gd_introStyledText);
		introStyledText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (selectedItem == null)
					return;
				editor.getEditingDomain().getCommandStack().execute(
						new SetCommand(editor.getEditingDomain(), selectedItem,
								CatalogPackage.eINSTANCE.getItemType_Intro(), introStyledText
										.getText()));
			}
		});
		introStyledText.setWordWrap(true);
		introStyledText.setWrapIndent(5);

		Label lblContentmainText = new Label(parent, SWT.NONE);
		lblContentmainText.setText("Content (main text)");

		btnClean = new Button(parent, SWT.NONE);
		btnClean.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnClean.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = contentStyledText.getText();
				text = text.replaceAll("\r\n", " ");
				text = text.replaceAll("\n", " ");
				text = text.replaceAll("    ", " ");
				text = text.replaceAll("   ", " ");
				text = text.replaceAll("  ", " ");
				text = text.replaceAll("\t", " ");
				contentStyledText.setText(text);
				editor.getEditingDomain().getCommandStack().execute(
						new SetCommand(editor.getEditingDomain(), selectedItem,
								CatalogPackage.eINSTANCE.getItemType_Content(), contentStyledText
										.getText()));
			}
		});
		btnClean.setToolTipText("Compacts text to one line, removes unnecessary spaces");

		btnClean.setText("Clean text");

		contentStyledText = new StyledText(parent, SWT.BORDER | SWT.H_SCROLL
				| SWT.V_SCROLL);
		contentStyledText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		contentStyledText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (selectedItem == null)
					return;
				editor.getEditingDomain().getCommandStack().execute(
						new SetCommand(editor.getEditingDomain(), selectedItem,
								CatalogPackage.eINSTANCE.getItemType_Content(), contentStyledText
										.getText()));
			}
		});

		contentStyledText.setWordWrap(true);
		contentStyledText.setWrapIndent(5);

		lblImage = new Label(parent, SWT.NONE);
		lblImage.setText("Images");
		new Label(parent, SWT.NONE);

		list = new List(parent, SWT.BORDER | SWT.H_SCROLL);
		list.setItems(new String[] {});
		list.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

		composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));

		btnUp = new Button(composite, SWT.NONE);
		btnUp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = list.getSelectionIndex();
				if (index < 1)
					return;
				java.util.List<String> details = new ArrayList<String>(selectedItem.getDetails()
						.getDetail());
				String detail = details.remove(index);
				details.add(index - 1, detail);

				updateDetails(details);
			}

		});
		btnUp.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnUp.setText("Up");

		btnChooseImage = new Button(composite, SWT.CENTER);
		btnChooseImage.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnChooseImage.setText("Add");
		btnChooseImage.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(getSite().getShell(), SWT.NULL);
				dialog.setFilterExtensions(new String[] { "*.jpg;*.png" });
				dialog.setFilterNames(new String[] { "Images" });
				String path = dialog.open();
				if (path != null) {
					File file = new File(path);
					if (file.isFile())
						displayFiles(new String[] { file.toString() });
					else
						displayFiles(file.list());
				}
			}

			private void displayFiles(String[] strings) {

				if (selectedItem.getDetails() == null) {
					editor.getEditingDomain().getCommandStack().execute(
							new SetCommand(editor.getEditingDomain(), selectedItem,
									CatalogPackage.eINSTANCE.getItemType_Details(),
									CatalogPackage.eINSTANCE.getEFactoryInstance().create(
											CatalogPackage.eINSTANCE.getDetailsType())));
				}

				java.util.List<String> details = new ArrayList<String>(selectedItem.getDetails()
						.getDetail());

				for (String string : strings) {
					int lastIndex = 0;
					if (string.contains("/")) {
						lastIndex = string.lastIndexOf("/");
					} else if (string.contains("\\")) {
						lastIndex = string.lastIndexOf("\\");
					}
					string = string.substring(lastIndex);
					details.add(string);
				}
				updateDetails(details);
			}
		});

		btnDown = new Button(composite, SWT.NONE);
		btnDown.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				int index = list.getSelectionIndex();
				java.util.List<String> details = new ArrayList<String>(selectedItem.getDetails()
						.getDetail());
				if (index >= details.size() - 1) {
					return;
				}

				String detail = details.remove(index);
				if (index + 1 < details.size()) {
					details.add(index + 1, detail);
				} else {
					details.add(detail);
				}
				updateDetails(details);
			}
		});
		btnDown.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnDown.setText("Down");

		btnRemove = new Button(composite, SWT.CENTER);
		btnRemove.setText("Remove");
		btnRemove.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				int index = list.getSelectionIndex();

				java.util.List<String> details = new ArrayList<String>(selectedItem.getDetails()
						.getDetail());
				details.remove(index);

				updateDetails(details);
			}
		});

		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);

		updateControls();
		// Create the help context id for the viewer's control
		// PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(),
		// "sa.catalog.editor.viewer");
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		contentStyledText.setFocus();
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {

		selectedItem = null;
		btnShowAllItems.setEnabled(false);

		if (part instanceof CatalogEditor) {
			editor = (CatalogEditor) part;

			btnShowAllItems.setEnabled(true);

			if (selection instanceof TreeSelection) {
				Object object = ((TreeSelection) selection).getFirstElement();
				if (object instanceof ItemType) {
					selectedItem = (ItemType) object;
				}
			}
		}

		updateControls();

	}

	private void updateControls() {

		if (selectedItem != null) {

			titleText.setEnabled(true);
			introStyledText.setEnabled(true);
			contentStyledText.setEnabled(true);
			list.setEnabled(true);

			titleText.setText(selectedItem.getTitle() != null ? selectedItem.getTitle() : "");
			introStyledText.setText(selectedItem.getIntro() != null ? selectedItem.getIntro() : "");
			contentStyledText.setText(selectedItem.getContent() != null ? selectedItem.getContent()
					: "");

			if (selectedItem.getDetails() != null) {
				EList<String> details = selectedItem.getDetails().getDetail();
				list.setItems(details.toArray(new String[0]));
			}

		} else {

			titleText.setEnabled(false);
			introStyledText.setEnabled(false);
			contentStyledText.setEnabled(false);
			list.setEnabled(false);

			titleText.setText("");
			introStyledText.setText("");
			contentStyledText.setText("");
			list.setItems(new String[0]);
		}

	}

	private void updateDetails(java.util.List<String> details) {
		editor.getEditingDomain().getCommandStack().execute(
				new SetCommand(editor.getEditingDomain(), selectedItem.getDetails(),
						CatalogPackage.eINSTANCE.getDetailsType_Detail(), details));

		updateControls();
	}

	public void dispose() {
		ISelectionService s = getSite().getWorkbenchWindow().getSelectionService();
		s.removeSelectionListener(this);
		super.dispose();
	}

}