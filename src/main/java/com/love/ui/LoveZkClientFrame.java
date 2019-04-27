package com.love.ui;

import com.love.client.ClientProvider;
import com.love.config.ClientCreateConfig;
import com.love.manager.ZookeeperFacade;
import com.love.manager.ZookeeperFacadeImpl;
import com.love.model.ACL;
import com.love.model.ZNodeType;
import org.apache.zookeeper.data.Stat;

import javax.swing.*;
import java.net.InetAddress;

public class LoveZkClientFrame extends javax.swing.JFrame {

	private ZookeeperFacade zookeeperFacade;
	private ClientCreateConfig createConfig;
	// Variables declaration - do not modify
	private javax.swing.JTextArea aclInfoTextArea;
	private javax.swing.JPanel aclPanel;
	private javax.swing.JCheckBox addWatchOnFetchCheckBox;
	private javax.swing.JPanel childrenPanel;
	private javax.swing.JTextArea childrenTextArea;
	private javax.swing.JComboBox<String> commandComboBox;
	private javax.swing.JPanel commandPanel;
	private javax.swing.JTextArea commandTextArea;
	private javax.swing.JPanel configPanel;
	private javax.swing.JButton createNodeButton;
	private javax.swing.JPanel createNodePane;
	private javax.swing.JTextArea createNodeTextArea;
	private javax.swing.JPanel dataPanel;
	private javax.swing.JPanel deleteDataPanel;
	private javax.swing.JButton deleteNodeButton;
	private javax.swing.JComboBox<String> depthComboBox;
	private javax.swing.JButton disconnectClient;
	private javax.swing.JRadioButton ephimeralRadioButton;
	private javax.swing.JButton fetchChildrenButton;
	private javax.swing.JButton fetchData;
	private javax.swing.JButton getACLInfoButton;
	private javax.swing.JButton getCommandInfo;
	private javax.swing.JTextArea getDataTextArea;
	private javax.swing.JButton getStatButton;
	private javax.swing.JTextArea getStatTextArea;
	private javax.swing.JPanel handlePanel;
	private javax.swing.JComboBox<String> ipAddressComboBox;
	private javax.swing.JLabel ipAddressLabel;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JScrollPane jScrollPane6;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.ButtonGroup nodeTypeButtonGroup;
	private javax.swing.JComboBox<String> pathComboBox;
	private javax.swing.JRadioButton persistentRadioButton;
	private javax.swing.JButton pingButton;
	private javax.swing.JTextField pingTimeout;
	private javax.swing.JComboBox<String> portComboBox;
	private javax.swing.JLabel portLabel;
	private javax.swing.JButton reconnectClientButton;
	private javax.swing.JCheckBox sequentialCheckBox;
	private javax.swing.JTextField sessionTimeOut;
	private javax.swing.JLabel sessionTimeoutLabel;
	private javax.swing.JPanel statPanel;
	private javax.swing.JTabbedPane tabbedPane;
	private javax.swing.JButton updateACLInfoButton;
	private javax.swing.JButton updateDataButton;
	private javax.swing.JTextField versionTextArea;
	/**
	 * Creates new form NewJFrame
	 */
	public LoveZkClientFrame() {
		initComponents();
	}

