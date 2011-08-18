/*******************************************************************************
 *
 * Copyright (c) 2011  Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Martin Stockhammer - Initial API and implementation
 *
 *******************************************************************************/

package org.emona.model.types;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.emona.model.base.HostStateValue;
import org.emona.model.base.ServiceStateValue;

/**
 * 
 * This class provides information for flags used for certain attributes.
 * 
 * @author Martin Stockhammer
 * 
 */
public class FlagInformation {
	
	public static final Set<String> FLAG_TOKENS = new HashSet<String>();

	private Map<Integer, Flag> flags;

	public static final FlagInformation SERVICE_STATE_VALUE;
	public static final FlagInformation SERVICE_STATE_VALUE1;
	public static final FlagInformation SERVICE_STATE_VALUE2;
	public static final FlagInformation HOST_STATE_VALUE;
	public static final FlagInformation HOST_STATE_VALUE1;
	public static final FlagInformation HOST_STATE_VALUE2;
	public static final FlagInformation HOST_STATE_VALUE3;

	public static final Flag SERVICE_OK = new Flag("o",
			ServiceStateValue.OK_VALUE, "OK state");
	public static final Flag SERVICE_WARNING = new Flag("w",
			ServiceStateValue.WARNING_VALUE, "WARNING state");
	public static final Flag SERVICE_CRITICAL = new Flag("c",
			ServiceStateValue.CRITICAL_VALUE, "CRITICAL state");
	public static final Flag SERVICE_UNKNOWN = new Flag("u",
			ServiceStateValue.UNKNOWN_VALUE, "UNKNOWN state");
	public static final Flag SERVICE_PENDING = new Flag("p",
			ServiceStateValue.PENDING_VALUE, "PENDING state");
	public static final Flag SERVICE_NONE = new Flag("n",
			ServiceStateValue.NONE_VALUE, "No state at all.");
	public static final Flag SERVICE_FLAPPING = new Flag("f",
			ServiceStateValue.FLAPPING_VALUE, "FLAPPING state");

	public static final Flag HOST_UP = new Flag("o", HostStateValue.UP_VALUE,
			"UP State");
	public static final Flag HOST_RECOVERY = new Flag("r",
			HostStateValue.UP_VALUE, "Recovery to UP State");
	public static final Flag HOST_DOWN = new Flag("d",
			HostStateValue.DOWN_VALUE, "DOWN State");
	public static final Flag HOST_UNREACHABLE = new Flag("u",
			HostStateValue.UNREACHABLE_VALUE, "UNREACHABLE State");
	public static final Flag HOST_PENDING = new Flag("p",
			HostStateValue.PENDING_VALUE, "PENDING state");
	public static final Flag HOST_NONE = new Flag("n",
			HostStateValue.NONE_VALUE, "No state at all");
	public static final Flag HOST_FLAPPING = new Flag("f",
			HostStateValue.FLAPPING_VALUE, "FLAPPING state");
	public static final Flag HOST_SCHEDULEDDT = new Flag("s",
			HostStateValue.SCHEDULEDDOWNTIME_VALUE, "Scheduled downtime");

	static {
		SERVICE_STATE_VALUE = new FlagInformation();
		SERVICE_STATE_VALUE.add(SERVICE_OK).add(SERVICE_WARNING)
				.add(SERVICE_CRITICAL).add(SERVICE_UNKNOWN);
		SERVICE_STATE_VALUE1 = new FlagInformation();
		SERVICE_STATE_VALUE1.setFlags(SERVICE_STATE_VALUE.getFlags())
				.add(SERVICE_PENDING).add(SERVICE_NONE);
		SERVICE_STATE_VALUE2 = new FlagInformation();
		SERVICE_STATE_VALUE2.add(SERVICE_WARNING).add(SERVICE_CRITICAL)
				.add(SERVICE_UNKNOWN).add(SERVICE_FLAPPING).add(SERVICE_NONE);

		HOST_STATE_VALUE = new FlagInformation();
		HOST_STATE_VALUE.add(HOST_UP).add(HOST_DOWN).add(HOST_UNREACHABLE);

		HOST_STATE_VALUE1 = new FlagInformation();
		HOST_STATE_VALUE1.add(HOST_RECOVERY).add(HOST_DOWN)
				.add(HOST_UNREACHABLE);

		HOST_STATE_VALUE2 = new FlagInformation();
		HOST_STATE_VALUE2.add(HOST_UP).add(HOST_DOWN).add(HOST_UNREACHABLE)
				.add(HOST_PENDING).add(HOST_NONE);
		
		HOST_STATE_VALUE3 = new FlagInformation();
		HOST_STATE_VALUE3.add(HOST_RECOVERY).add(HOST_DOWN).add(HOST_UNREACHABLE).add(HOST_FLAPPING).add(HOST_SCHEDULEDDT).add(HOST_NONE);

	}

	public Collection<Flag> getFlags() {
		return flags.values();
	}
	
	public Map<Integer, Flag> getMap() {
		return flags;
	}

	public FlagInformation add(Flag flag) {
		if (flags == null) {
			flags = new TreeMap<Integer, Flag>();
		}
		flags.put(flag.getValue(), flag);
		FLAG_TOKENS.add(flag.getToken());
		return this;
	}

	public FlagInformation setFlags(Collection<Flag> flags) {
		this.flags = new TreeMap<Integer, Flag>();
		for (Flag flag : flags) {
			this.flags.put(flag.getValue(), flag);
			FLAG_TOKENS.add(flag.getToken());
		}
		return this;
	}

	public FlagInformation setFlags(Map<Integer, Flag> flags) {
		this.flags = new TreeMap<Integer, Flag>();
		for (Flag flag : flags.values()) {
			this.flags.put(flag.getValue(), flag);
		}
		return this;
	}

	
	public boolean containsFlag(int value) {
		return flags.containsKey(new Integer(value));
	}

	
	@Override
	public FlagInformation clone() {
		FlagInformation myclone = new FlagInformation();
		myclone.setFlags(this.flags);
		return myclone;
	}
}
