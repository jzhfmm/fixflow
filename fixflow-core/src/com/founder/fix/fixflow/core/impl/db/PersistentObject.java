/**
 * Copyright 1996-2013 Founder International Co.,Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author kenshin
 */
package com.founder.fix.fixflow.core.impl.db;

import java.io.Serializable;
import java.util.Map;

/**
 * @author kenshin
 */
public interface PersistentObject extends Serializable{
	
	/**
	 * 获取对象编号
	 * @return
	 */
	String getId();
	
	

	/**
	 * 获取对象数据
	 * @return
	 */
	Map<String, Object> getPersistentState();
	
	/**
	 * 获取对象数据Map
	 * @return
	 */
	Map<String, Object> getPersistentDbMap();
	
}
