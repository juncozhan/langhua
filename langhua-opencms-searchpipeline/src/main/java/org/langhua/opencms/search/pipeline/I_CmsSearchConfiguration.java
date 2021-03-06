/*
 * This library is part of OpenCms-SearchPipeline module of Langhua
 *
 * Copyright (C) 2009 Langhua Opensource Foundation (http://langhua.org)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For the latest version about this module, please see the
 * project website: http://langhua.org/portal/portal/default/OpenCms
 * 
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 *
 * For further information about Lucene, please see the
 * project website: http://lucene.apache.org
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.langhua.opencms.search.pipeline;

import java.util.List;
import java.util.Map;

import org.apache.lucene.search.SortField;

/**
 * The search pipeline configuration interface.
 * 
 * Please note, the implement of this interface should be initialized with Locale parameter.
 * 
 * @author Shi Yusen, shiys@langhua.cn
 * 
 */
public interface I_CmsSearchConfiguration {
	
	/**
	 * Get maximum number of pages which should be shown.
	 * 
	 * @return the maximum number of pages which should be shown
	 */
	int getDisplayPages();
	
	/**
	 * Get how many matched results will be displayed in one page from the configuration.
	 * 
	 * @return the max matched results number in one page
	 */
	int getMatchesPerPage();
	
	/**
	 * Get the sort field list. You can construct a 
	 * org.apache.lucene.search.SortField by new SortField(fieldname, fieldtype)
	 * 
	 * @return sort field list
	 */
	List<SortField> getSortFieldList();
	
	/**
	 * Get an available CmsSearchFilter map according to the query string.
	 * 
	 * @param query the query string
	 * @return the search filter list
	 */
	Map<String, CmsSearchFilter> getFilterMap();
	
	/**
	 * Get the default search field name.
	 * 
	 * @return the default search field name
	 */
	String getDefaultFieldName();
	
	/**
	 * Get search index according to the configuration of index name.
	 * 
	 * @return the CmsSearchIndex object
	 */
	String getSearchIndex();
}
