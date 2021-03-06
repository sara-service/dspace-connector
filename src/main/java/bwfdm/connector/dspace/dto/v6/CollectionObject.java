/*
 * Unless expressly otherwise stated, code from this project is licensed under the MIT license [https://opensource.org/licenses/MIT].
 * 
 * Copyright (c) <2018> <Volodymyr Kushnarenko, Stefan Kombrink, Markus Gärtner, Florian Fritze, Matthias Fratz, Daniel Scharon, Sibylle Hermann, Franziska Rapp and Uli Hahn>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), 
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH 
 * THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package bwfdm.connector.dspace.dto.v6;

import java.util.List;

/**
 * 
 * @author Volodymyr Kushnarenko
 */
public class CollectionObject {

	public String uuid;
	public String name;
	public String handle;
	public String type;
	public String link;
	public List<String> expand;
	public String logo;
	public String parentCommunity;
	public List<String> parentCommunityList;
	public List<String> items;
	public String license;
	public String copyrightText;
	public String introductoryText;
	public String shortDescription;
	public String sidebarText;
	public String numberItems;

	// {
	// "uuid" : "399e769f-faca-4955-8796-824670669c33",
	// "name" : "test-collection",
	// "handle" : "123456789/512",
	// "type" : "collection",
	// "expand" : [ "parentCommunityList", "parentCommunity", "items",
	// "license", "logo", "all" ],
	// "logo" : null,
	// "parentCommunity" : null,
	// "parentCommunityList" : [ ],
	// "items" : [ ],
	// "license" : null,
	// "copyrightText" : "",
	// "introductoryText" : "",
	// "shortDescription" : "",
	// "sidebarText" : "",
	// "numberItems" : 0,
	// "link" : "/rest/collections/399e769f-faca-4955-8796-824670669c33"
	// }

}
