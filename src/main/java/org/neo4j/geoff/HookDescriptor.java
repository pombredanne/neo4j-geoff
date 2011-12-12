/**
 * Copyright (c) 2002-2011 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.geoff;

import java.util.Map;

/**
 * Represents a Hook reference plus associated data, e.g.:
 *
 * {foo} {"bar": 42}
 *
 */
public class HookDescriptor extends Descriptor {

	protected final HookRef hook;
	protected final Map<String, Object> data;

	protected HookDescriptor(HookRef hook, Map<String, Object> data) {
		this.hook = hook;
		this.data = data;

	}

	public HookRef getHook() {
		return this.hook;
	}

	/**
	 * Return the key:value pairs attached to this Descriptor
	 *
	 * @return Map of key:value pairs
	 */
	public Map<String, Object> getData() {
		return this.data;
	}

}