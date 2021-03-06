package com.mycompany.a3;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class CommandRobotCollision extends Command {
	private GameWorld gw;
	
	/**
	 * Constuctor for drone
	 * @param gw
	 */
	public CommandRobotCollision(GameWorld gw) {
		super("Collided with NPR");
		this.gw = gw;
	}
	
	/**
	 * override for action
	 */
	@Override
	public void actionPerformed(ActionEvent ev) {
		gw.robotCollision('r');
	}
}
