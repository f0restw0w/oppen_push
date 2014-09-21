/**
 * MyPacketTypeFilter.java
 * @author f0rest
 *
 * 2014年9月14日
 */
package org.oppen.push;

import org.jivesoftware.smack.filter.PacketTypeFilter;
import org.jivesoftware.smack.packet.Packet;

import android.util.Log;

/**
 * 
 */
public class MyPacketTypeFilter extends PacketTypeFilter {
	public static final String TAG = "MyPacketTypeFilter";

	/**
	 * @param packetType
	 */
	public MyPacketTypeFilter(Class packetType) {
		super(packetType);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jivesoftware.smack.filter.PacketTypeFilter#accept(org.jivesoftware
	 * .smack.packet.Packet)
	 */
	@Override
	public boolean accept(Packet packet) {
		// TODO Auto-generated method stub
		boolean b = super.accept(packet);
		if (b) {
			Log.i(TAG, "accept()");
			Log.i(TAG, "not accept()");
		}
		return false;
	}
}