	public void display() {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(LoveZkClientFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(LoveZkClientFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(LoveZkClientFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(LoveZkClientFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}

        /* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoveZkClientFrame().setVisible(true);
			}
		});
	}

	@SuppressWarnings ("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		nodeTypeButtonGroup = new javax.swing.ButtonGroup();
		tabbedPane = new javax.swing.JTabbedPane();
		childrenPanel = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		childrenTextArea = new javax.swing.JTextArea();
		depthComboBox = new javax.swing.JComboBox<>();
		jLabel3 = new javax.swing.JLabel();
		fetchChildrenButton = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		pingButton = new javax.swing.JButton();
		dataPanel = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		getDataTextArea = new javax.swing.JTextArea();
		fetchData = new javax.swing.JButton();
		updateDataButton = new javax.swing.JButton();
		versionTextArea = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		addWatchOnFetchCheckBox = new javax.swing.JCheckBox();
		statPanel = new javax.swing.JPanel();
		jScrollPane4 = new javax.swing.JScrollPane();
		getStatTextArea = new javax.swing.JTextArea();
		getStatButton = new javax.swing.JButton();
		createNodePane = new javax.swing.JPanel();
		jPanel1 = new javax.swing.JPanel();
		persistentRadioButton = new javax.swing.JRadioButton();
		ephimeralRadioButton = new javax.swing.JRadioButton();
		sequentialCheckBox = new javax.swing.JCheckBox();
		createNodeButton = new javax.swing.JButton();
		jSeparator1 = new javax.swing.JSeparator();
		jScrollPane5 = new javax.swing.JScrollPane();
		createNodeTextArea = new javax.swing.JTextArea();
		jLabel6 = new javax.swing.JLabel();
		deleteDataPanel = new javax.swing.JPanel();
		deleteNodeButton = new javax.swing.JButton();
		aclPanel = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		aclInfoTextArea = new javax.swing.JTextArea();
		getACLInfoButton = new javax.swing.JButton();
		updateACLInfoButton = new javax.swing.JButton();
		commandPanel = new javax.swing.JPanel();
		jScrollPane6 = new javax.swing.JScrollPane();
		commandTextArea = new javax.swing.JTextArea();
		commandComboBox = new javax.swing.JComboBox<>();
		getCommandInfo = new javax.swing.JButton();
		configPanel = new javax.swing.JPanel();
		sessionTimeOut = new javax.swing.JTextField();
		sessionTimeoutLabel = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		pingTimeout = new javax.swing.JTextField();
		handlePanel = new javax.swing.JPanel();
		disconnectClient = new javax.swing.JButton();
		reconnectClientButton = new javax.swing.JButton();
		ipAddressComboBox = new javax.swing.JComboBox<>();
		ipAddressLabel = new javax.swing.JLabel();
		portComboBox = new javax.swing.JComboBox<>();
		pathComboBox = new javax.swing.JComboBox<>();
		portLabel = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Love Zookeeper Client");
		setBackground(new java.awt.Color(0, 0, 0));

		tabbedPane.setBackground(new java.awt.Color(204, 204, 255));
		tabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tabbedPaneMouseClicked(evt);
			}
		});

		childrenTextArea.addKeyListener(new ChildrenTextAreaKeyListener(childrenTextArea, pathComboBox));
		childrenTextArea.setBackground(new java.awt.Color(0, 0, 0));
		childrenTextArea.setColumns(20);
		childrenTextArea.setForeground(new java.awt.Color(255, 255, 255));
		childrenTextArea.setLineWrap(true);
		childrenTextArea.setRows(5);
		jScrollPane1.setViewportView(childrenTextArea);

		depthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4"}));

		jLabel3.setText("Depth");

		fetchChildrenButton.setText("Fetch");
		fetchChildrenButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fetchChildrenButtonActionPerformed(evt);
			}
		});

		jLabel4.setText("Children count :");

		pingButton.setText("Ping");
		pingButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				pingButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout childrenPanelLayout = new javax.swing.GroupLayout(childrenPanel);
		childrenPanel.setLayout(childrenPanelLayout);
		childrenPanelLayout.setHorizontalGroup(
				childrenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1).addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						childrenPanelLayout.createSequentialGroup().addContainerGap().addComponent(jLabel4)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 382,
										Short.MAX_VALUE).addComponent(pingButton)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(fetchChildrenButton)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabel3)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(depthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
		childrenPanelLayout.setVerticalGroup(
				childrenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						childrenPanelLayout.createSequentialGroup()
								.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(
								childrenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(depthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel3)
										.addComponent(fetchChildrenButton).addComponent(jLabel4)
										.addComponent(pingButton))));

		tabbedPane.addTab("Children", childrenPanel);

		getDataTextArea.setBackground(new java.awt.Color(0, 0, 0));
		getDataTextArea.setColumns(20);
		getDataTextArea.setForeground(new java.awt.Color(255, 255, 255));
		getDataTextArea.setLineWrap(true);
		getDataTextArea.setRows(5);
		jScrollPane2.setViewportView(getDataTextArea);

		fetchData.setText("Fetch");
		fetchData.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fetchDataActionPerformed(evt);
			}
		});

		updateDataButton.setText("Update Data");
		updateDataButton.setToolTipText("");
		updateDataButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				updateDataButtonActionPerformed(evt);
			}
		});

		jLabel5.setText("version");
		jLabel5.setToolTipText("");

		addWatchOnFetchCheckBox.setText("Add Watch");

		javax.swing.GroupLayout dataPanelLayout = new javax.swing.GroupLayout(dataPanel);
		dataPanel.setLayout(dataPanelLayout);
		dataPanelLayout.setHorizontalGroup(
				dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(dataPanelLayout.createSequentialGroup().addContainerGap().addComponent(jScrollPane2))
						.addGroup(dataPanelLayout.createSequentialGroup().addComponent(updateDataButton)
								.addGap(18, 18, 18).addComponent(jLabel5)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(versionTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 168,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220,
										Short.MAX_VALUE).addComponent(addWatchOnFetchCheckBox)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(fetchData)));
		dataPanelLayout.setVerticalGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(dataPanelLayout.createSequentialGroup()
						.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(
								dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(fetchData).addComponent(updateDataButton)
										.addComponent(versionTextArea, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel5)
										.addComponent(addWatchOnFetchCheckBox)).addContainerGap()));

		tabbedPane.addTab("Data", dataPanel);

		getStatTextArea.setBackground(new java.awt.Color(0, 0, 0));
		getStatTextArea.setColumns(20);
		getStatTextArea.setForeground(new java.awt.Color(255, 255, 255));
		getStatTextArea.setLineWrap(true);
		getStatTextArea.setRows(5);
		getStatTextArea.setText(
				"czxid : The zxid of the change that caused this znode to be created.\n\nmzxid : The zxid of the change that last modified this znode.\n\nctime : The time in milliseconds from epoch when this znode was created.\n\nmtime : The time in milliseconds from epoch when this znode was last modified.\n\nversion :The number of changes to the data of this znode.\n\ncversion : The number of changes to the children of this znode.\n\naversion : The number of changes to the ACL of this znode.\n\nephemeralOwner : The session id of the owner of this znode if the znode is an ephemeral node. \nIf it is not an ephemeral node, it will be zero.\n\ndataLength : The length of the data field of this znode.\n\nnumChildren : The number of children of this znode.");
		jScrollPane4.setViewportView(getStatTextArea);

		getStatButton.setText("Get Stat");
		getStatButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				getStatButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout statPanelLayout = new javax.swing.GroupLayout(statPanel);
		statPanel.setLayout(statPanelLayout);
		statPanelLayout.setHorizontalGroup(
				statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						statPanelLayout.createSequentialGroup().addContainerGap().addGroup(
								statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 762,
												Short.MAX_VALUE).addGroup(
										statPanelLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
												.addComponent(getStatButton)))));
		statPanelLayout.setVerticalGroup(statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(statPanelLayout.createSequentialGroup()
						.addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(getStatButton)));

		tabbedPane.addTab("Stat", statPanel);

		nodeTypeButtonGroup.add(persistentRadioButton);
		persistentRadioButton.setSelected(true);
		persistentRadioButton.setText("Persistent");

		nodeTypeButtonGroup.add(ephimeralRadioButton);
		ephimeralRadioButton.setText("Ephimeral");

		sequentialCheckBox.setText("Sequential");

		createNodeButton.setText("Create");
		createNodeButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				createNodeButtonActionPerformed(evt);
			}
		});

		createNodeTextArea.setBackground(new java.awt.Color(0, 0, 0));
		createNodeTextArea.setColumns(20);
		createNodeTextArea.setForeground(new java.awt.Color(255, 255, 255));
		createNodeTextArea.setLineWrap(true);
		createNodeTextArea.setRows(5);
		jScrollPane5.setViewportView(createNodeTextArea);

		jLabel6.setText("Data");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING).addGroup(
						jPanel1Layout.createSequentialGroup().addGroup(
								jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
										jPanel1Layout.createSequentialGroup().addContainerGap()
												.addComponent(jScrollPane5)).addGroup(
										jPanel1Layout.createSequentialGroup().addGap(21, 21, 21).addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(persistentRadioButton).addGroup(
														jPanel1Layout.createSequentialGroup()
																.addComponent(ephimeralRadioButton).addGap(29, 29, 29)
																.addComponent(sequentialCheckBox))).addGap(65, 65, 65)
												.addComponent(createNodeButton).addGap(0, 372, Short.MAX_VALUE)))
								.addContainerGap()).addGroup(
						jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel6)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(23, 23, 23).addComponent(persistentRadioButton)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(
								jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(ephimeralRadioButton).addComponent(createNodeButton)
										.addComponent(sequentialCheckBox))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel6)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
						.addContainerGap()));

		javax.swing.GroupLayout createNodePaneLayout = new javax.swing.GroupLayout(createNodePane);
		createNodePane.setLayout(createNodePaneLayout);
		createNodePaneLayout.setHorizontalGroup(
				createNodePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		createNodePaneLayout.setVerticalGroup(
				createNodePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		tabbedPane.addTab("Create Node", createNodePane);

		deleteNodeButton.setText("Delete Node");
		deleteNodeButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				deleteNodeButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout deleteDataPanelLayout = new javax.swing.GroupLayout(deleteDataPanel);
		deleteDataPanel.setLayout(deleteDataPanelLayout);
		deleteDataPanelLayout.setHorizontalGroup(
				deleteDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						deleteDataPanelLayout.createSequentialGroup().addGap(21, 21, 21).addComponent(deleteNodeButton)
								.addContainerGap(626, Short.MAX_VALUE)));
		deleteDataPanelLayout.setVerticalGroup(
				deleteDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						deleteDataPanelLayout.createSequentialGroup().addGap(21, 21, 21).addComponent(deleteNodeButton)
								.addContainerGap(449, Short.MAX_VALUE)));

		tabbedPane.addTab("Delete Node", deleteDataPanel);

		aclInfoTextArea.setBackground(new java.awt.Color(0, 0, 0));
		aclInfoTextArea.setColumns(20);
		aclInfoTextArea.setForeground(new java.awt.Color(255, 255, 255));
		aclInfoTextArea.setLineWrap(true);
		aclInfoTextArea.setRows(5);
		jScrollPane3.setViewportView(aclInfoTextArea);

		getACLInfoButton.setText("Get ACL Info");
		getACLInfoButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				getACLInfoButtonActionPerformed(evt);
			}
		});

		updateACLInfoButton.setText("Update ACL");
		updateACLInfoButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				updateACLInfoButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout aclPanelLayout = new javax.swing.GroupLayout(aclPanel);
		aclPanel.setLayout(aclPanelLayout);
		aclPanelLayout.setHorizontalGroup(aclPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(aclPanelLayout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
						.addContainerGap()).addGroup(
						aclPanelLayout.createSequentialGroup().addGap(2, 2, 2).addComponent(getACLInfoButton)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(updateACLInfoButton)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		aclPanelLayout.setVerticalGroup(aclPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(aclPanelLayout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(
								aclPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(updateACLInfoButton).addComponent(getACLInfoButton))
						.addContainerGap()));

		tabbedPane.addTab("ACL", aclPanel);

		commandTextArea.setBackground(new java.awt.Color(0, 0, 0));
		commandTextArea.setColumns(20);
		commandTextArea.setForeground(new java.awt.Color(255, 255, 255));
		commandTextArea.setLineWrap(true);
		commandTextArea.setRows(5);
		commandTextArea.setText(
				"zookeeper can be monitored and controlled via a few commands. the commands are all four letter words that are sent to the port 2181 using netcat or telnet. the commands are:\n\ndump : (on the leader) list sessions and ephemeral nodes\nenvi :print server environment details\nkill : stop the server\nreqs : list outstanding requests\nruok : check for errors. responds \"imok\" if running, nothing otherwise\nsrst : reset statistics\nstat : list performance and client statistics");
		jScrollPane6.setViewportView(commandTextArea);

		commandComboBox.setEditable(true);
		commandComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[]{"srvr", "dump", "envi", "kill", "reqs", "ruok", "srst", "stat", "conf", "cons", "crst",
						"wchc", "wchs", "wchp", "mntr"}));
		commandComboBox.setToolTipText(
				"zookeeper can be monitored and controlled via a few commands. the commands are all four letter words that are sent to the port 2181 using netcat or telnet. the commands are:\n\ndump \n(on the leader) list sessions and ephemeral nodes\n\nenvi \nprint server environment details\n\nkill \nstop the server\n\nreqs \nlist outstanding requests\n\nruok \ncheck for errors. responds \"imok\" if running, nothing otherwise\n\nsrst \nreset statistics\n\nstat \nlist performance and client statistics");

		getCommandInfo.setText("Get Info");
		getCommandInfo.setToolTipText("");
		getCommandInfo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				getCommandInfoActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout commandPanelLayout = new javax.swing.GroupLayout(commandPanel);
		commandPanel.setLayout(commandPanelLayout);
		commandPanelLayout.setHorizontalGroup(
				commandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						commandPanelLayout.createSequentialGroup().addContainerGap().addGroup(
								commandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 756,
												Short.MAX_VALUE).addGroup(commandPanelLayout.createSequentialGroup()
										.addComponent(commandComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(getCommandInfo))).addContainerGap()));
		commandPanelLayout.setVerticalGroup(
				commandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						commandPanelLayout.createSequentialGroup().addGap(12, 12, 12).addGroup(
								commandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(commandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(getCommandInfo))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 419,
										javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(27, Short.MAX_VALUE)));

		tabbedPane.addTab("command", commandPanel);

		sessionTimeOut.setText("15000");

		sessionTimeoutLabel.setText("Session Timeout");

		jLabel7.setText("Ping Timeout");

		pingTimeout.setText("5000");

		javax.swing.GroupLayout configPanelLayout = new javax.swing.GroupLayout(configPanel);
		configPanel.setLayout(configPanelLayout);
		configPanelLayout.setHorizontalGroup(
				configPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						configPanelLayout.createSequentialGroup().addGap(17, 17, 17).addGroup(
								configPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(sessionTimeoutLabel).addComponent(jLabel7))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(
								configPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(sessionTimeOut, javax.swing.GroupLayout.DEFAULT_SIZE, 157,
												Short.MAX_VALUE).addComponent(pingTimeout))
								.addContainerGap(484, Short.MAX_VALUE)));
		configPanelLayout.setVerticalGroup(
				configPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						configPanelLayout.createSequentialGroup().addContainerGap().addGroup(
								configPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(sessionTimeoutLabel)
										.addComponent(sessionTimeOut, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(
								configPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel7)
										.addComponent(pingTimeout, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(435, Short.MAX_VALUE)));

		tabbedPane.addTab("Config", configPanel);

		disconnectClient.setText("Disconnect Client");
		disconnectClient.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				disconnectClientActionPerformed(evt);
			}
		});

		reconnectClientButton.setText("Reconnect Client");
		reconnectClientButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				reconnectClientButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout handlePanelLayout = new javax.swing.GroupLayout(handlePanel);
		handlePanel.setLayout(handlePanelLayout);
		handlePanelLayout.setHorizontalGroup(
				handlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						handlePanelLayout.createSequentialGroup().addContainerGap().addGroup(
								handlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(disconnectClient, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(reconnectClientButton, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap(606, Short.MAX_VALUE)));
		handlePanelLayout.setVerticalGroup(
				handlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						handlePanelLayout.createSequentialGroup().addContainerGap().addComponent(disconnectClient)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(reconnectClientButton).addContainerGap(429, Short.MAX_VALUE)));

		tabbedPane.addTab("Handle", handlePanel);

		ipAddressComboBox.setBackground(new java.awt.Color(204, 204, 255));
		ipAddressComboBox.setEditable(true);
		ipAddressComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[]{"127.0.0.1", "localhost", "10.34.234.208", "10.32.189.244"}));
		ipAddressComboBox.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				ipAddressComboBoxItemStateChanged(evt);
			}
		});
		ipAddressComboBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ipAddressComboBoxActionPerformed(evt);
			}
		});

		ipAddressLabel.setText("IP Address");

		portComboBox.setEditable(true);
		portComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"2181", "2182", "2183"}));

		pathComboBox.setEditable(true);
		pathComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[]{"/", "/kafka/consumers", "/kafka/brokers", "/consumers//offsets/",
						"/kafka/brokers/topics//partitions//state", "/kafka/admin/", "/hbase/master",
						"/hbase/backup-masters", "/hbase/replication/rs", "/hbase/rs", "/hbase/table",
						"/maverick-storm-prod", "/maverick-storm-prod/supervisors", "/maverick-storm-prod/errors"}));

		portLabel.setText("Port");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addGroup(
						layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								layout.createSequentialGroup().addGroup(
										layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
												layout.createSequentialGroup().addComponent(ipAddressLabel)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(ipAddressComboBox, 0,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(portLabel).addPreferredGap(
														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(portComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE, 139,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(pathComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)).addGap(15, 15, 15))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addComponent(tabbedPane).addContainerGap()))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(ipAddressLabel)
								.addComponent(ipAddressComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(portComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(portLabel))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(pathComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(tabbedPane)
						.addContainerGap()));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>

	private void ipAddressComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void tabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {

	}

	private void fetchChildrenButtonActionPerformed(java.awt.event.ActionEvent evt) {
		String ipAddress = ipAddressComboBox.getSelectedItem().toString().trim();
		String port = portComboBox.getSelectedItem().toString().trim();
		String path = pathComboBox.getSelectedItem().toString().trim();
		Integer sessionTimeout = Integer.parseInt(sessionTimeOut.getText().trim());
		Integer depth = Integer.parseInt(depthComboBox.getSelectedItem().toString());
		createConfig = new ClientCreateConfig(ipAddress, port, sessionTimeout);
		String childrenData = "";

		try {
			zookeeperFacade = new ZookeeperFacadeImpl(createConfig);
			childrenData = zookeeperFacade.getChildrenUptoDepth(path, depth);
			childrenTextArea.setText(childrenData);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Exception Occured" + e.getMessage(), 1);
		}
	}

	private void fetchDataActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			zookeeperFacade = new ZookeeperFacadeImpl(createConfig);
			String path = pathComboBox.getSelectedItem().toString().trim();
			String data = "";
			if (addWatchOnFetchCheckBox.isSelected()) {
				data = new String(zookeeperFacade.getDataWithWatch(path));
			}
			else {
				data = zookeeperFacade.getStringData(path);
			}

			Stat stat = zookeeperFacade.getStat(path);
			getDataTextArea.setText(data);
			versionTextArea.setText(String.valueOf(stat.getVersion()));
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Exception Occured" + e.getMessage(), 1);
		}
	}

	private void getStatButtonActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			zookeeperFacade = new ZookeeperFacadeImpl(createConfig);
			String data = zookeeperFacade.getStatMap(pathComboBox.getSelectedItem().toString());
			getStatTextArea.setText(data);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Exception Occured" + e.getMessage(), 1);
		}
	}

	private void pingButtonActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			String ipAddress = ipAddressComboBox.getSelectedItem().toString();
			InetAddress host = InetAddress.getByName(ipAddress);
			if (host.isReachable(Integer.parseInt(pingTimeout.getText().trim())))
				JOptionPane.showMessageDialog(null, "Host is reachable");
			else
				JOptionPane.showMessageDialog(null, "Host is not reachable");
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Exception Occured" + e.getMessage(), 1);
		}

	}

	private void updateDataButtonActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			zookeeperFacade = new ZookeeperFacadeImpl(createConfig);
			String path = pathComboBox.getSelectedItem().toString().trim();
			String data = getDataTextArea.getText();
			Integer version = Integer.valueOf(versionTextArea.getText().trim());
			zookeeperFacade.updateData(path, data, version);
			getStatTextArea.setText(data);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Exception Occured" + e.getMessage(), 1);
		}
	}

	private void createNodeButtonActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			zookeeperFacade = new ZookeeperFacadeImpl(createConfig);
			String path = pathComboBox.getSelectedItem().toString().trim();
			String data = createNodeTextArea.getText();
			ZNodeType nodeType = null;
			if (persistentRadioButton.isSelected()) {
				nodeType = ZNodeType.PERSISTENT;
				if (sequentialCheckBox.isSelected()) {
					nodeType = ZNodeType.PERSISTENT_SEQUENTIAL;
				}
			}
			else {
				nodeType = ZNodeType.EPHEMERAL;
				if (sequentialCheckBox.isSelected()) {
					nodeType = ZNodeType.EPHEMERAL_SEQUENTIAL;
				}
			}
			zookeeperFacade.create(path, data.getBytes(), ACL.OPEN_ACL_UNSAFE, nodeType);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Exception Occured" + e.getMessage(), 1);
		}
	}

	private void deleteNodeButtonActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			zookeeperFacade = new ZookeeperFacadeImpl(createConfig);
			String path = pathComboBox.getSelectedItem().toString().trim();
			zookeeperFacade.deleteData(path);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Exception Occured" + e.getMessage(), 1);
		}
	}

	private void getACLInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			zookeeperFacade = new ZookeeperFacadeImpl(createConfig);
			String path = pathComboBox.getSelectedItem().toString().trim();
			String aclInfo = zookeeperFacade.getACLInfo(path);
			aclInfoTextArea.setText(aclInfo);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Exception Occured" + e.getMessage(), 1);
		}
	}

	private void disconnectClientActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if (zookeeperFacade != null) {
				zookeeperFacade.stop();
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Exception Occured" + e.getMessage(), 1);
		}
	}

	private void updateACLInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void getCommandInfoActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			commandTextArea.setText(zookeeperFacade.getCommandInfo(commandComboBox.getSelectedItem().toString()));
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Exception Occured" + e.getMessage(), 1);
		}
	}

	private void reconnectClientButtonActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			zookeeperFacade.reconnect();
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Exception Occured" + e.getMessage(), 1);
		}
	}

	private void ipAddressComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {
		try {
			String ipAddress = ipAddressComboBox.getSelectedItem().toString().trim();
			String port = portComboBox.getSelectedItem().toString().trim();
			Integer sessionTimeout = Integer.parseInt(sessionTimeOut.getText().trim());
			createConfig = new ClientCreateConfig(ipAddress, port, sessionTimeout);
			zookeeperFacade.stop();
			ClientProvider.destroyClient();
			ClientProvider.getClient(ipAddress, port, sessionTimeout);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Exception Occured" + e.getMessage(), 1);
		}
	}
	// End of variables declaration
}
