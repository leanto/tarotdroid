/*
	This file is part of the Android application TarotDroid.
 	
	TarotDroid is free software: you can redistribute it and/or modify
 	it under the terms of the GNU General Public License as published by
 	the Free Software Foundation, either version 3 of the License, or
 	(at your option) any later version.
 	
 	TarotDroid is distributed in the hope that it will be useful,
 	but WITHOUT ANY WARRANTY; without even the implied warranty of
 	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 	GNU General Public License for more details.
 	
 	You should have received a copy of the GNU General Public License
 	along with TarotDroid. If not, see <http://www.gnu.org/licenses/>.
*/
package org.nla.tarotdroid.lib.ui;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;

/**
 * Activity to aknowledge removal of game.
 * @author Nicolas LAURENT daffycricket<a>yahoo.fr
 */
public class NotificationActivity extends SherlockActivity
{
	
	/* (non-Javadoc)
	 * @see greendroid.app.GDActivity#onCreate(android.os.Bundle)
	 */
	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.finish();
	}
}